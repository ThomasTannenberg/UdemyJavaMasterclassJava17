public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        System.out.println("add= " + this.firstNumber + this.secondNumber);
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        System.out.println("substract= " + (this.firstNumber - this.secondNumber));
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        System.out.println("multiply= " + (this.firstNumber * this.secondNumber));
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        } else {
            System.out.println("divide= " + (this.firstNumber / this.secondNumber));
            return this.firstNumber / this.secondNumber;
        }
    }

}
