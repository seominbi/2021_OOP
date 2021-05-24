interface  Shape{
    final double PI=3.14;
    void draw();    //도형 그리는 함수
    double getArea();   //도형 면적 리턴
    default public void redraw(){   //디폴트메소드
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
class Circle implements Shape{
    private int r;
    private double area;
    Circle(int n){
        r=n;
    }
    public void draw(){
        area=r*r*PI;
        System.out.println("반지름이 "+r+"인 원입니다.");
    }
    public double getArea(){
        return area;
    }
}
class Oval implements Shape{
    private int width;
    private int height;
    private double area;
    Oval(int w,int h){
        width=w;
        height=h;
    }
    public void draw(){
        area=height*width*PI;
        System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
    }
    public double getArea(){
        return area;
    }
}
class Rect implements Shape{
    private int width;
    private int height;
    private double area;
    Rect(int w,int h){
        width=w;
        height=h;
    }
    public void draw(){
        area=width*height;
        System.out.println(width+"x"+height+"크기의 사각형 입니다.");
    }
    public double getArea(){
        return area;
    }
}
public class OOP5_14 {
    public static void main(String[] args) {
        Shape []list=new Shape[3];
        list[0]=new Circle(10); //반지름 10인 원
        list[1]=new Oval(20,30);    //20*30 사각형에 내접하하는 워
        list[2]=new Rect(10,40);    //10*40 크기의 사각형

        for(int i=0;i<list.length;i++)
            list[i].redraw();
        for(int i=0;i< list.length;i++)
            System.out.println("면적은 "+list[i].getArea());
    }
}