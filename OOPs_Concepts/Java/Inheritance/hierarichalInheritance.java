public class hierarichalInheritance{
    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.name = "Pussy";
        ct.eat();
        ct.meows();
    }
}

class Animal{

    String name;
    void eat(){
        System.out.println(name+" eats ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name+" barks");
    }
}

class Cat extends Animal{
    void meows(){
        System.out.println(name+" meows");
    }

}
