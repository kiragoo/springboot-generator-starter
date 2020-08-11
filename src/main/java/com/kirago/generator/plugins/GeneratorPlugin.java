package com.kirago.generator.plugins;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kirago
 * @date 2020/8/11 17:07
 * @description 代码生成器的入口参数
 * @version version-1.0
 */


@Slf4j
public class GeneratorPlugin {
    public static void main(String[] args) throws Exception {
        File configFile =  ResourceUtils.getFile("classpath:generator/generatorConfig.xml");
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        log.info("生成成功");
    }
}
