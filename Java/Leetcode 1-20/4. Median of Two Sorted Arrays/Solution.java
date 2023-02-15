
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        /**
         * 因為傳入的兩個數字陣列是已經依照升冪排序的
         * 故這邊依照大小順序將兩個陣列合併為同一個陣列
         * 再取中間值
         */

        /** 儲存合併陣列1及陣列2並排序後的陣列 */
        int[] array = new int[nums1.length + nums2.length];

        /** 儲存陣列1當前的索引 */
        int index1 = 0;
        /** 儲存陣列2當前的索引 */
        int index2 = 0;
        /** 儲存合併陣列當前的索引 */
        int indexArray = 0;

        // 合併為同一個陣列同時順便做排序
        while (index1 < nums1.length || index2 < nums2.length) {

            // 當陣列1已經讀完, 但陣列2仍有尚未讀取的值
            if (index1 == nums1.length) {
                array[indexArray] = nums2[index2];
                index2++;
            }
            // 當陣列2已經讀完, 但陣列1仍有尚未讀取的值
            else if (index2 == nums2.length) {
                array[indexArray] = nums1[index1];
                index1++;
            }
            // 當陣列1當前的數 < 陣列2當前的數
            else if (nums1[index1] < nums2[index2]) {
                array[indexArray] = nums1[index1];
                index1++;
            }
            // 當陣列1當前的數 > 陣列2當前的數
            else {
                array[indexArray] = nums2[index2];
                index2++;
            }

            indexArray++;
        }

        // 若合併後的陣列長度為奇數，直接取得中間值
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        }
        // 為偶數時，取得中間二值相加除以2
        else {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2d;
        }
    }
}
