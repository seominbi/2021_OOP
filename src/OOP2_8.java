import java.util.Scanner;

public class OOP2_8 {
    public static void main(String[] args) {
        System.out.print("정수 몇개?");
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int []array=new int[num];

        for(int i=0; i<num;i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            for (int j = 1; j < i; j++) {
                if(array[i]==array[j]){
                    i--;
                    break;
                }

            }
        }

        for(int j=0;j<num;j++){
            System.out.print(array[j]+ " ");
            if(j%10==9){
                System.out.println();
            }
        }
        scanner.close();
    }
}
