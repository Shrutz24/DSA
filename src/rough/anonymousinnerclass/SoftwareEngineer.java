package rough.anonymousinnerclass;

public class SoftwareEngineer implements Employee{
    @Override
    public String getSalary() {
        return "10";
    }

    @Override
    public String getDesignation() {
        return "Software Engineer";
    }
}
