package GroupExercise1;
// Create a 2D array of integers where you store odd and even numbers on that array then print even numbers only.
public class GroupHW3 {
    public static void main(String[] args) {
        int[][] numbers =
                          {{75, 70, 89, 80, 91},
                        {25, 20, 35, 61, 60},
                        {40, 85, 30, 15, 20}
                };
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                if (numbers[r][c] % 2 == 0) {
                    System.out.print(numbers[r][c] + " ");

                }
            }
            System.out.println();
        }
    }
}