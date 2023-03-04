package kenchang8787.com.Sorting;

import java.util.Arrays;

/**
 * 合併排序法 (Merge Sort)
 *
 * <p>把陣列的每個值都拆成長度為1的陣列, 兩兩排序後合併
 *
 * <p>這裡的實作並沒有真的把陣列拆掉, 而是用left, right兩個索引來代表陣列的起迄
 */
public class MergeSort implements ISortable {
  @Override
  public int[] sort(int... input) {

    if (input == null) return null;

    sort(input, 0, input.length - 1);

    return input;
  }

  void sort(int[] arr, int left, int right) {

    // 此遞迴會做到當陣列長度剩下2
    if (left < right) {

      // 尋找中心點
      int mid = left + (right - left) / 2;

      // 繼續排序中心點左邊的陣列
      sort(arr, left, mid);
      // 繼續排序中心點右邊的陣列
      sort(arr, mid + 1, right);

      // Merge the sorted halves
      merge(arr, left, mid, right);
    }
  }

  void merge(int[] arr, int left, int mid, int right) {

    // 因為等等要宣告暫存陣列, 故先把欲合併的兩個陣列"長度"給求出來
    int sizeLeft = mid - left + 1;
    int sizeRight = right - mid;

    // 宣告暫存陣列, 儲存左右兩個陣列的值
    int[] arrayLeft = new int[sizeLeft];
    int[] arrayRight = new int[sizeRight];
    // 這邊的行為等於把欲排序的陣列, 從arr中抽出
    // 因為之前的行為中, 都只是利用索引來標註左右陣列而已
    System.arraycopy(arr, left, arrayLeft, 0, sizeLeft);
    System.arraycopy(arr, mid + 1, arrayRight, 0, sizeRight);

    // 將左右兩陣列索引值排序後填入arr
    // i=左陣列索引, j=右陣列索引, k=arr陣列索引
    // 注意這邊的迴圈停止條件, 只要其中一個陣列達索引上限則離開迴圈
    // 故還須倚靠下面兩個迴圈才能將所有值正確回填arr
    int i = 0, j = 0, k = left;

    while (i < sizeLeft && j < sizeRight) {

      if (arrayLeft[i] <= arrayRight[j]) {
        arr[k] = arrayLeft[i];
        i++;
      } else {
        arr[k] = arrayRight[j];
        j++;
      }

      k++;
    }
    System.out.printf(
        "left=%s, right=%s %n", Arrays.toString(arrayLeft), Arrays.toString(arrayRight));

    System.out.println("sort end= " + Arrays.toString(arr));
    // 將左陣列剩餘索引值回填arr
    while (i < sizeLeft) {
      arr[k] = arrayLeft[i];
      i++;
      k++;
    }
    // 將右陣列剩餘索引值回填arr
    while (j < sizeRight) {
      arr[k] = arrayRight[j];
      j++;
      k++;
    }
    System.out.println("merge end=" + Arrays.toString(arr));
  }
}
