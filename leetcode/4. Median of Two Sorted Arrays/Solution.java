public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        if (total % 2 == 1) {
            return findKth(nums1, 0, m - 1, nums2, 0, n - 1, total / 2 + 1);
        } else {
            double left = findKth(nums1, 0, m - 1, nums2, 0, n - 1, total / 2);
            double right = findKth(nums1, 0, m - 1, nums2, 0, n - 1, total / 2 + 1);
            return (left + right) / 2;
        }
    }

    public void findTheMedianNumberFromTwoArray(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        // TODO: if length == 0

        int median1 = nums1[len1 / 2];
        int median2 = nums2[len2 / 2];

        System.out.println(median1);
        System.out.println(median2);

        if (median1 > median2) {

        }
    }

    public double findKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) {
            return findKth(nums2, start2, end2, nums1, start1, end1, k);
        }
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            return findKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        } else {
            return findKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }

}
