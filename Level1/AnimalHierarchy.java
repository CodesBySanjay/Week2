class Animal{
   String name;
   int age;

   void makeSound(){
       System.out.println("This is supposed to make a sound");
   }
}

class Dog extends Animal{
   @Override
   void makeSound(){
       System.out.println("Bark");
   }
}

class Cat extends Animal{
   @Override
   void makeSound(){
       System.out.println("Meows");
   }
}

class Bird extends Animal{
   @Override
   void makeSound(){
       System.out.println("Chirps");
   }
}

class Main{
   public static void main(String[] args){
       Dog dog = new Dog();
       dog.makeSound();

       Cat cat = new Cat();
       cat.makeSound();

       Bird bird = new Bird();
       bird.makeSound();
   }
}