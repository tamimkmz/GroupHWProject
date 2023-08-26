package GroupExercise1;
// Maximum number in an array.
public class GroupHW9 {
    public static void main(String[] args) {

        int w[] = {1, 2, 3, 4, 5};
        int max=w[0];
        for (int i = 1; i < w.length; i++) {
            if (w[i] > max) {

                max = w[i];
            }
        }
        System.out.println("max element of the array is:"+max);
    }
}







