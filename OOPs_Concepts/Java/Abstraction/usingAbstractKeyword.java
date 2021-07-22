public class usingAbstractKeyword{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}

abstract class Demo{
    abstract void display();
}

class A extends Demo{
    public void display(){
        System.out.println("Inherited From Abstract method...");
    }
}








