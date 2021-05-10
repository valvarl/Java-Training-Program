package PracticalPart;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        if (10 <= arraySize) {
            ArrayList<Integer> intArray = new ArrayList<>();
            for (int i = 1; i < arraySize + 1; ++i) intArray.add(i);
            System.out.println(intArray.toString());
            intArray.remove((int) (Math.random() * (intArray.size())));
            System.out.println(intArray.toString());

            int random_seed = (int) (Math.random() * 100);
            for (int i = 0; i < intArray.size(); ++i) {
                random_seed = ((random_seed + 13) * 7) % intArray.size();
                int temp = intArray.get(random_seed);
                intArray.set(random_seed, intArray.get(i));
                intArray.set(i, temp);
            }
            System.out.println(intArray.toString());

            int sum = 0;
            for (int i : intArray) sum += i;
            System.out.println("Missing element: " + (arraySize*(arraySize+1)/2 - sum));
        }
    }
}
