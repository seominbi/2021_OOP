import java.util.Scanner;

public class OOP2_16 {
    public static void main(String[] args) {
        String str[]={"가위","바위","보"};
        String stop="그만";
        Scanner scanner=new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            System.out.print("가위 바위 보!>>");
            String userSelect = scanner.next();
            //그만 입력 시 종료
            if(stop.equals(userSelect)){break;}
            //가위 바위 보 냈으면
            int computerSelect = (int) (Math.random() * 3); //0,1,2 중 랜덤

            if(str[computerSelect].equals(userSelect)){
                System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                System.out.println(", 비겼습니다.");
            }else{
                    if(str[computerSelect].equals("가위")){
                        if(userSelect.equals("바위")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 사용자가 이겼습니다.");
                        }else if(userSelect.equals("보")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 컴퓨터가 이겼습니다.");
                        }
                    }else if(str[computerSelect].equals("바위")){
                        if(userSelect.equals("보")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 사용자가 이겼습니다.");
                        }else if(userSelect.equals("가위")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 컴퓨터가 이겼습니다.");
                        }
                    }else if(str[computerSelect].equals("보")){
                        if(userSelect.equals("가위")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 사용자가 이겼습니다.");
                        }else if(userSelect.equals("바위")){
                            System.out.print("사용자 = "+userSelect+" , 컴퓨터 = "+str[computerSelect]);
                            System.out.println(", 컴퓨터가 이겼습니다.");
                        }
                    }

            }

        }
        scanner.close();
    }
}
