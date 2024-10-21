package array;

public class ex09 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3]; // 2행 3열 배열
        System.out.printf("nums.length: %d%n", nums.length); // 행의 개수
        System.out.printf("nums[0].length: %d%n", nums[0].length); // 1행의 열 개수

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d행, %d열: %d%n", i, j, nums[i][j]);
            }
        }
    }
}
