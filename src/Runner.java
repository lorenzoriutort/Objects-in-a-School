import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Runner {

    static ArrayList<Student> allStudents = new ArrayList<Student>();
    //static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Section> allSections = new ArrayList<Section>();

    public static void search(String firstName, String lastName) {
        int count = 0;
        for (int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).firstName == firstName && allStudents.get(i).lastName == lastName) {
                count++;
                System.out.println(count + ": " + firstName + " " + lastName + " is in " + allStudents.get(i).studentSection.name + " class.");
            }
        }
    }

    public static String teacherFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the first name of the this class's teacher be? ");
        String in = sc.next();
        return in;
    }

    public static String teacherLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this teachers last name? ");
        String a = sc.next();
        return a;
    }

    public static String studentFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this students first name?");
        String k = sc.next();
        return k;
    }

    public static String studentLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this students last name?");
        String k = sc.next();
        return k;
    }

    public static void getAllStudent() {
        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println((i) + "Student: " + allStudents.get(i).firstName + " " + allStudents.get(i).lastName + ", " + allStudents.get(i).studentSection.name);
        }
    }

    public static void createClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What subject is this class? ");
        String a = sc.next();
        String c = teacherFirstName();
        String d = teacherLastName();
        System.out.println("What is the max number of students that can be in this class? ");
        int b = sc.nextInt();
        Section Class = new Section(a, b, c, d);

        //System.out.println("You have made: " + Class.name + " class, with " + Class.maxSize + " students, " + Class.teacher.firstName + " " + Class.teacher.lastName + ".");
        System.out.println("How many students would you like to add to this class? ");
        int e = 0;
        if (sc.hasNextInt()) {
            e = (sc.nextInt());
        }
        if (!sc.hasNextInt()) {
            System.out.println("You did not enter an integer. Please try again ");
            if (sc.hasNextInt()) {
                e = sc.nextInt();
            }
        }
        for (int i = 0; i < e; i++) {
            System.out.println(" ");
            System.out.println("Student number " + (i+1) + " out of " + e + ".");
            System.out.println(" ");
            String z = studentFirstName();
            String y = studentLastName();
            System.out.println("How awesome is this student? (scale of 1-10 and make sure it is an integer)");
            int m = 0;
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            }int n = 0;
            if (!sc.hasNextInt()) {
                System.out.println("Error: You did not enter an integer. Please try again");
                System.out.println("How awesome is this student? ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }
            }
            Student student = new Student (z,y,(m+n),Class);
            Class.addStudent(student);
            allStudents.add(Class.students.get(i));
        }
        allSections.add(Class);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Welcome to class creator 3000! What is your name? ");
        String f = sc.next();
        if (f.length()<1) {
            System.out.println("Error...Please enter your name ");
            f = sc.next();
        }
        System.out.println(f + ", how many classes would you like to create for your new school?! ");
        int g = 0;
        if (sc.hasNextInt()) {
            g = (sc.nextInt());
        } else if (!sc.hasNextInt()) {
            System.out.println("You did not enter an integer. Please try again ");
            if (sc.hasNextInt()) {
                g = sc.nextInt();
            }
        }
        for (int i = 1; i < (g+1); i++){
            createClass();
        }
        System.out.println("would you like to remove a student? ");
        String h = sc.next();
        if (h.equals("yes")){
        System.out.println("Please enter the number of a students that you would like removed. ");
        for (int i = 0; i < allStudents.size(); i++) {
               //System.out.println(allStudents.get(i).removeStudent());
               //removeStudent();
            }
        }
        int c = (sc.nextInt()-1);
        allStudents.get(c).studentSection.removeStudent(studentLastName());
        allStudents.remove(c);
        System.out.println("Enter the name of a student that you would like to search");
        String d = studentFirstName();
        String e = studentLastName();
        search(d, e);
    }
}
