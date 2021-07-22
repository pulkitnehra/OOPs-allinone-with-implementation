public class usingInterfaceKeyword{
    public static void main(String[] args) {
        CarFeatures obj = new CarFeatures();
        obj.start();
        obj.stop();
    }
}

interface CarStart{
    void start();
}

interface CarStop{
    void stop();
}


class CarFeatures implements CarStart,CarStop{
    public void start(){
        System.out.println("Car Starts");
    }
    public void stop(){
        System.out.println("Car Stops");
    }
}








