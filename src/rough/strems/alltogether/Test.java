package rough.strems.alltogether;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test{
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("Hello World!!");
        };
        r.run();

        Operations add = (a,b)->a+b;
        Operations sub = (a,b)->a-b;
        Operations mul = (a,b)->a*b;
        Operations div = (a,b)->a/b;
        Operations modulo = (a,b)->a%b;

        System.out.println(add.operation(10,20));
        System.out.println(sub.operation(10,20));
        System.out.println(mul.operation(10,20));
        System.out.println(div.operation(10,20));
        System.out.println(modulo.operation(10,20));

        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(5));
        Predicate<String> startsWithS = x-> x.toLowerCase().startsWith("s");
        Predicate<String> endsWithI = x->x.toLowerCase().endsWith("i");
        System.out.println(startsWithS.test("Diwakar"));
        System.out.println(startsWithS.and(endsWithI).test("Diwakar"));


        Function<String, String> appendItself = x -> x + x;
        System.out.println(appendItself.apply("cat"));
        Function<String, Integer> originqaLength = x->x.length()/2;
        System.out.println(appendItself.apply("kanyakumari"));
        System.out.println(appendItself.andThen(originqaLength).apply("kanyakumari"));


        Predicate<Integer> predicate1 = x->x%2==0;
        Function<Integer, Integer> function = x->x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = ()->100;

        if(predicate1.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }



    }
    public void greet(){
        System.out.println("Hello");
    }


}

interface Operations{
    int operation(int a, int b);
}