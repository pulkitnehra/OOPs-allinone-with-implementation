interface AnimalEat{
    void eat();
}

interface AnimalTravel{
    void travel();
}


public class multipleInheritance{
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat();
        an.travel();
    }
}

class Animal implements AnimalTravel, AnimalEat{

    public void eat(){
        System.out.println("Animal Eats ...");
    }
    public void travel(){
        System.out.println("Animal Travels ...");
    }
}


