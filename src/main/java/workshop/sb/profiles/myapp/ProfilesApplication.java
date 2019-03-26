package workshop.sb.profiles.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import workshop.sb.profiles.db.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"workshop.sb.profiles.configuration", "workshop.sb.profiles.db"})
public class ProfilesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);

        String url = ctx.getBean("datasource", FakeDataSource.class).getUrl();
        int port = ctx.getBean("datasource", FakeDataSource.class).getPort();
        System.out.println(url + " " + port);

    }
}

/* TODO1 utwórz pakiety:
                            workshop.sb.profiles.configuratiom
                            workshop.sb.profiles.db

*/

/*
    TODO2 w workshop.sb.profiles.db utwórz klasę FakeDataSource, z polami:
                            String url
                            int port
 */

/*  TODO3 utwórz workshop.sb.profiles.configuratiom.DataSourceConfiguration:
                            konfiguracja z z 2 definicjami beanów FakeDataSource:
                            obie definicje będą zwracały bean'y o nazwie 'datasource'
                            pierwsza, profil 'development'
                            druga, profil 'production'

                            utwórz obiekty FakeDataSource o różnych wartościach pól url i port


                            Przykład definicji bean'a

                            @Bean(name="nazwa_ziarna")
                            @Profile("nazwa_profilu")
                            public MyClass beanDefaultName() {
                                return new MyClass();
                            }
*/
/*

    TODO 4 zmień domyślne skanowanie komponentów dla SpringBoot

      dla pakietów 'wychodzących' poza workshop.sb.profiles.configuratiom
*/

// TODO 5 dodaj wpis w application.properties: spring.profiles.active=development

/* TODO 5 w metodzie Application#main
                            pobierz z kontekstu bean'a datasource i
                            wylistuj url i port

                            Obiekt kontekstu w metodzie main:
                            ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);
*/

// TODO 6 zmień aktywny profil na production i uruchom aplikację  - czy coś się zmieniło?
