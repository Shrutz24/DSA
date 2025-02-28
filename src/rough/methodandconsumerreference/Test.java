package rough.methodandconsumerreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Shruti", "Suchita", "Yash", "Ankit", "Owais");
        //students.forEach(x-> System.out.println(x));
        students.forEach(Test::print); //This is the syntax of method reference

        List<String> names = Arrays.asList("Shruti", "Suchita", "Yash", "Ankit", "Owais");
        //List<Student> student = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
        List<Student> student = names.stream().map(Student::new).collect(Collectors.toList()); //Thsi is constructor reference

    }
}
