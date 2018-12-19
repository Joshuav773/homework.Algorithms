package algorithms;

public class SlectionSort {

    public static void main(String[] args) {

        int [] numbers = {23,28,31,47,50,78,100};
        System.out.println("Numbers before using selection sort algorithm");
        for (int a = 0; a < numbers.length; a++){
            System.out.println(numbers[a]);
        }
        for (int a = 0; a < numbers.length; a++){
            int minIndex = a;
            for (int b = a + 1; b < numbers.length; b++) {
                if (numbers[b] < numbers[minIndex]) {
                    minIndex = b;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[a];
            numbers[a] = temp;
        }
        System.out.println("Numbers after using selection sort algorithm");
        for (int c = 0; c < numbers.length; c++){
            System.out.println(numbers[c]);
        }



    }
}
