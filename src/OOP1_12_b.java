import java.util.Scanner;

public class OOP1_12_b {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner scanner=new Scanner(System.in);

        int x1= scanner.nextInt();
        String operator= scanner.next();
        int x2=scanner.nextInt();

        int result=0;
        switch (operator){
            case "+":
                result=x1+x2;
                System.out.println(x1+"+"+x2+"의 계산 결과는 "+result);
                break;
            case "=":
                if(x1==x2) {
                    System.out.println(x1 + "=" + x2 + "의 계산 결과는 true");
                }else{
                    System.out.println(x1 + "=" + x2 + "의 계산 결과는 false");
                }
                break;
            case "*":
                result = x1 * x2;
                System.out.println(x1 + "*" + x2 + "의 계산 결과는 " + result);
                break;
            case "/":
                if(x2==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                }else {
                    result = x1 / x2;
                    System.out.println(x1 + "/" + x2 + "의 계산 결과는 " + result);
                }
                break;
        }
        scanner.close();
    }
}
