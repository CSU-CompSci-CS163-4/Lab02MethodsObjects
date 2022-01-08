public class MethodsObjects {
    //Step 1
    public static double calculateSalary(double hourlyWage) {
        //TODO: STUDENT
        return 0; //This line will be changed
    }

    //Step 2
    public static double calculateSalaryTax(double salary, double taxRate) {
        //TODO: STUDENT
        return 0; //This line will be changed
    }

    //Steps 3-5 are within the Pizza.java file you can select
    //within the dropdown in zybooks.

    //Step 6
    public static double calculateAfterPizzaSalary(double afterTaxSalary, double yearlyPizzaCost) {
        //TODO: STUDENT
        return 0; //This line will be changed
    }

    //Step 7
    public static void main(String[] args) {
        System.out.println("calculateSalary Test:");
        double salary = calculateSalary(15);
        System.out.println("Expected value: 30000, Actual value: " + salary);
        
        Pizza firstPizza = new Pizza();
        firstPizza.setRadius(6);

        System.out.println("calculateArea Test:");
        double firstArea = firstPizza.calculateArea();
        System.out.println("Expected value: 113.04, Actual value: " + firstArea);

        //Continue testing your methods down here!
    }
}