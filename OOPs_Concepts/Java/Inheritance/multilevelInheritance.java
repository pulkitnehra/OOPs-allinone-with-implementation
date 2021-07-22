public class multilevelInheritance{

    public static void main(String[] args) {

        puppyDog pdg = new puppyDog();
        pdg.name = "brutus";
        pdg.food = "eggs";
        pdg.eat();
        pdg.bark();
        pdg.weep();
    }
}


class Animal{

    String name;
    String food;

    void eat(){
        System.out.println(name+" eats "+food);
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println(name+" barks");
    }
}

class puppyDog extends Dog{

    void weep(){
        System.out.println(name+" weeps");
    }
}





