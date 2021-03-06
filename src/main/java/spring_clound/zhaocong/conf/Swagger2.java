package spring_clound.zhaocong.conf;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger2的配置类
 */
@Configuration
public class Swagger2 {
    public Docket creatRestAPI(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("spring_clound.zhaocong"))
                .paths(PathSelectors.any()).build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("customer-service 文档").description("用户对外服务接口文档")
                .termsOfServiceUrl("/").version("1.0").build();
    }
}
