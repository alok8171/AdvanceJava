class Animal {
    String name;
    String sound;

    Animal() {
        this("", "");
    }

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void getInfo() {
        System.out.println(name);
        System.out.println(sound);
    }

    void getInfo(String name, String sound, int legs) {
        System.out.println(name);
        System.out.println(sound);
        System.out.println(legs);
    }
}

// Child class (outside Animal)
class Cat extends Animal {

    Cat(String name, String sound) {
        super(name, sound);
    }

    // Method Overriding
    @Override
    void getInfo() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat sound: " + sound);
    }
}

public class p88oly {
    public static void main(String[] args) {

        Animal a = new Animal("Horse", "HINGG");
        a.getInfo();

        Animal c1 = new Cat("Cat2", "Meow"); // Polymorphism
        c1.getInfo();  // Runtime Polymorphism
    }
}
