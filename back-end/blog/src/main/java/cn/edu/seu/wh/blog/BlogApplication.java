package cn.edu.seu.wh.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * @program:blog
 * @description:blog springboot Application类
 * @author: Huan Wang(https://github.com/njustwh2014)
 * @create:2020-02-21 11:41
 **/
@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize("30MB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("1000MB");
        return factory.createMultipartConfig();
    }
}
