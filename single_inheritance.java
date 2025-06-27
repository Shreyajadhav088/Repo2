class vehicle{
    public void drive(){
       System.out.println("drive the vehicle :"); 
    }
}
class car extends vehicle{
    public void drive(){
       System.out.println("this is overrieden method in car :"); 
    }
    public void breaks(){
        System.out.println("this is my speciliezed method:");
    }

}


public class single_inheritance {
    public static void main(String[] args){
        car c = new car ();
        c.drive();
        c.breaks();

    }
    
}
