package pl.sda.spring.operation;

import org.springframework.stereotype.Component;


public class PercentageOperation implements Operation{
    @Override
    public double calculate(double arg1, double arg2) {
        if(arg2!=0){
            return (arg1/arg2)*100;}
        throw new ArithmeticException("No division by zero");
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
