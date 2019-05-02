package me.andredezzy.exercisesrunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import me.andredezzy.exercisesrunner.exercises.three.One;
import me.andredezzy.exercisesrunner.runner.Runner;
import me.andredezzy.exercisesrunner.runner.RunnerImpl;
import me.andredezzy.exercisesrunner.utils.asker.AskerImpl;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

public class Application {

    public static Reflections REFLECTIONS;
    public static final AskerImpl ASKER;
    
    public static final String EXERCISES_PACKAGE;

    static {
        EXERCISES_PACKAGE = "me.andredezzy.exercisesrunner.exercises.";
        ASKER = new AskerImpl();
    }

    public static void main(String[] args) throws Exception {
        Application.loadPackage(EXERCISES_PACKAGE);

        Runner runner = new RunnerImpl();
        runner.run(EXERCISES_PACKAGE, args);
    }

    private static void loadPackage(String packagez) {
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        REFLECTIONS = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packagez))));

        Set<Class<? extends Object>> allClasses
                = REFLECTIONS.getSubTypesOf(Object.class);
    }
}
