package rough.using.lambdafunction.threads;

public class MyClass implements Runnable {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();
    }


    @Override
    public void run() {
        for(int i=0; i<=10; ++i){
            System.out.println("Hello :: " +i);
        }
    }
}
