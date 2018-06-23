package june.hodor.together.springplayground.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import june.hodor.together.springplayground.chapter3.DessertWithParam.MyParam;

@Configuration
public class DessertConfiguration {

    @Bean
    public MyParam getDessertParam() {
        return new MyParam(100);
    }

    @Bean
    public Dessert getDessertWithParam(MyParam param) {
        return new DessertWithParam(param);
    }

}
