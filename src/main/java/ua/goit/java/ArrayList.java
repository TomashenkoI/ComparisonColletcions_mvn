package ua.goit.java;

import java.util.ListIterator;

/**
 * Created by 7 on 18.07.2016.
 */
public class ArrayList {

    public static String typeOfList = "Array";
    public static ImplementationForEachListCase implementationForEachListCase = new ImplementationForEachListCase();
    public static java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
    public static ListIterator<Integer> listIterator = null;

    public static void run(int count, String volume) {

        implementationForEachListCase.implementation(typeOfList,volume, count, arrayList, listIterator);

    }
}
