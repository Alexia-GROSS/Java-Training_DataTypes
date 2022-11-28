public class Main {
    public static void main(String[] args) {
        printPyramid(10);
    }

    static void printPyramid(int size) {
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

}

