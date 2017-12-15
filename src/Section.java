import java.util.ArrayList;

public class Section {
    String name;
    int maxSize = 0;
    int currentSize = 0;
    Teacher teacher;
    Student student;
    //build array list to hold your students

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    //makes a new section
    public Section (String name, int maxSize, String firstName, String lastName) {
        this.name = name;
        this.maxSize = maxSize;
        currentSize = students.size();
        this.teacher = teacher;
        this.student = student;
    }

    public void addStudent(Student student){
        //add one to current size here
        //add the student that is passed in (student) to array list
        currentSize++;
        students.add(student);
    }

    public void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).firstName.equals(id)) {
                students.remove(Student.ID);
            }
        }
        currentSize = students.size();
    }

    public void printStudents() {
        System.out.print(students);
        currentSize = students.size();
    }

    public void spacesLeft(){
        int spaces = maxSize - currentSize;
        System.out.print("There are " + spaces + " available spaces in this class");
    }
}