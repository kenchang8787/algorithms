package kenchang8787.com.Sorting;

/**
 * 氣泡排序法 - 優化 (Bubble Sort)
 *
 * <p>優化方向: 若傳入已經排序完的陣列, 意即第一次迴圈時未發生交換, 則直接離開迴圈
 */
public class BubbleSortOptimize implements ISortable {
  @Override
  public int[] sort(int... ints) {

    if (ints == null) return null;

    boolean swapped;

    for (var i = 0; i < ints.length; i++) {

      swapped = false;

      for (var j = 0; j < ints.length - i - 1; j++) {
        if (ints[j] > ints[j + 1]) {
          swap(ints, j, j + 1);
          swapped = true;
        }
      }

      // 若發現內層迴圈中沒有再進行交換, 則判斷為已經排序完畢
      if (!swapped) break;
    }

    return ints;
  }

  private void swap(int[] ints, int a, int b) {

    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }
}
