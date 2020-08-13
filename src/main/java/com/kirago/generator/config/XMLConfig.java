package com.kirago.generator.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class XMLConfig {

    @Value("${path.javaModelGenerator.targetPackage}")
    public String PATH_JAVAMODELGENERATOR_TARGETPACKAGE;

    @Value("${path.javaModelGenerator.targetProject}")
    public String PATH_JAVAMODELGENERATOR_TARGETPROJECT;

    @Value("${path.sqlMapGenerator.targetPackage}")
    public String PATH_SQLMAPGENERATOR_TARGETPACKAGE;

    @Value("${path.sqlMapGenerator.targetProject}")
    public String PATH_SQLMAPGENERATOR_TARGETPROJECT;

    @Value("${path.javaClientGenerator.targetPackage}")
    public String PATH_JAVACLIENTGENERATOR_TARGETPACKAGE;

    @Value("${path.javaClientGenerator.targetProject}")
    public String PATH_JAVACLIENTGENERATOR_TARGETPROJECT;

    @Value("${dbconfig.driverClass}")
    public String DBCONFIG_DRIVERCLASS;

    @Value("${dbconfig.connectionUrl}")
    public String DBCONFIG_CONNECTIONURL;

    @Value("${dbconfig.userId}")
    public String userid;

    @Value("${dbconfig.password}")
    public String DBCONFIG_PASSWORD;

    @Value("${path.javaServiceGenerator.path}")
    public String PATH_JAVASERVICEGENERATOR_PATH;

    @Value("${path.javaControllerGenerator.path}")
    public String PATH_JAVACONTROLLERGENERATOR_PATH;
    
//       public void setPathJavamodelgeneratorTargetpackage(String s){
//           PATH_JAVAMODELGENERATOR_TARGETPACKAGE = s;
//       }
//    
//       public void setPathJavamodelgeneratorTargetproject(String s){
//           PATH_JAVAMODELGENERATOR_TARGETPROJECT = s;
//       }
//    
//       public void setPathSqlmapgeneratorTargetpackage(String s){
//           PATH_SQLMAPGENERATOR_TARGETPACKAGE = s;
//       }
//    
//       public void setPathSqlmapgeneratorTargetproject(String s){
//           PATH_SQLMAPGENERATOR_TARGETPROJECT = s;
//       }
//    
//       public void setPathJavaclientgeneratorTargetpackage(String s){
//           PATH_JAVACLIENTGENERATOR_TARGETPACKAGE = s;
//       }
//    
//       public void setPathJavaclientgeneratorTargetproject(String s){
//           PATH_JAVACLIENTGENERATOR_TARGETPROJECT = s;
//       }
//    
//       public void setDbconfigDriverclass(String s){
//           DBCONFIG_DRIVERCLASS = s;
//       }
//    
//       public void setDbconfigConnectionurl(String s){
//           DBCONFIG_CONNECTIONURL = s;
//       }
//    
//       public void setDbconfigUserid(String s){
//           DBCONFIG_USERID = s;
//       }
//    
//       public void setDbconfigPassword(String s){
//           DBCONFIG_PASSWORD = s;
//       }
//    
//       public void setPathJavaservicegeneratorPath(String s){
//           PATH_JAVASERVICEGENERATOR_PATH = s;
//       }
//    
//       public void setPathJavacontrollergeneratorPath(String s){
//           PATH_JAVACONTROLLERGENERATOR_PATH = s;
//       }
}
