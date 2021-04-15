import java.util.Scanner;
public class OOP1_12_a {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner scanner=new Scanner(System.in);

        int x1= scanner.nextInt();
        String operator= scanner.next();
        int x2=scanner.nextInt();

        if(operator.equals("+")){
            int result=x1+x2;
            System.out.println(x1+"+"+x2+"의 계산 결과는 "+result);
        }else if(operator.equals("=")){
            if(x1==x2) {
                System.out.println(x1 + "=" + x2 + "의 계산 결과는 true");
            }else{
                System.out.println(x1 + "=" + x2 + "의 계산 결과는 false");
            }
        } else if(operator.equals("*")) {
            int result = x1 * x2;
            System.out.println(x1 + "*" + x2 + "의 계산 결과는 " + result);
        }else if(operator.equals("/")) {
            if(x2==0){
                System.out.println("0으로 나눌 수 없습니다.");
            }else {
                int result = x1 / x2;
                System.out.println(x1 + "/" + x2 + "의 계산 결과는 " + result);
            }
        }
        scanner.close();
    }
}
