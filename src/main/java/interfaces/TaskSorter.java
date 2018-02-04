package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSorter {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Do your homework", 4));
        tasks.add(new Task(2, "Brush your teeth", 2));
        tasks.add(new Task(3, "Take a shower twive a week", 1));
        tasks.add(new Task(4, "Be nice with your siblings", 4));
        tasks.add(new Task(5, "clean up your room", 3));

        // Java 7 or below format
//        for ( Task t : tasks) {
//        	System.out.println(t);
//        }
        // Java 8 format
        tasks.forEach(System.out::println);

        Collections.sort(tasks);
        System.out.println("After natural sort:");
        tasks.forEach(System.out::println);
    }
}
