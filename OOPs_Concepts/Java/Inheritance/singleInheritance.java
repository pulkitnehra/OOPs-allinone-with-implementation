public class singleInheritance{

public static void main(String[] args) {
    System.out.println("Single Inheritance...");

    Deer dr = new Deer();
    dr.name = "Deer";
    dr.food = "Grass";
    dr.eat();

}
}

// inheritance demonstration
class Animal{
    String name;
    String food;
    void eat(){
        System.out.println(name+" eats "+food);
    }
}

class Deer extends Animal{

}





