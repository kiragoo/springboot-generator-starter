package com.kirago.generator.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class XMLConfig {
    
    public static String PATH_JAVAMODELGENERATOR_TARGETPACKAGE;
    
    public static String PATH_JAVAMODELGENERATOR_TARGETPROJECT;
    
    public static String PATH_SQLMAPGENERATOR_TARGETPACKAGE;

    public static String PATH_SQLMAPGENERATOR_TARGETPROJECT;

    public static String PATH_JAVACLIENTGENERATOR_TARGETPACKAGE;

    public static String PATH_JAVACLIENTGENERATOR_TARGETPROJECT;
    
    public static String DBCONFIG_DRIVERCLASS;
    
    public static String DBCONFIG_CONNECTIONURL;
    
    public static String DBCONFIG_USERID;
    
    public static String DBCONFIG_PASSWORD;
    
    public static String PATH_JAVASERVICEGENERATOR_PATH;
    
    public static String PATH_JAVACONTROLLERGENERATOR_PATH;

    @Value("${path.javaModelGenerator.targetPackage}")
    public void setPathJavamodelgeneratorTargetpackage(String s){
        PATH_JAVAMODELGENERATOR_TARGETPACKAGE = s;
    }

    @Value("${path.javaModelGenerator.targetProject}")
    public void setPathJavamodelgeneratorTargetproject(String s){
        PATH_JAVAMODELGENERATOR_TARGETPROJECT = s;
    }

    @Value("path.sqlMapGenerator.targetPackage")
    public void setPathSqlmapgeneratorTargetpackage(String s){
        PATH_SQLMAPGENERATOR_TARGETPACKAGE = s;
    }

    @Value("path.sqlMapGenerator.targetProject")
    public void setPathSqlmapgeneratorTargetproject(String s){
        PATH_SQLMAPGENERATOR_TARGETPROJECT = s;
    }

    @Value("path.javaClientGenerator.targetPackage")
    public void setPathJavaclientgeneratorTargetpackage(String s){
        PATH_JAVACLIENTGENERATOR_TARGETPACKAGE = s;
    }

    @Value("path.javaClientGenerator.targetProject")
    public void setPathJavaclientgeneratorTargetproject(String s){
        PATH_JAVACLIENTGENERATOR_TARGETPROJECT = s;
    }

    @Value("${dbconfig.driverClass}")
    public void setDbconfigDriverclass(String s){
        DBCONFIG_DRIVERCLASS = s;
    }

    @Value("${dbconfig.connectionUrl}")
    public void setDbconfigConnectionurl(String s){
        DBCONFIG_CONNECTIONURL = s;
    }

    @Value("${dbconfig.userId}")
    public void setDbconfigUserid(String s){
        DBCONFIG_USERID = s;
    }

    @Value("${dbconfig.password}")
    public void setDbconfigPassword(String s){
        DBCONFIG_PASSWORD = s;
    }

    @Value("${path.javaServiceGenerator.path}")
    public void setPathJavaservicegeneratorPath(String s){
        PATH_JAVASERVICEGENERATOR_PATH = s;
    }

    @Value("${path.javaControllerGenerator.path}")
    public void setPathJavacontrollergeneratorPath(String s){
        PATH_JAVACONTROLLERGENERATOR_PATH = s;
    }
}
