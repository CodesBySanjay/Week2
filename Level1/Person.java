class Person{
    String name;
    int age;

    Person(){
        this.name = "Mark";
        this.age = 30;
    }

    Person(Person clone){
        this.name = clone.name;
        this.age = clone.age;
    }

    void details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println("Original person's details:");
        p1.details();

        Person p2 = new Person(p1);
        System.out.println("\nClone's details:");
        p2.details();
    }
}