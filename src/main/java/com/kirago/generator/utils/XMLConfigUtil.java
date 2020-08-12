package com.kirago.generator.utils;

import com.kirago.generator.config.XMLConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class XMLConfigUtil {
    
    private final String GENERATOR_CONFIG_FTL_FILE = "generatorConfig.ftl";
    
    private final String GENERATOR_CONFIG_OUT_FILE = "generatorConfig.xml";
            
    private Configuration configuration;
    
    
    public XMLConfigUtil(){
        configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("utf-8");
    }
    
    public void createGeneratorConfig(){
        Map<String, Object> dataMap =  createDataMap();
        
        try {
            configuration.setClassForTemplateLoading( this.getClass(), "/generator/template" );
            Template template = configuration.getTemplate("test.ftl", "utf-8");
            String file = ResourceUtils.getURL("classpath:").getPath() + "test.txt";
            File outPutFile = new File(file);
            if(!outPutFile.exists()){
                FileUtils.touch(new File(file));
            }
            Writer o = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(ResourceUtils.getFile("classpath:test.txt")),
                    "utf-8"),10240);
            template.process(dataMap, o);
            o.close();
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }
    
    private  Map<String, Object> createDataMap(){
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("dbconfig.userId", XMLConfig.DBCONFIG_USERID);
        return dataMap;
    }
    
}
