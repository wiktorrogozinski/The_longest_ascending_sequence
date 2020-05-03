import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []array = new int[size];
        int longestSequence = 1;
        int temp = 1;
        for (int i = 0; i < array.length; ++i) {
            int element = scan.nextInt();
            array[i] = element;
        }

        for (int i = 1; i < array.length; ++i) {
            if(array[i] > array[i-1]) {
                ++temp;
            }
            else {
                if(temp>longestSequence){
                    longestSequence=temp;
                    temp=1;
                }
                else {
                    temp =1;
                }
            }

            if(temp>longestSequence){
                longestSequence=temp;
            }


        }
        System.out.println(longestSequence);
    }
}