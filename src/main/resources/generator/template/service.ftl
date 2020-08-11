package ${basePackage}.service;

import ${basePackage}.entity.${modelNameUpperCamel};
import org.springframework.beans.factory.annotation.Autowired;
import ${basePackage}.mapper.${modelNameUpperCamel}Mapper;
import ${basePackage}.base.BaseService;
import org.springframework.stereotype.Service;


/**
 * ${remark}的Service
 * @author ${author}
 * @date ${date}
 */
@Service
public class ${modelNameUpperCamel}Service extends BaseService<${modelNameUpperCamel}> {

    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;


}
