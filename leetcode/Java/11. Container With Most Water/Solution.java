public class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        /** 最大的面積 */
        int max = 0;

        /** 迴圈至兩點交會 */
        while (left < right) {

            /** 當前最大面積 與 當前兩點圍出的面積 比較 */
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            // 因為這邊要試圖圍出最大面積, 故數字較小的(長)被淘汰
            if (height[left] > height[right])
                right--;
            else
                left++;
        }

        return max;
    }
}
