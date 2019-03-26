package workshop.sb.profiles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import workshop.sb.profiles.db.FakeDataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(name = "datasource")
    @Profile("development")
    public FakeDataSource fakeDataSourceDevelopment() {
        return new FakeDataSource("development-url", 8081);
    }

    @Bean(name = "datasource")
    @Profile("production")
    public FakeDataSource FakeDataSourceProduction() {
        return new FakeDataSource("production-url", 8082);
    }


}
