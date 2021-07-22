public class methodOverriding{

public static void main(String[] args) {
System.out.println("Method Overriding...");
Bike bk = new Bike();
Splendor sp = new Splendor();
bk.run();
sp.run();
}
}

class Bike{
    void run(){
        System.out.println("Bike Runs on the road...");
    }
}


class Splendor extends Bike{
    void run(){
        System.out.println("Splendor Bike runs too on the road");
    }
}
