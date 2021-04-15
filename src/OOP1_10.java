import java.util.Scanner;
public class OOP1_10 {
    public static void main(String[] args) {
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int r1= scanner.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        int r2= scanner.nextInt();

        double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        if(d<=r1+r2){
            System.out.println("두 원은 서로 겹친다.");
        }else{
            System.out.println("두 원은 서로 안 겹친다.");
        }
        scanner.close();
    }
}
