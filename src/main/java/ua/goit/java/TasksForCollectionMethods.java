package ua.goit.java;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 7 on 18.07.2016.
 */
public class TasksForCollectionMethods {

    public static void fillTheCollection(int count, Collection collection) {

        for (int j = 0; j < count; j++) {
            collection.add(j);
        }
    }

    public static void addNewElementToCollection(int theNumberOfAttempts, Collection collection, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            collection.add(0);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static double averageTimeForMethodExecution(double[] usedTime, double allElapsedTime, int theNumberOfAttempts) {

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    public static void getAnElementFromTheCollection(int count, int theNumberOfAttempts, List collection, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            for (int j = count; j < count + theNumberOfAttempts; j++) {
                collection.get(j);
            }

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static void findAnElementInTheCollection(int theNumberOfAttempts, Collection list, double[] usedTime) {

        list.add(0666);

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            list.contains(0666);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static void removeElementsFromTheCollection(int theNumberOfAttempts, Collection collection, int count, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            collection.remove(count - i);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static void useTheIterator(int theNumberOfAttempts, List list, ListIterator listIterator, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            listIterator = list.listIterator();

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static void useIteratorRemove(int theNumberOfAttempts, List list, ListIterator listIterator, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            listIterator = list.listIterator();

            double startTime = System.nanoTime();

            while (!listIterator.hasNext()) {
                listIterator.remove();
            }

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

    public static void populateNewCollection(int theNumberOfAttempts, Collection collection, Collection collection1, double[] usedTime) {

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            collection1 = collection;

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }
    }

}
