package day2;

public class SumOfNatural {
    public static void main(String[] args) {
        int num = 5;
        sumNaturalNum(num);
    }
    static void sumNaturalNum(int n){
        int sum = 0;
        int i;
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
