import java.util.Arrays;

public class Merge {
  public static void mergesort(int[] data) {

  }

  public static void mergeH(int[] data) {
    //Split data into two halves
    int mid = data.length / 2;
    int[] first = new int[mid];
    int[] second = new int[data.length - mid];
    for (int i = 0; i < mid; i++) {
      first[i] = data[i];
    }
    for (int j = mid; j < data.length; j++) {
      second[j - mid] = data[j];
    }
    //System.out.println(Arrays.toString(first));
    //System.out.println(Arrays.toString(second));

    //If the arrays are more than one number, use merge to sort them
    if (first.length > 1) {
      mergeH(first);
    }
    if (second.length > 1) {
      mergeH(second);
    }

    //Combine sorted arrays into one
  }
}
