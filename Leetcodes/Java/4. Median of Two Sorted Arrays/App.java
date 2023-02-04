
public class App {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1
        System.out.println(sol.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));

        // example 2
        System.out.println(sol.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));

        // example 3
        System.out.println(sol.findMedianSortedArrays(new int[] { 4, 5, 7, 10, 11 }, new int[] { 9 }));
    }
}