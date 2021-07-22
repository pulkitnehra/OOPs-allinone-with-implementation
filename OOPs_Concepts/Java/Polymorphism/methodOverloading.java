public class methodOverloading{

public static void main(String[] args) {
methodOverloading ovrload = new methodOverloading();
System.out.println("Method Overloading...");
ovrload.calc();
ovrload.calc(4, 6);

}

public void calc(){
    System.out.println("Performing Arithmetic Operations");
    }

    void calc(int a, int b){
        System.out.println("Performing Arithmetic Addition "+(a+b));
    }
}





