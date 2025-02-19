package rough.strems.alltogether;

//Intermediate operatrions convert one stream to some other stream.
//They are lazy as they do not get invoked untill and unless termaila operatior is invoked.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shruti", "Suchita", "Yash", "Owais", "Gaffur", "Mayur", "Hritika", "Suchita", "Yash", "Owais", "Gaffur", "Mayur", "Hritika");

        //filter

        Stream<String> s1 = names.stream().filter(s -> s.toLowerCase().startsWith("s")).limit(1);
        //No operation as terminal operator is not applied
        //s1.count();
        System.out.println(s1.count());

        //map
        Stream<String> s2 = names.stream().map(String::toUpperCase);
        //System.out.println(s2);

        //sorted
        Stream<String> s3 = names.stream().map(String::toLowerCase).sorted();
        Stream<String> s4 = names.stream().map(String::toLowerCase).sorted((a, b)->b.length()-a.length());

        //distinct
        Stream<String> s5 = names.stream().distinct();
        
        //limit
        Stream<String> s6 = names.stream().limit(5);
    
        //skip
        names.stream().skip(5);




    }
    
}
