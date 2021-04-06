import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class OOP1_8 {
    public static boolean inRect(int x,int y,int rectx1, int recty1, int rectx2, int recty2){
        if((x>rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2)){
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
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        inRect(x,y,rectx1,recty1,rectx2,recty2);
    }
}
