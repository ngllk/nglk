package sample;

public class Calculator
{
    double number1;
    double number2;
    byte operation;
    String result;
    boolean isFirstCalculation;
    private double memory;


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public byte getOperation() {
        return operation;
    }

    public void setOperation(byte operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public void setFirstCalculation(boolean isFirstCalculation)
    { this.isFirstCalculation = isFirstCalculation;}

    public boolean isFirstCalculation() {
        return this.isFirstCalculation;
    }

    public Calculator() {
        number1 = 0;
        number2 = 0;
        operation = 0;
        result = "0";
        isFirstCalculation = true;
    }

    public void calculate()
    {
        switch (operation)
        {
            case 1 :  // +
                result = String.valueOf(number1 + number2);
                break;
            case 2 :  // -
                result = String.valueOf(number1 - number2);
                break;
            case 3 :  // *
                result = String.valueOf(number1 * number2);
                break;
            case 4 :  // /
                result = number2 == 0? "Division by zero" : String.valueOf(number1 / number2);
                break;
            case 5 :  // x^y
                result = String.valueOf(Math.pow(number1,  number2));
                break;
            case 6 : // √
                result = number1 < 0? "No SQRT from negative" : String.valueOf(Math.sqrt(number1));
                break;
            default:
                result = "Unknown operation";
        }

        result = result.endsWith("0")?result.substring(0,result.length()-2):result;

    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}