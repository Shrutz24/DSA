package rough.predicates;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> salGreaterthanOneL = x -> x > 100000;
        System.out.println(salGreaterthanOneL.test(1000));
        System.out.println(salGreaterthanOneL.test(100000000));
        Predicate<String> startsWithV = x->x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithL = x->x.toLowerCase().charAt(x.length()-1) == 'l';
        Predicate<String> and = startsWithV.and(endsWithL);
        System.out.println(and.test("Vipul"));

        Predicate<String> or = startsWithV.or(endsWithL);
        System.out.println(or.test("hvinaylp"));

        //negate means not
        Predicate<String> negate = startsWithV.negate();
        System.out.println(negate.test("Vinayak"));

        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("Rama", 2);

        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(s1));
        System.out.println(studentPredicate.test(s2));

        Predicate<Object> predicate = Predicate.isEqual("Shruti");
        System.out.println(predicate.test("Shrut"));

    }

    private static class Student{
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
