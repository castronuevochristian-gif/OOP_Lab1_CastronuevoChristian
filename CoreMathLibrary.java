package coremathlibrary;

public class CoreMathLibrary {

    public static void main(String[] args) {
        
        System.out.println("=== Core Math Library Test ===\n");

        // _________________________________________________________
        // [TEST GROUP 2: Arithmetic Module]
        // _________________________________________________________
        System.out.println("--- Arithmetic Operations ---");
        ArithmeticOperation mathOp = new ArithmeticOperation();
        
        // 1. Set the numbers (Encapsulation)
        mathOp.setOperands(15, 10);
        
        // 2. Test Addition
        mathOp.add();
        System.out.print("15 + 10: ");
        mathOp.displayResult(); // Should print 25.0

        // 3. Test Division
        mathOp.divide();
        System.out.print("15 / 10: ");
        mathOp.displayResult(); // Should print 1.5

        
        // _________________________________________________________
        // [TEST GROUP 3: Geometry Module]
        // _________________________________________________________
        System.out.println("\n--- Geometry Operations ---");
        GeometryOperation geoOp = new GeometryOperation();
        
        // 1. Test Circle Area (Radius = 5)
        geoOp.setDimension1(5);
        geoOp.ComputeCircleArea(); // This prints the result directly inside the method

        // 2. Test Rectangle Area (5 x 10)
        geoOp.setDimension1(5);
        geoOp.setDimension2(10);
        geoOp.ComputeRectangleArea(); // This prints the result directly inside the method

        
        // _________________________________________________________
        // [TEST GROUP 4: Number Analysis]
        // _________________________________________________________
        System.out.println("\n--- Number Analysis ---");
        NumberAnalysis numOp = new NumberAnalysis();
        
        // 1. Test Prime Check
        numOp.setNumber(7);
        boolean isPrime = numOp.isPrime();
        System.out.println("Is 7 Prime? " + isPrime); // Should be true

        // 2. Test Factorial
        numOp.setNumber(5);
        numOp.computeFactorial();
        System.out.print("Factorial of 5: ");
        numOp.displayResult(); // Should be 120.0
    }
}