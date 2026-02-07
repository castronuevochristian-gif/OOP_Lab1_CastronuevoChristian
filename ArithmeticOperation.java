package coremathlibrary;

public class ArithmeticOperation extends MathOperation {

    private double operand1;
    private double operand2;

    public void setOperands(double op1, double op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    public void add() {
        double sum = operand1 + operand2;
        setResult(sum);
    }

    public void subtract() {
        setResult(operand1 - operand2);
    }

    public void multiply() {
        setResult(operand1 * operand2);
    }

    public void divide() {
        if (operand2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            setResult(0);
        } else {
            setResult(operand1 / operand2);
        }
    }
}