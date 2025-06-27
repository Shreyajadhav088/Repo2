class demo {
    void print1(int a,int b){
        System.out.println("Print method 1:");
    }
    void print2(float a,float b){
        System.out.println("Print method 2:");
    }
    void print3(int a,float b){
        System.out.println("Print method 3:");
    }
    void print4(double a,double b){
        System.out.println("Print method 4:");
    }
    void print5(int a,double b){
        System.out.println("Print method 5:");
    }
    void print6(double a, float b){
        System.out.println("Print method 6:");
    }
    
}
public class multiple_method {
    public static void main(String[] args){
        demo d1 = new demo();
        d1.print1(4, 5);
        d1.print2((float)2.5,(float)3.4);
    }

}