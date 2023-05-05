public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 5};
        int[] arr2 = {6, 4, 3, 2, 1};
        int[] change = new int[arr2.length + arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            change[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            change[arr1.length + 1] = arr2[i];
        }
        for (int i = 0; i < change.length; i++) {
            System.out.println(change[i]+" ");
        }
    }
}
