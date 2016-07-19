package ua.goit.java;

/**
 * Created by 7 on 18.07.2016.
 */
public class Runner {
    public static void main(String[] args) {

        new ArrayList().run(10000, "10k");
        new ArrayList().run(100000, "100k");
        new ArrayList().run(1000000, "1000k");

        new HashSet().run(10000, "10k");
        new HashSet().run(100000, "100k");
        new HashSet().run(1000000, "1000k");

        new LinkedList().run(10000, "10k");
        new LinkedList().run(100000, "100k");
        new LinkedList().run(1000000, "1000k");

        new TreeSet().run(10000, "10k");
        new TreeSet().run(100000, "100k");
        new TreeSet().run(1000000, "1000k");
    }
}
