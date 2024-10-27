public class TimedArray {

    public static void main(String[] args) throws InterruptedException {
        // Array of 15 elements
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Loop through the array in steps of 3
        for (int i = 0; i < array.length; i=i+3) {
            // Print elements one by one, checking if each index is within bounds
            if (i < array.length) {
                System.out.println(array[i]);
            }
            if (i + 1 < array.length) {
                System.out.println(  array[i + 1]);
            }
            if (i + 2 < array.length) {
                System.out.println(array[i + 2]);
            }
            

            Thread.sleep(2000); // Pause for 2000 milliseconds or 2 seconds
        }
    }
}
