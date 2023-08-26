package GroupExercise1;
import java.util.Scanner;
public class GroupHW1 {
    public static void main(String[] args) {
        int daysInWeek = 7;
        double[] temperature = {30, 40, 50, 60, 60, 65, 70,80};
        double[] temperatures = new double[daysInWeek];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < daysInWeek; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        double highestTemp = temperatures[0];
        double lowestTemp = temperatures[0];
        for (int i = 1; i < daysInWeek; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
            }
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }
        System.out.println("Highest temperature for the week: " + highestTemp);
        System.out.println("Lowest temperature for the week: " + lowestTemp);
        scanner.close();
    }
}










