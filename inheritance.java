class demo{
    void add(){
        int a=2;
        int b=4;
        System.out.println(a+b);
    }
}
class demo1 extends demo{
    void multiply(){
        int a=10;
        int b=3;
        System.out.println(a*b);
    }
}
public class inheritance {
    public static void main(String [] args){
        demo d1=new demo();
        d1.add();
        demo1 d2=new demo1();
        d2.multiply();
    
    }
}
