package ua.goit.java;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachListCase {

    public static void implementation (String collectionType , String volume, int count, List list, ListIterator<Integer> listIterator) {

        CollectionMethods collectionMethods = new CollectionMethods();
        System.out.println("Time for each " + collectionType + "List's method, with the volume " + volume + " : ");

        double timeForMethodAdd = collectionMethods.listAddTime(count, list);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForMethodGet = collectionMethods.listGetTime(count, list);
        System.out.println("Time for method .get(): " + timeForMethodGet + "ms");

        double timeForListIteratorAdd = collectionMethods.listIteratorAddTime(list, listIterator);
        System.out.println("Time for method ListIterator .add(): " + timeForListIteratorAdd + "ms");

        double timeForListIteratorRemove = collectionMethods.listIteratorRemoveTime(list, listIterator);
        System.out.println("Time for method ListIterator .remove(): " + timeForListIteratorRemove + "ms");

        double timeForMethodContains = collectionMethods.listContainsTime(list);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = collectionMethods.listRemoveTime(count, list);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");

        double timeForMethodPopulate = collectionMethods.listPopulateTime(list);
        System.out.println("Time for method .populate(): " + timeForMethodPopulate + "ms");
    }

}
