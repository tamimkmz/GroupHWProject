package GroupExercise1;
// To find the 2nd largest number in an array.
public class GroupHW11 {
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};

        System.out.println("Second Largest: "+getSecondLargest(a,6));

    }}







