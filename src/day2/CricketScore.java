package day2;

public class CricketScore {
    static void scoreCal(int a, int b, int c, int d, int e ){
        int totalRun = 0;
        totalRun = a*1 + b*2 + c*3 + d*4 + e*6;
        System.out.println(totalRun);
    }

    public static void main(String[] args) {
        int count1 = 20;
        int count2 = 8;
        int count3= 1;
        int count4 = 4;
        int count6 = 2;

        scoreCal(count1,count2,count3,count4,count6);
    }
}
