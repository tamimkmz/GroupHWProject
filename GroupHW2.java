package GroupExercise1;
// Create an array of integer value then calculate the sum of all stored elements on that array.
public class GroupHW2 {
    public static void main(String[] args) {

        int[] values = {12, 15, 25, 60, 30, 20, 40, 50, 90, 80, 45, 35};
        int sum = 0;
        for (int i = 0; i<values.length; i++) {
        sum = sum + values[i];
    }
    System.out.println(sum);

    }

}



