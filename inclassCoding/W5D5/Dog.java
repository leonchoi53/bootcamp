package inclassCoding.W5D5;

public class Dog extends Animal {

  private Dog(String name){
    super(name);
  }

  public static Dog of(String name) {
    name = name == null ? "default" : name;
    return new Dog(name);
  }

  public static void main(String[] args) {
    Dog dog = Dog.of("abc");
  }

}
