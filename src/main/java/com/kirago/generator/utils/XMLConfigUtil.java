package com.kirago.generator.utils;

import com.kirago.generator.config.XMLConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class XMLConfigUtil {
    
    private final String GENERATOR_CONFIG_FTL_FILE = "generatorConfig.ftl";
    
    private final String GENERATOR_CONFIG_OUT_FILE = "src/main/resources/generator/test.txt";
    
    private Configuration configuration;
    
    @Autowired
    private XMLConfig xmlConfig;
    
    
    public XMLConfigUtil(){
        configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("utf-8");
    }
    
    public void createGeneratorConfig(){
        Map<String, Object> dataMap =  createDataMap();
        
        try {
            configuration.setClassForTemplateLoading( this.getClass(), "/generator/template" );
            Template template = configuration.getTemplate("test.ftl", "utf-8");
//            String file = ResourceUtils.getURL("classpath:").getPath() + "test.txt";
            File outPutFile = new File(GENERATOR_CONFIG_OUT_FILE);
            if(!outPutFile.exists()){
                FileUtils.touch(outPutFile);
            }
            Writer o = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outPutFile),
                    "utf-8"),10240);
            template.process(dataMap, o);
            o.close();
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }
    
    private  Map<String, Object> createDataMap(){
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("config", xmlConfig);
        return dataMap;
    }
    
}
