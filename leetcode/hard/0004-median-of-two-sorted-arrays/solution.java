class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int newArr[] = new int[len1 + len2];
        int len3 = newArr.length;

        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            }
        }

        while (i < len1) {
            newArr[k++] = nums1[i++];
        }
        while (j < len2) {
            newArr[k++] = nums2[j++];
        }

        if ((len3 & 1) == 1) {
            int mid = len3 / 2;
            return (double) newArr[mid];
        } else {
            int mid = len3 / 2;
            return ((double) newArr[mid] + newArr[mid - 1]) / 2;
        }
    }
}