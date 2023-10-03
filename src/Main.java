import com.AlexanderHasslund.demo.models.Cat;
import com.AlexanderHasslund.demo.models.Dog;
import com.AlexanderHasslund.demo.models.Squirrel;

public class Main {

    public static void main(String[] args) {

        //instansiera objekten
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat();
        benny.makeSound();

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.makeSound();
        kasper.sleep();
        kasper.typeOfAnimal("Cat"); //default method


        fido.name();
        fido.eat();
        fido.move();
        fido.makeSound();
        fido.sleep();
        fido.typeOfAnimal("Dog"); //default method

    }
}