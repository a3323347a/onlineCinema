package com.movie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zjx
 * @date 2019/9/5 15:19
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.movie")) //扫描controller接口所在的包，对controller进行监控
                .paths(PathSelectors.any()) //对所有的路径进行处理
                .build();
    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("影院后台接口文档")
                .description("影院后台接口文档Swagger版")
                .termsOfServiceUrl("https://www.gz-yami.com/")
                .contact(new Contact("广州亚米信息科技有限公司","https://www.gz-yami.com/", ""))
                .version("1.0")
                .build();
    }
}
