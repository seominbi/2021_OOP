import java.util.Scanner;
public class OOP1_4 {
    public static void main(String[] argc){
        int middleNum = 0;
        System.out.print("정수 3개 입력>>");
        Scanner scanner=new Scanner (System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if(num1<num2&&num2<num3){
            middleNum=num2;
        }else if(num2<num1&&num1<num3){
            middleNum=num1;
        }else if(num1<num3&&num3<num2){
            middleNum=num3;
        }else if(num3<num2&&num2<num1){
            middleNum=num2;
        }else if(num3<num1&&num1<num2){
            middleNum=num1;
        }else if(num2<num3&&num3<num1){
            middleNum=num3;
        }
        System.out.println("중간 값은 "+ middleNum);
        scanner.close();
    }
}
