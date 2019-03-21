import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int[] data1 = {3, 6, 2, 0, 7, 19, -3};
    Merge.mergesort(data1);
    System.out.println(Arrays.toString(data1));

    int[] data2 = {8, 1, 20, 8, 5, -9, -100, 8};
    Merge.mergesort(data2);
    System.out.println(Arrays.toString(data2));

    /*
    int[] merge1 = {0, 4, 15, 16, 23};
    int[] merge2 = {2, 3, 8, 19, 24, 34, 36};
    int[] data = {4, 8, 34, 0, 2, 23, 15, 24, 3, 19, 36, 16};
    Merge.merge(data, merge1, merge2);

    System.out.println(" ");

    System.out.println("Testing insertion: ");
    int[] data3 = {4, 8, 34, 0, 2, 23, 15, 24, 3, 19, 36, 16};
    System.out.println(Arrays.toString(data3));
    Merge.insertion(data3, 3, 11);
    */
  }
}
