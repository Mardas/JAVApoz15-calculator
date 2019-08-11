package pl.sda.spring.operation;

public class PowerOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        if(arg2>=0){
            return Math.pow(arg1,arg2);
        } throw new ArithmeticException("Minus value of power");
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.POWER;
    }
}
