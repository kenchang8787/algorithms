package kenchang8787.com.Sorting;

/**
 * 選擇排序法 (Selection Sort)
 *
 * <p>從左到右, 找出最小值移到最左邊, 以此類推
 */
public class SelectionSort implements ISortable {
  @Override
  public int[] sort(int... ints) {

    if (ints == null) return null;

    for (var i = 0; i < ints.length - 1; i++) {

      var minIndex = i;

      for (var j = i; j < ints.length; j++) {

        if (ints[j] < ints[minIndex]) minIndex = j;
      }

      // 將 ints[i] 的值與最小值做交換
      swap(ints, i, minIndex);
    }

    return ints;
  }

  private void swap(int[] ints, int a, int b) {

    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }
}
