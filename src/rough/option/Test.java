package rough.option;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String name = getName(1);
        System.out.println(name.toUpperCase());
        Optional<String> nameOptional = getNameOptional(1);
        /*if(nameOptional.isPresent()){
            System.out.println(nameOptional.get());
        }*/
        nameOptional.ifPresent(n-> System.out.println(n.toUpperCase()));
        nameOptional.ifPresent(System.out::println);

        Optional<String> nameProvided = providesName(1);
        String nameProvidedHere = nameProvided.isPresent()? nameProvided.get() : "NA";
        System.out.println(nameProvidedHere);

        Optional<String> optional = optionMap(1).map(x->x.toUpperCase());
        optional.ifPresent(System.out::println);


    }
    public static String getName(int id){
        return "Ram";
    }
    public static Optional<String> getNameOptional(int id){
        //String name = "Rama";
        String name = null;
        return Optional.ofNullable(name);
    }
    public static Optional<String> providesName(int id){
        return Optional.empty();
    }
    public static Optional<String> optionMap(int id){
        return Optional.of("tilak");
    }
}
