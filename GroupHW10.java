package GroupExercise1;
// How to find duplicate element from an array of a string?
public class GroupHW10 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "mango", "banana", "mango", "cherry"};
        boolean kbl = false;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i] == fruits[j]) {
                    System.out.print("Show duplicate element: -> " + fruits[i]);
                    kbl = true;
                }
            }
        }
        if (kbl == false) {
            System.out.print("duplicate elements isn't exist");
        }
    }
}






