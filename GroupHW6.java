package GroupExercise1;

// Check whether given number is prime or not?
public class GroupHW6 {
    public static void main(String[] args) {

        int number=16;
        int count=0;
        for (int i =1; i<=number; i++){
            if(number % i==0){
                count++;

            }
        }
        if (count==2) {
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }
        }
    }






