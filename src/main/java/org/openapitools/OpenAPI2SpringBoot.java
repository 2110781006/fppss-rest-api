package org.openapitools;

import com.fasterxml.jackson.databind.Module;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.util.Properties;

@SpringBootApplication
@EnableAdminServer
@ComponentScan(basePackages = {"org.openapitools", "org.openapitools.api" , "org.openapitools.configuration"})
public class OpenAPI2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {

        KeyStore ks = KeyStore.getInstance("JKS");
        //ks.load(new FileInputStream("C:\\Program Files\\Java\\jdk-18.0.2.1\\bin\\fppss-keystore.jks"), "xxxx".toCharArray());
        String keyStorePath = System.getenv("FPPSS_KEYSTORE_PATH")+"/"+System.getenv("FPPSS_KEYSTORE_FILENAME");
        ks.load(new FileInputStream(keyStorePath), System.getenv("FPPSS_KEYSTORE_PASSWORD").toCharArray());

        new SpringApplication(OpenAPI2SpringBoot.class).run(args);
    }

    static class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }

    @Bean
    public WebMvcConfigurer webConfigurer() {
        return new WebMvcConfigurer() {
            /*@Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*").allowedHeaders("*")

                        .allowedHeaders("Content-Type");
            }*/
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }

        };
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}
