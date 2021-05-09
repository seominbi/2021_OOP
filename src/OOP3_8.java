import java.util.Scanner;

class Phone{
    private String name;
    private String tel;
    public Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }
}
class PhoneBook{
    private int personNum;
    private Phone []phone;
    public PhoneBook(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("인원수>>");
        personNum=scanner.nextInt();
        phone=new Phone[personNum];
        for(int i=0;i<personNum;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name=scanner.next();
            String tel=scanner.next();
            phone[i]=new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
    }
}
public class OOP3_6 {
    public static void main(String[] args) {

    }
}
