package rough.using.lambdafunction.comparator;

import java.util.*;

public class TreeMapSort {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2, "z");
        map.put(3, "f");
        map.put(1, "y");
        System.out.println("Before sorting :: " + map);
        Map<Integer, String> sortedMap = new TreeMap<>((a,b) ->b-a);
        sortedMap.put(2, "z");
        sortedMap.put(3, "f");
        sortedMap.put(1, "y");
        System.out.println("After sorting :: " + sortedMap);

        Student s1 = new Student(12, "A");
        Student s2 = new Student(32, "b");
        Student s3 = new Student(1, "F");
        Student s4 = new Student(2, "x");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list, (a, b) -> b.id-a.id );
        System.out.println(list);

    }

    static class Student{
        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
        public String toString(){
            return this.id + " : " + this.name;
        }
    }
}
