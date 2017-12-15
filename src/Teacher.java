public class Teacher extends Person{
    String subject;
    static int teacherID = 0;

    public Teacher(String firstName, String lastName, String subject){
         super (firstName, lastName);
        this.subject = subject;
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}