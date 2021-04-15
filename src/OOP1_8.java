import java.util.Scanner;

public class OOP1_8 {
    public static boolean inRect(int x,int y,int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int rectx1=100;
        int rectx2=200;
        int recty1=100;
        int recty2=200;

        System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        if(inRect(x1,y1,rectx1,recty1,rectx2,recty2)||inRect(x2,y2,rectx1,recty1,rectx2,recty2)){
            System.out.println("(100,100),(200,200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        }else {
            System.out.println("(100,100),(200,200)의 두 점으로 이루어진 직사각형과 충돌하지 않습니다.");
        }
    }
}
