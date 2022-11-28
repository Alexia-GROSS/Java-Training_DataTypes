public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        //Assigning numbers to the array
        for(int i = 0; i < numbers.length; i++){
            numbers[i]=i+1;
        }

        //Print method 1
        System.out.println("Method 1");
        for(int number : numbers){
            System.out.println(number);
        }

        //Print method 2
        System.out.println("Method 2");
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

    }
}
