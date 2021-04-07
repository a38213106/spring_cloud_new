package spring_clound.zhaocong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "spring_clound.zhaocong.mapper")
@SpringBootApplication
@EnableSwagger2
public class SpringCloundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundApplication.class, args);
    }

}
