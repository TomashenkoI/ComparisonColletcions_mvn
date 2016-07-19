package ua.goit.java;

/**
 * Created by 7 on 18.07.2016.
 */
public class TreeSet {

    public static String setType = "Tree";
    public static ImplementationForEachSetCase implementationForEachSetCase = new ImplementationForEachSetCase();
    public static java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();


    public static void run(int count, String volume) {

        implementationForEachSetCase.implementation(setType, volume, count, treeSet);

    }
}
