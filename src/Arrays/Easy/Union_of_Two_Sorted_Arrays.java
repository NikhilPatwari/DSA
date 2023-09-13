package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
 * The union of two arrays can be defined as the common and distinct elements in the two arrays.
 * NOTE: Elements in the union should be in ascending order.
 */
public class Union_of_Two_Sorted_Arrays {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int p3 = -1;
        int n = a.length;
        int m = b.length;
        while (p1 < n && p2 < m) {
            if (a[p1] <= b[p2]) {
                if (p3 == -1 || ans.get(p3) != a[p1]) {
                    ans.add(a[p1]);
                    p3++;
                }
                p1++;
            } else if (b[p2] < a[p1]) {
                if (p3 == -1 || ans.get(p3) != b[p2]) {
                    ans.add(b[p2]);
                    p3++;
                }
                p2++;
            }
        }
        if (p1 < n) {
            while (p1 < n) {
                if (ans.get(p3) != a[p1]) {
                    ans.add(a[p1]);
                    p3++;
                }
                p1++;
            }
        }
        if (p2 < m) {
            while (p2 < m) {
                if (ans.get(p3) != b[p2]) {
                    ans.add(b[p2]);
                    p3++;
                }
                p2++;
            }
        }
        return ans;
    }

}
