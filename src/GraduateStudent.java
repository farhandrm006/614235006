public class GraduateStudent{
    String studyLevel;
    String thesisAdviser;
    
    void studyLevel(){
      System.out.println("GraduateStudent oralExamination");
    }
    void thesisAdviser(){
      System.out.println("GraduateStudent thesisAdviser");
    }
    public static void main(String[] args){
         GraduateStudent farhan = new GraduateStudent();
         System.out.println("Object = "+farhan);
         farhan.studyLevel();
         farhan.thesisAdviser();
         gs.payment();
         gs.addCourse(); 
         gs.dropCourse();
         
}
}