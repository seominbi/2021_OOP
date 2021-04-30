import java.util.Scanner;

public class OOP2_14 {
    public static void main(String[] args) {
        String course[]={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[]={95,88,76,62,55};

        Scanner scanner=new Scanner(System.in);
        String stop="그만";
        while(true) {
            boolean isThere=true;
            System.out.print("과목 이름>>");
            String subjectName = scanner.next();
            //그만 입력 시 종료
            if(stop.equals(subjectName)){break;}

            //일치하는 과목 검색
            for(int i=0;i< course.length;i++) {
                if (course[i].equals(subjectName)) {
                    System.out.println(subjectName+"의 점수는 "+score[i]);
                    isThere=false;
                    break;
                }
            }
            //일치하는 과목 없으면
            if(isThere) {
                System.out.println("없는 과목입니다.");
            }
        }
        scanner.close();
    }
}
