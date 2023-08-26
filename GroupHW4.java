package GroupExercise1;
// Create a 2D array of integers and calculate the sum of even and odd numbers on that array.
public class GroupHW4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int oddSum=0;
        int evenSum=0;
        for (int num: numbers) {

            if(num%2==0){
              evenSum+=num;
                }else{
                oddSum+=num;
                }
            }
        System.out.println("Sum of odd numbers:"+oddSum);
        System.out.println("Sum of even numbers:"+evenSum);

        }
    }






