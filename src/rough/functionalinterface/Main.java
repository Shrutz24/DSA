package rough.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = x-> x.length();
        Function<String, String> function1 = x -> x.substring(0, 3);
        Function<List<Student>, List<Student>> studentWithShrAsPrefix = list -> {
            List<Student> results = new ArrayList<>();
            for(Student student : list){
                if(function1.apply(student.getName()).equalsIgnoreCase("shr")){
                    results.add(student);
                }
            }
            return results;
        };
        Student s1 = new Student(1, "shruti");
        Student s2 = new Student(2, "shrutika");
        Student s3 = new Student(3, "shrutali");
        Student s4 = new Student(4, "anandi");
        Student s5 = new Student(5, "sumedha");
        List<Student> all = new ArrayList<>();

        all.add(s1);
        all.add(s2);
        all.add(s3);
        all.add(s4);
        all.add(s5);




        System.out.println(function.apply("Shruti"));
        System.out.println(function1.apply("Shruti"));
        List<Student> filtered = studentWithShrAsPrefix.apply(all);
        for(Student student : filtered){
            System.out.println(student.getName());
        }
    }

    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
