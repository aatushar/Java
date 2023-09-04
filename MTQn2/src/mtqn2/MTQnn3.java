package mtqnn3;




public class MTQnn3 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 5, 8, 2, 10, 3 };
        Double[] doubleArray = { 3.14, 1.618, 2.718, 0.577 };
        String[] stringArray = { "apple", "banana", "cherry", "date" };

        System.out.println("Maximum Integer: " + findMax(intArray));
        System.out.println("Maximum Double: " + findMax(doubleArray));
        System.out.println("Maximum String: " + findMax(stringArray));
    }
}
