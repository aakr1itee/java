abstract class std{
    String name;
    int roll;
    double marks;

 std(String name,int roll,double marks)
 {
    this.name = name;
    this.roll = roll;
    this.marks = marks;
 }   
 abstract void attendclass();
 abstract void giveexam();
 abstract void payfee();

 void calculategrade() {
    if (marks >= 80) {
       System.out.println("Grade: A");
    }
    else if (marks >= 60) {
    System.out.println("Grade: B");
    }
    else if (marks >= 40) {
    System.out.println("Grade: C");
    }
    else {
    System.out.println("Grade: F");
    }
}
void calculator(){
    System.out.println("marks obtained:"+marks);
}
}