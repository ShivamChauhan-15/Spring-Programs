package Config;

import aop.AspectAop;
import org.example.PaymentImplementClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@ComponentScan(basePackages = "org.example,aop")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public AspectAop createAspect(){
        return new AspectAop();
    }
    @Bean
    public PaymentImplementClass createPayment(){
        return new PaymentImplementClass();
    }


}
