package ua.goit.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class CollectionMethods {

    public TasksForCollectionMethods tasksForCollectionMethods = new TasksForCollectionMethods();
    public static int theNumberOfAttempts = 100;


    public double listAddTime(int count, Collection arrayList) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.fillTheCollection(count, arrayList);

        tasksForCollectionMethods.addNewElementToCollection(theNumberOfAttempts, arrayList, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }


    public double listGetTime(int count, List arrayList) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.getAnElementFromTheCollection(count, theNumberOfAttempts, arrayList, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }

    public double listContainsTime(Collection arrayList) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.findAnElementInTheCollection(theNumberOfAttempts, arrayList, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }

    double listRemoveTime(int count, Collection arrayList) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.removeElementsFromTheCollection(theNumberOfAttempts, arrayList, count, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }

    double listIteratorAddTime(List<Integer> arrayList, ListIterator<Integer> listIterator) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.useTheIterator(theNumberOfAttempts, arrayList, listIterator, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }

    double listIteratorRemoveTime(List<Integer> arrayList, ListIterator<Integer> listIterator) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        tasksForCollectionMethods.useIteratorRemove(theNumberOfAttempts, arrayList, listIterator, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }

    double listPopulateTime(Collection arrayList) {

        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        tasksForCollectionMethods.populateNewCollection(theNumberOfAttempts, arrayList, arrayList1, usedTime);

        return tasksForCollectionMethods.averageTimeForMethodExecution(usedTime, allElapsedTime, theNumberOfAttempts);
    }
}
