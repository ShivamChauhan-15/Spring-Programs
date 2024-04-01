package Configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        System.out.println("DataSourceConfig class");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://127.0.1.1:43967/~/h2/test");
        dataSource.setUsername("Shivam1");
        dataSource.setPassword("123");
        return dataSource;
    }
}

