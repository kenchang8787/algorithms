package kenchang8787.com.Sorting;

/**
 * 快速排序法 (Quick Sort)
 *
 * <p>
 * 是一種分而治之的演算法 (Divide and Conquer)
 *
 * <p>
 * 具體作法是先尋找一個基準值(pivot), 基準值可以隨便找,
 *
 * <p>
 * 為了方便這裡使用 arr[0] 當作基準
 *
 * <p>
 * 以基準值為準, 將陣列分成 比基準值小 和 比基準值大的陣列
 *
 * <p>
 * 分完之後, 進行遞迴, 直到每一陣列長度為1時, 陣列就已經排序好了
 */
public class QuickSort implements ISortable {
  @Override
  public int[] sort(int... input) {

    if (input == null)
      return null;

    if (input.length == 0)
      return input;

    // 第一次遞迴, 基準值用input[0]
    recursive(input, 0, input.length - 1);

    return input;
  }

  private void recursive(final int[] ints, final int start, final int end) {

    if (start < end) {
      // 基準值
      final int pivot = ints[start];

      // 左至右的索引, 用於分類比基準點小的值
      var left = start + 1;
      // 右至左的索引, 用於分類比基準點大的值
      var right = end;

      while (true) {

        // 當左邊索引比右邊索引小 && 左邊索引值比基準值小, 將左索引向右一格
        while (left < right && ints[left] < pivot)
          left++;
        // 當右索引大於等於左索引時 && 右索引值比基準值大, 將右索引向左一格
        // 這邊用大於等於, 是為了讓兩點有交集, 從而脫離迴圈
        // 另外就是右索引最後會等於左索引-1, 代表當前右索引值是小於基準值,
        // 故脫離迴圈後, 可以利用右索引和基準值交換位置, 讓基準值在陣列中間而不打散左小右大的排序
        while (right >= left && ints[right] > pivot)
          right--;

        if (left >= right)
          break;

        swap(ints, left, right);
      }
      // 將基準值交換到陣列中間
      swap(ints, start, right);
      // 繼續遞迴, 以排序比當前基準值小的陣列
      recursive(ints, start, right - 1);
      // 繼續遞迴, 以排序比當前基準值大的陣列
      recursive(ints, right + 1, end);
    }
  }

  private void swap(int[] ints, int a, int b) {
    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }
}
