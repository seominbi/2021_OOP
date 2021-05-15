import java.util.Scanner;

class Phone{
    private String name;
    private String tel;
    public Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }
    public String getTel(){
        return tel;
    }
    public String getName(){
        return name;
    }
}
class PhoneBook{
    private int personNum;
    private Phone []phone;
    public void setPhone(){
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
    public void searchName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            if (name.equals("그만")) {
                break;
            }
            int i;
            for (i = 0; i < personNum; i++) {
                if (phone[i].getName().equals(name)) {
                    System.out.println(name + "의 번호는 " + phone[i].getTel() + " 입니다.");
                    break;
                }
            }
            if (i == personNum) {
                System.out.println(name + " 이 없습니다.");

            }
        }
    }
}
public class OOP3_8 {
    public static void main(String[] args) {
        PhoneBook phonebook=new PhoneBook();
        phonebook.setPhone();
        phonebook.searchName();
    }
}
