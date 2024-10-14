class Person {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // display's name and age 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Info of students
class Student extends Person {
   
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Value for fee per unit

    // instructor's information inputs
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); 
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // calculates the total unit fee
    public double calculateFees() {
        return units * feePerUnit;
    }

    // outputs of students
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

//info of instructor
class Instructor extends Person {
    private String employeeID;
    private String department;
    private double salary;

    //instructor's information
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); 
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Info outputs
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// class to demonstrate polymorphism
public class UniversityEnrollmentSystem {

    
    public static void printDetails(Person p) {
        p.displayInfo(); 
        System.out.println(); 
    }
    public static void main(String[] args) {
        //student's information out puts
        Student student1 = new Student("Alexander", 19, "031697", "Mechanical Engineering", 5);
        Student student2 = new Student("Jerome", 20, "020995", "Computer Engineering", 6);

        // instructor's information outputs
        Instructor instructor1 = new Instructor("Engr. Tanya", 25, "573497", "CEA", 40000);
        Instructor instructor2 = new Instructor("Engr. Gela", 27, "435795", "CEA", 45000);

        // Display's information for each person
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
