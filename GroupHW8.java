package GroupExercise1;
//Minimum number in an array
public class GroupHW8 {
    public static void main(String[] args) {

        int z[] = {10, 20, 30, 40, 50};
        int min = z[0];
        for (int i = 1; i < z.length; i++) {


            if (z[i] < min) {
                min = z[i];
            }
        }
        System.out.println("minimum element is:" + min);
    }
}






