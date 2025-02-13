package rough;

public class MyClass implements B,A, BInterface{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
        BInterface.sayBye(); //Only way to call a static method defined inthe interface
        sayBye();
    }

    @Override
    public void sayHello() {
       // B.super.sayHello();
        System.out.println("Override Hello");
        BInterface.sayBye(); // Caan be called in the non static block too
    }
    public static void sayBye(){
        System.out.println("In class say bye");
    }

}
