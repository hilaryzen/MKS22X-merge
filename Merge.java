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
  }

  public static void merge(int[] data, int[] first, int[] second) {
    int firstI = 0;
    int secondI = 0;
    for (int i = 0; i < data.length; i++) {
      if (firstI = first.length) {
        data[i] = second[secondI];
        secondI++;
      } else if (secondI = second.length) {
        data[i] = first[firstI];
        firstI++;
      } else {
        if (first[firstI] < second[secondI]) {
          data[i] = first[firstI];
        } else {
          data[i] = second[secondI];
        }
      }
    }
  }
}
