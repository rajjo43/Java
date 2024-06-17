package firstPackage;

public class Hierarchical_Inheritance {

    public static double hierarchicalInheritance(double t, double x) {
        // Innermost Calculation
        double innermostResult = Math.sqrt((24 * t) / 2);

        // Second Level Calculation
        double secondLevelResult = Math.sqrt(innermostResult / (Math.sqrt(x * t) + 100));

        // Third Level Calculation
        double thirdLevelResult = Math.sqrt(secondLevelResult);

        return thirdLevelResult;
    }

    public static void main(String[] args) {
        // Example values for t and x
        double t = 10;
        double x = 5;

        // Calculate m using hierarchical inheritance
        double m = hierarchicalInheritance(t, x);
        System.out.println("The value of m is: " + m);
    }
}

