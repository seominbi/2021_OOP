import java.sql.SQLOutput;

public class test {
    //필드(FIELD) IN JAVA, MEMBER변수 IN C++
    public static final double p;
    //static 초기화 블럭
    static{
        p=555;
    }
    final double pi; //필드도 final 붙일 수 있음. 선언과 초기화(값할당)분리 가능
    //constructor(생성자)
    public test() {//리턴 타입 x, 클래스명과 동일
        pi=3.142; //생성자에서 값할당 가능O , 메인에서는 X
    }

    public static void main(String[] args){
        final double PI;
        int radius =1;
        PI=3.14;
        double perimeter=2*PI*radius;
        //System.out.println(pi);
    }
}
