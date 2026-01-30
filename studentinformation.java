class Student {
    String name;
    int age;
    String course;

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        System.out.println("-------------------");

       
        Student student1 = new Student();
        student1.name = "Clarence Artajo";
        student1.age = 19;
        student1.course = "BSIT";

       
        Student student2 = new Student();
        student2.name = "Raikashi Tendo";
        student2.age = 19;
        student2.course = "BSBA";

        Student student3 = new Student();
        student3.name = "Hiroshi Gyumie";
        student3.age = 19;
        student3.course = "BSED";

        
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
