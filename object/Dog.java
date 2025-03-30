public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }

    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.makeSound();

        Animal pet = new Animal();
        pet.makeSound();
    }
}