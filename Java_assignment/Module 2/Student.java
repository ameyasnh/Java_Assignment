public class Student {

    String name;
    int age;

    
    public Student() {
        name = "Unknown";
        age = 0;
    }

    
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        
        Student s1 = new Student();

        
        Student s2 = new Student("Rahul", 20);

        s1.display();
        s2.display();
    }
}