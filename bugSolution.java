public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) { //check for null or empty arrays
            System.out.println(arr[arr.length -1 ]); //Access the last valid index
        } else {
            System.out.println("Array is empty!");
        }
    }
}