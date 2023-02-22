package kenchang8787.com.Sorting;

/**
 * 插入排序法 (Insertion Sort)
 *
 * <p>
 * 從左到右, 每次選擇一個整數至已排列的陣列, 比較其大選決定它所在的位置, 以此類推
 *
 * <p>
 * 相較其他排序, 插入排序法的平均時間複雜度較高, 它只適用於"插入值於已排序的陣列"
 */
public class InsertionSort implements ISortable {

  @Override
  public int[] sort(int... ints) {

    if (ints == null)
      return null;

    for (var i = 1; i < ints.length; i++) {

      // 現在要插入的值
      var key = ints[i];
      // 跟插入值比較大小的index (j 索引左邊的陣列是已排序的)
      var j = i - 1;

      // 當key較小時, 把"左"值往"右"移動, 再繼續向左比較
      // 需注意的是, 這裡不是交換
      while (j >= 0 && ints[j] > key) {
        ints[j + 1] = ints[j];
        j--;
      }
      // 最後在適當的位置時, 將key插入
      ints[j + 1] = key;
    }

    return ints;
  }
}
