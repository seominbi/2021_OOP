import java.util.Scanner;

public class OOP2_6 {
    public static void main(String[] args) {
        int[] unit={50000,10000,1000,500,100,50,10,1};
        Scanner scanner=new Scanner(System.in);

        System.out.print("금액을 입력하시오 : ");
        int money=scanner.nextInt();

        int i=0;
        while(money>0){
            if(money/unit[i] !=0) {
                System.out.println(unit[i] + "원 짜리 : " + (money/ unit[i]) + "개");
            }
            money=money%unit[i++];
        }
        scanner.close();
    }
}

