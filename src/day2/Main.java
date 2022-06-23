package day2;

public class Main {
    static void primeFactor(int n){
        int i;
        if(n>100 || n<2){
            System.out.println("Invalid number");
        }else {
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int num = 100;
        primeFactor(num);
    }
}
