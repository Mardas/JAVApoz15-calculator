package pl.sda.spring.operation;

import org.springframework.stereotype.Component;


public class DivisionOperation implements Operation {

    private String exceptionMessage;

    public DivisionOperation(String exceptionMessage){
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public double calculate(double arg1, double arg2) {

            if(arg2!= 0){
                return arg1/arg2;}
            throw new ArithmeticException(exceptionMessage);
    }


    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
