package rough.anonymousinnerclass;

public class Main {
    public static void main(String[] args) {
        /*Employee employee = new SoftwareEngineer();
        System.out.println(employee.getSalary());*/

        //This is an anonymous inner class
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "1000";
            }

            @Override
            public String getDesignation() {
                return "Software Developer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());

    }
}
