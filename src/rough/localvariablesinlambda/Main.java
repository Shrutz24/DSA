package rough.localvariablesinlambda;

public class Main {
    int a = 2;
    public static void main(String[] args) {
        dosomething();
    }
    private static void dosomething(){

        Employee employee = ()->{
           int a = 4;
            //int b=3;
            return "100";
        };
        System.out.println(employee.getSalary());
        Employee employee1 = new Employee() {
            int x = 10;
            @Override
            public String getSalary() {
                System.out.println(this.x);
                return "sal";
            }
        };
        System.out.println(employee1.getSalary());
    }
}
