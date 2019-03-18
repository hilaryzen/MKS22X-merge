import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int[] data1 = {3, 6, 2, 0, 7, 19, -3};
    Merge.mergeH(data1);
    System.out.println(Arrays.toString(data1));

    int[] data2 = {8, 1, 20, 5, -9, -100};
    Merge.mergeH(data2);
    System.out.println(Arrays.toString(data2));

    int[] merge1 = {0, 4, 15, 16, 23};
    int[] merge2 = {2, 3, 8, 19, 24, 34, 36};
    int[] data = {4, 8, 34, 0, 2, 23, 15, 24, 3, 19, 36, 16};
    Merge.merge(data, merge1, merge2);
  }
}
