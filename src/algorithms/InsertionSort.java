package algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int [] numbers = {12,34,7,18,27,4};
        System.out.println("Numbers before sorting");
        for (int a = 0; a< numbers.length; a++){
            System.out.println(numbers[a]);
        }
        for(int a = 1; a < numbers.length; a++){
            int key = numbers[a];
            int b = a - 1;

            while (b >= 0 && numbers[b] > key){
                numbers[b+1] = numbers[b];
                b--;

            }
            numbers[b + 1]= key;
        }
        System.out.println("Numbers after sorting");
        for (int c = 0; c < numbers.length; c++){
            System.out.println(numbers[c]);
        }


    }
}
