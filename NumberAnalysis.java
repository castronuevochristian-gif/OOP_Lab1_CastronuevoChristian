package coremathlibrary;

public class NumberAnalysis extends MathOperation {

    private int number;

    // Setter
    public void setNumber(int num) {
        this.number = num;
    }

    // Check if Prime
    public boolean isPrime() {
        if (number <= 1) return false; // 0 and 1 are not prime
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // It has a divisor, so it's NOT prime
            }
        }
        return true; // It IS prime
    }

    // Calculate Factorial (5! = 120)
    public void computeFactorial() {
        if (number < 0) {
            System.out.println("Error: Factorial undefined for negative numbers.");
            setResult(-1);
            return;
        }
        
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        setResult((double) fact);
    }
}