public class Student {
    protected String StudentId;
    protected String studentName;
    protected String faculty;
    protected String major;

public void enrollment() {

        System.out.println("student enrollment");
    }

public void pament() {

        System.out.println("student pament");
    }

public void addCourse() {

        System.out.println("student addCourse");
    }

    public void dropCourse() {

        System.out.println("student dropCourse");
    }
     public static void main(String[] args){
         System.out.println("Hello Word");
         Student farhan = new Student();
         System.out.println("Object = "+farhan);
         farhan.enrollment();
         farhan.addCourse(); 
         farhan.dropCourse();
         farhan.pament();
    }               
} 