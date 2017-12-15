public class Student extends Person{
    int aweLevel;
    Section studentSection;
    public Student(String firstName, String lastName, int aweLevel, Section studentSection){
        super(firstName, lastName);
        this.aweLevel = aweLevel;
        this.studentID = 0;
        this.studentSection = studentSection;
    }

}
