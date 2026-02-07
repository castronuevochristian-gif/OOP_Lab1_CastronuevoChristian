package coremathlibrary;

public class MathOperation {

    private double result;

    public MathOperation() {
        this.result = 0.0;
    }

    public double getResult() {
        return result;
    }

    
    protected void setResult(double result) {
        this.result = result;
    }

    public void displayResult() {
        System.out.println("Current Result: " + result);
    }
}