import java.util.Scanner;
class ConcertReservationSystem {
    private String[] s = new String[10];
    private String[] a = new String[10];
    private String[] b = new String[10];
    Scanner scanner = new Scanner(System.in);

    //S, A, B 좌석 초기화
    ConcertReservationSystem() {
        for (int i = 0; i < s.length; i++) {
            s[i] = "___";
            a[i] = "___";
            b[i] = "___";
        }
    }

    //좌석선택 후 해당 좌석예약
    void selectSeat() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int seat = scanner.nextInt();
        switch (seat) {
            case 1:
                reserveSeatS();
                break;
            case 2:
                reserveSeatA();
                break;
            case 3:
                reserveSeatB();
                break;
            default:
                System.out.println("존재하지 않는 좌석입니다.");
        }
    }
    //좌석S 예약
    void reserveSeatS() {
        System.out.print("S>> ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>>");
        int seatNum = scanner.nextInt();
        if(seatNum>=1&&seatNum<=10){
            s[seatNum-1] = name;
        }else {
            System.out.println("존재하지 않는 좌석입니다.");
        }
    }
    //좌석A 예약
    void reserveSeatA() {
        System.out.print("A>> ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>>");
        int seatNum = scanner.nextInt();

        if(seatNum>=1&&seatNum<=10){
            a[seatNum-1] = name;
        }else {
            System.out.println("존재하지 않는 좌석입니다.");
        }
    }
    //좌석B 예약
    void reserveSeatB() {
        System.out.print("B>> ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>>");
        int seatNum = scanner.nextInt();

        if(seatNum>=1&&seatNum<=10){
            b[seatNum-1] = name;
        }else {
            System.out.println("존재하지 않는 좌석입니다.");
        }
    }

    //모든좌석조회(출력)
    void check(){
        System.out.print("S>> ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        System.out.print("A>> ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("B>> ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    //좌석취소
    void cancel(){
        System.out.print("좌석 S:1, A:2, B:3>>");
        int seat = scanner.nextInt();
        switch (seat) {
            case 1:
                cancelSeatS();
                break;
            case 2:
                cancelSeatA();
                break;
            case 3:
                cancelSeatB();
                break;
            default:
                System.out.println("존재하지 않는 좌석입니다.");
        }
    }
    void cancelSeatS(){
        System.out.print("A>> ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();

        int i;
        for(i=0;i<s.length;i++){
            if(s[i].equals(name)){
                s[i]="___";
                break;
            }
        }
        if(i==s.length){
            System.out.println("예약된 좌석이 없습니다.");
        }
    }
    void cancelSeatA(){
        System.out.print("A>> ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();

        int i;
        for(i=0;i<a.length;i++){
            if(a[i].equals(name)){
                a[i]="___";
                break;
            }
        }
        if(i==a.length){
            System.out.println("예약된 좌석이 없습니다.");
        }
    }
    void cancelSeatB(){
        System.out.print("B>> ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("이름>> ");
        String name = scanner.next();

        int i;
        for(i=0;i<b.length;i++){
            if(b[i].equals(name)){
                b[i]="___";
                break;
            }
        }
        if(i==b.length){
            System.out.println("예약된 좌석이 없습니다.");
        }
    }
}
public class OOP3_12 {
    public static void main(String[] args) {
        ConcertReservationSystem concert=new ConcertReservationSystem();
        Scanner scanner=new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = scanner.nextInt();

            if(num==4){break;}
            switch (num) {
                case 1:
                    concert.selectSeat();
                    break;
                case 2:
                    concert.check();
                    break;
                case 3:
                    concert.cancel();
                    break;
                default:
                    System.out.println("선택할 수 없는 메뉴입니다.");
            }

        }
    }
}