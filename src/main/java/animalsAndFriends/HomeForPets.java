package animalsAndFriends;

import java.util.ArrayList;
import java.util.List;

public class HomeForPets {
    public static void main(String[] args) {

        Dog dog = new Dog("NoName", "Lola",  11);

        System.out.println("Name " + dog.getName());
        System.out.println("Bread " + dog.getBread());
        System.out.println("Age " + dog.getAge());

        Bird myBird = new Bird();
        myBird.setName("Main Bird");
        myBird.setAge(3);

        List<Animal> birds = new ArrayList<>();
        birds.add(myBird);

        //

        Cat myCat = new Cat();
        myCat.setName("Kate");
        myCat.setAge(5);

        Cat notMyCat = new Cat();
        notMyCat.setName("Juan");
        notMyCat.setAge(1);

        List<Animal> cats = new ArrayList<>();
        cats.add(myCat);
        cats.add(notMyCat);

        //

        Dog myDog = new Dog();
        myDog.setName("Jek");
        myDog.setAge(10);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(myDog);

        List<Animal> pets = new ArrayList<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        pets.addAll(birds);
//
        System.out.println("*********1***********");
        // compare lists
        if (cats.equals(dogs)) {
            for (Animal cat : cats) {
                System.out.println(cat.getName());
            }
            //below is the same forEach but using lambda
            cats.forEach(cat -> System.out.println(cat.getName()));
        } else {
            System.out.println("NO");
        }

        System.out.println("*********2***********");
        // find animal with age 10 and print its details
        int ageToFind = 15;
        for (Animal animal : pets) {
            if (animal.getAge() == ageToFind) {
                System.out.println("Animal with age " + ageToFind + " is " + animal.getName());
            } else {
                System.out.println("Not this one..." + animal.getName());
            }
        }

        System.out.println("**********3***********");
        //using stream and lambda filter animal with age 10 and use forEach
        pets.stream().sorted().filter(animal -> animal.getAge() == ageToFind)
                .forEach(Animal::doCall);


        System.out.println("**********4***********");
        System.out.println("List of birds: ");
        printList(birds);
        System.out.println("List of cats: ");
        printList(cats);
        System.out.println("List of dogs: ");
        printList(dogs);
        System.out.println("List of animals: ");
        printList(pets);

        System.out.println("**********5***********");
        Animal animal;         //define variable
        animal = new Cat();
        animal = new Dog();
        animal = new Bird();  //re-assign to variable an object which has been created from the class "Birds"

        animal.printName(); //we call a method "name" from "Animal" class but since "Birds" class extends "Animal" and
        // we re-assign to variable an object which has been created from the class "Birds"
        // then the system fulfills the method from "Birds"
        //= call of the same "animal.name" = fulfilment of methods of different objects (Dogs, Cats or Birds) = polymorphism

        System.out.println("**********6***********");
        animal.doCall(); // fulfilled with NULL

        System.out.println("**********7***********");
        animal.checkAge(); //did not fulfill (why?)

        System.out.println("**********8***********");
        //List #1, ArrayList
        List<String> animals = new ArrayList<>();
        animals.add(0, "dogs");
        animals.add("cats");
        animals.add(2, "birds");
        animals.remove("birds");
        System.out.println(animals);

        System.out.println("**********9***********");
        //List #2, ArrayList
        List<String> animalsForHome = new ArrayList<>();
        animalsForHome.add(0, "dogs");
        animalsForHome.add("cats");
        animalsForHome.add(1, "birds");
        System.out.println(animalsForHome);
    }

    public static void printList(List<Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}

