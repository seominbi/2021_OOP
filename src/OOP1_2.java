import java.util.Scanner;
public class OOP1_2 {
    public static void main(String[] args){
        System.out.print("2자리 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        if(num/10==num%10){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }else{
            System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
        }
        scanner.close();
    }
}
