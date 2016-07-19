package ua.goit.java;

import java.util.ListIterator;

/**
 * Created by 7 on 18.07.2016.
 */
public class LinkedList {

    public static String typeOfList = "Linked";
    public static ImplementationForEachListCase implementationForEachListCase = new ImplementationForEachListCase();
    public static java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
    public static ListIterator<Integer> listIterator = null;

    public static void run(int count, String volume) {

        implementationForEachListCase.implementation(typeOfList ,volume, count, linkedList, listIterator);

    }
}
