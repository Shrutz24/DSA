package rough;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable r = ()->{System.out.println("Hello World !");};
        r.run();
    }
    private void sayHello(){
        System.out.println("Hello world");
    }
}
