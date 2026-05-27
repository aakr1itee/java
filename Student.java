class Student 
{
    String name; //state
    int age;

    Student() //default 
    {
        name = "Unknown";
        age = 0;
    }

    Student(String n) //parameterized
    {
        name = n;
        age = 0;
    }

    Student(Student s) //copy
    {
        name = s.name;
        age = s.age;
    }

    void display() //method
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public static void main(String[] args) 
    {

        Student s1 = new Student(); //obj 
        Student s2 = new Student("Aakriti");
        Student s3 = new Student(s2);
        s1.display();
        s2.display();
        s3.display();
    }
}