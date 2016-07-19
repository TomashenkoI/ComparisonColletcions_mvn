package ua.goit.java;


/**
 * Created by 7 on 18.07.2016.
 */
public class HashSet {

    public static String setType = "Hash";
    public static java.util.HashSet<Integer> hashSet = new java.util.HashSet<>();
    public static ImplementationForEachSetCase implementationForEachSetCase = new ImplementationForEachSetCase();

    public static void run(int count, String volume) {

        implementationForEachSetCase.implementation(setType ,volume, count, hashSet);

    }
}
