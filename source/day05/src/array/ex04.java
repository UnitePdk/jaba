package array;

public class ex04 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = nums1;
        nums2[1] =22;
        System.out.printf("nums1[1] = %d%n", nums1[1]);
        System.out.printf("nums2[1] = %d%n", nums2[1]);
    }
}
