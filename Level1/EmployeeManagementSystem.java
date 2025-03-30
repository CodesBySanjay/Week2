class Employee{
    String name;
    int id;
    double salary;

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    int teamSize;
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team size : "+teamSize);
    }
    
}

class Developer extends Employee{
    String programmingLanguage;
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
}

class Intern extends Employee{
    int duration;
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Internship duration (in months) : "+duration);
    }
}

class Main{
    public static void main(String[] args){
        Manager m = new Manager();
        m.name = "Mark";
        m.id = 1;
        m.salary = 9999999.9;
        m.teamSize = 2;
        m.displayDetails();

        Developer d = new Developer();
        d.name = "Sid";
        d.id = 2;
        d.salary = 100000;
        d.programmingLanguage = "Python";
        d.displayDetails();

        Intern i = new Intern();
        i.name = "Stancy";
        i.id = 5;
        i.salary = 15000;
        i.duration = 5;
        i.displayDetails();
    }
}