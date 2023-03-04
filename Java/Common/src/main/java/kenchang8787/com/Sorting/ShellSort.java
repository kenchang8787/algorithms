package kenchang8787.com.Sorting;

/**
 * 謝耳排序法 (Shell Sort)
 *
 * <p>算是插入排序法(Insertion Sort)的變種,
 *
 * <p>因為插入排序法在尋找插入位置的過程中, 會不斷移動已排序的陣列, 直到找到自己適合的位置插入, 這樣的情況下造成插入排序法"移動"很多.
 *
 * <p>謝耳排序法的出發點就是"可以直接跟位置較遠的值進行比較和交換"
 *
 * <p>先選定一個區間(Gap/Span), 區間有幾種選法, 可以去參考網路資源
 *
 * <p>此例中我們選擇 區間=陣列長度/2的k次方, gap = n/2, n/4, n/8... 直到 gap=1
 */
public class ShellSort implements ISortable {
  @Override
  public int[] sort(int... input) {

    // arr=[12, 34, 54, 2, 3]
    //
    // 1st with gap=2 (5/2)
    // i=2, temp=54, j=2, arr[0] > temp ? replace : [continue]
    // end loop, arr[2]=temp. arr=[12, 34, 54, 2, 3]
    // i=3, temp=2, j=3, arr[1] > temp ? [replace] : continue, arr=[12, 34, 54, 34, 3]
    // end loop, arr[1]=temp. arr=[12, 2, 54, 34, 3]
    // i=4, temp=3, j=4, arr[2] > temp ? [replace] : continue, arr=[12, 2, 54, 34, 54]
    // i=4, temp=3, j=2, arr[0] > temp ? [replace] : continue, arr=[12, 2, 12, 34, 54]
    // end loop, arr[0]=temp. arr=[3, 2, 12, 34, 54]
    //
    // 2st with gap=1 (5/4)
    // i=1, temp=2, j=1, arr[0] > temp ? [replace] : continue
    // end loop, arr[0]=temp. arr=[2, 3, 12, 34, 54]
    // i=2, temp=12, j=2, arr[1] > temp ? replace : [continue]
    // end loop, arr[2]=temp. arr=[2, 3, 12, 34, 54]
    // i=3, temp=34, j=3, arr[2] > temp ? replace : [continue]
    // end loop, arr[3]=temp. arr=[2, 3, 12, 34, 54]
    // i=4, temp=54, j=4, arr[3] > temp ? replace : [continue]
    // end loop, arr[4]=temp. arr=[2, 3, 12, 34, 54]

    if (input == null) return null;

    var n = input.length;

    // 實現 gap= n/2, n/4, n/8 的迴圈
    for (int gap = n / 2; gap > 0; gap /= 2) {

      // i從gap長度的索引開始
      // 持續與左移gap長度的索引值比較
      // 直到最後一個索引值
      for (var i = gap; i < n; i++) {

        // 把 "欲插入的值" 暫存
        var temp = input[i];
        // j=欲插入的索引
        int j;

        // 迴圈一開始, j=i 意即"欲插入的值"的位置為原索引
        // 當仍可以向左比較"gap長度的索引值" 且 "其所引值大於欲插入的值" 時,
        // 將左邊較大的值向右移動gap長度, 並且將 "欲插入的索引" 向左移動gap長度
        for (j = i; j >= gap && input[j - gap] > temp; j -= gap) {
          input[j] = input[j - gap];
        }
        // 若已經無法向左比較時, 將值插入索引j
        input[j] = temp;
      }
    }

    return input;
  }
}
