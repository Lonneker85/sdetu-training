package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // LinkedHash - in order that they were entered
        // HashSet - complete random order
        // TreeSet - alphabetical / numerical order
        // 1. Define the collection
        Set<String> animals = new TreeSet<>();

        // 2. Adding elements
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");
        // System.out.println(animals.size() + " " + animals);

        animals.add("cat");
        animals.add("snake");
        animals.add("goose");

        System.out.println(animals.size() + " " + animals);

        // Create a new set that we can use for comparison
        Set<String> farmAnimals = new HashSet<>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        // What is the INTERSECTION (only animals and farm animals "AND")
        // 1. Copy existing set into a new set
        Set<String> intersectionSet = new HashSet<>(animals);
        // System.out.println(intersectionSet);

        // 2. Retain ONLY the elements tahr are also in the other set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intersectionSet);

        // What is the UNION (in both animals and farm animals "OR")
        Set<String> unionSet = new HashSet<>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        // What is the DIFFERENCE (animals but NOT farm animals - in 1 but NOT in the other)
        Set<String> differenceSet = new HashSet<>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is " + differenceSet);

    }
}
