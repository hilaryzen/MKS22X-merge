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

    //Combines two sorted arrays into one
    merge(data, first, second);

    //System.out.println(Arrays.toString(data));
  }

  public static void merge(int[] data, int[] first, int[] second) {
    int firstI = 0;
    int secondI = 0;
    for (int i = 0; i < data.length; i++) {
      if (firstI == first.length) {
        data[i] = second[secondI];
        secondI++;
      } else if (secondI == second.length) {
        data[i] = first[firstI];
        firstI++;
      } else {
        if (first[firstI] < second[secondI]) {
          data[i] = first[firstI];
          firstI++;
        } else {
          data[i] = second[secondI];
          secondI++;
        }
      }
    }
    //System.out.println(Arrays.toString(data));
  }

  public static void insertion(int[] data, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++) {
      int value = data[i];
      int j = 1;
      while (i - j >= 0 && value < data[i - j]) {
        data[i - j + 1] = data[i - j];
        j++;
      }
      data[i - j + 1] = value;
      System.out.println(Arrays.toString(data));
    }
    //System.out.println(Arrays.toString(data));
  }
}
