package pl.sda.spring.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DivisionOperationConfiguaration {


    private String EXCEPTION_MESSAGE = "No division by zero";



    @Bean
    DivisionOperation divisionOperation(){
        return new DivisionOperation(EXCEPTION_MESSAGE);
    }
}
