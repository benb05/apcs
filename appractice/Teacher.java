import java.util.ArrayList;

public class Teacher{
    private String name;
    private int grade;

   public Teacher(){
       
   }
    public Teacher(String _name, int _grade){
        name = _name;
        grade = _grade;
    }
    public static void main(String[] args) {
        
    Teacher amanda = new Teacher("Amanda", 11);
     ArrayList teacherlist = new ArrayList();
     teacherlist.add(amanda);

    
    }
}