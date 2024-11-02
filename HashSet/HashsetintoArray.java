import java.util.HashSet;

public class HashsetintoArray {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        // Convert HashSet to Integer array
        Integer[] integerArray = hs.toArray(new Integer[0]);

        // Convert Integer array to int array
        int[] intArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }

        // Display the int array elements
        System.out.println("Array elements:");
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
