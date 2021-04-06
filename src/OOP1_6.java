import java.util.Scanner;
public class OOP1_6 {
    public static void main(String[] argc){
        int clapNum=0;
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<10){
            if(num==3||num==6||num==9){
                clapNum++;
            }
        }else{
            if(num/10==3||num/10==6||num/10==9){
                clapNum++;
            }
            if(num%10==3||num%10==6||num%10==9) {
                clapNum++;
            }
        }
        switch(clapNum){
            case 0:
                ;
                break;
            case 1:
                System.out.println("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");
                break;
        }
        scanner.close();
    }
}
