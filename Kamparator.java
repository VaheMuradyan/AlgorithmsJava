import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Kamparator {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Alice", 85),
                        new Student("Bob", 85),
                        new Student("Charlie", 90)
                )
        );

        students.sort(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getName));
        System.out.println(students); // Output: [Alice:90, Bob:85, Charlie:85]

    }
}

class Student {

    String name;

    int grade;


    Student(String name, int grade) {

        this.name = name;

        this.grade = grade;

    }


    public int getGrade() {return this.grade;}

    public String getName() {return this.name;}

    public String toString() {

        return name + ":" + grade;

    }

}
