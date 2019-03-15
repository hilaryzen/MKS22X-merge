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
  }
}
