package me.andredezzy.exercisesrunner.runner.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerManager {

    public static List<String> getPackagesAt(String fatherPackage) {
        List<String> packageNames = new ArrayList<String>();

        for (Package packagez : Package.getPackages()) {
            String packagezName = packagez.getName();

            if (packagezName.startsWith(fatherPackage)) {
                packageNames.add(packagezName);
            }
        }

        return packageNames;
    }
}
