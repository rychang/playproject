package conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"controllers", "services"})
public class AppConf {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
