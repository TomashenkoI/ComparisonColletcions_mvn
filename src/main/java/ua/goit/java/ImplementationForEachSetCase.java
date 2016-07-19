package ua.goit.java;

import java.util.Set;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachSetCase {

    public static void implementation (String setType, String volume, int count, Set set) {

        CollectionMethods collectionMethods = new CollectionMethods();
        System.out.println("Time for each " + setType + "Set's method, with the volume " + volume + " : ");

        double timeForMethodAdd = collectionMethods.listAddTime(count, set);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForMethodContains = collectionMethods.listContainsTime(set);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = collectionMethods.listRemoveTime(count, set);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");

        double timeForMethodPopulate = collectionMethods.listPopulateTime(set);
        System.out.println("Time for method .populate(): " + timeForMethodPopulate + "ms");
    }
}
