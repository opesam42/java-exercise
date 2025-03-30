// Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

class Cat {
    String name;
    int age;
    
    public Cat(){
        this.name = "Unknown";
        this.age = 0;
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String get_name(){
        return name;
    }
    
    public int get_age(){
        return age;
    }
    
    public static void main(String[] args) {
        Cat my_cat = new Cat("Mikky", 3);
        System.out.println(my_cat.get_age());
    }
}