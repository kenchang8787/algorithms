package kenchang8787.com.Sorting;

/**
 * 氣泡排序法 (Bubble Sort)
 *
 * <p>從左到右, 外層迴圈每次可以確定陣列最右邊的值, 內層迴圈每次可以將兩值進行比較, 判斷是否需要交換
 *
 * <p>另有優化版
 */
public class BubbleSort implements ISortable {

  @Override
  public int[] sort(int... ints) {

    if (ints == null) return null;

    int length = ints.length;

    // i 代表從右邊數, 已經排序好的值的數量
    // 因為內層迴圈會將最大/最小值, 不斷向右交換, 直到最大/最小值在最右邊
    for (int i = 0; i < length - 1; i++) {
      // 每次比較兩個值的大小, 直到j+1="已排序好的值(i)"時才停止
      for (int j = 0; j < length - i - 1; j++) {
        // 若 ints[j] > ints[j+1], 則兩個交換位置
        if (ints[j] > ints[j + 1]) {
          swap(ints, j, j + 1);
        }
      }
    }

    return ints;
  }

  private void swap(int[] ints, int a, int b) {

    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }
}
