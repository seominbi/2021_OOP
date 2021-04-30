import java.util.Scanner;

public class OOP2_4 {
    public static void main(String[] args) {
        String s;
        Scanner scanner=new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        s=scanner.next();
        char alphabet=s.charAt(0); //s[0]번째 값 가져오기

        for(int i=0;i<=alphabet-'a';i++){
            for(int j='a';j<=alphabet-i;j++){
                System.out.printf("%c", j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
