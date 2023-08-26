package GroupExercise1;
// 10 numbers of Fibonacci series. 0 1  1 2 3 5 8 13 21 34
public class GroupHW7 {
    public static void main(String[] args) {

        int k1=0, k2=1, sum=0;
        System.out.print(k1+" "+k2);// 0 1
        for (int i=2; i<10; i++){
            sum =k1+k2;// 0+1=1
            System.out.print(" "+sum);
            k1=k2;
            k2=sum;

        }
        }
    }






