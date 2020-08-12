package com.kirago.generator;

import com.kirago.generator.plugins.GeneratorPlugin;
import com.kirago.generator.utils.XMLConfigUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootGeneratorStarterApplication {

    public static void main(String[] args) {
        try {
            ApplicationContext context = SpringApplication.run(SpringbootGeneratorStarterApplication.class, args);
            GeneratorPlugin generatorPlugin = context.getBean(GeneratorPlugin.class);
            
            XMLConfigUtil xmlConfigUtil = context.getBean(XMLConfigUtil.class);
            
            log.info("正在生成xml配置文件");
            xmlConfigUtil.createGeneratorConfig();
            
            log.info("正在生成项目脚手架");
            generatorPlugin.generator(); 
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

}
