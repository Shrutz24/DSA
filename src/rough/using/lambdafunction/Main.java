package rough.using.lambdafunction;

import rough.using.lambdafunction.impl.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Understanding lambda functions");
        /*Employee softwareDeveloper = new SoftwareDeveloper();
        System.out.println(softwareDeveloper.getName());*/

        //Functional interface acts as a datatype for lambda expression
        //Here there is no any need to create SoftwareDeveloper class
        Employee softwareDeveloper = () -> "Software Developer"; //This is the implementation of getName method.
        System.out.println(softwareDeveloper.getName());
    }
}
