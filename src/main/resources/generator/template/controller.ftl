package ${basePackage}.controller;

import ${basePackage}.base.BaseController;
import ${basePackage}.service.${modelNameUpperCamel}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


/**
 * ${remark}的Controller
 * @author ${author}
 * @date ${date}
 */
@RestController
@RequestMapping("${modelNameLowerCamel}")
public class ${modelNameUpperCamel}Controller extends BaseController {

    @Autowired
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @GetMapping()
    public ResponseEntity<Object> get${modelNameUpperCamel}List() {
        return ResponseEntity.ok(${modelNameLowerCamel}Service.selectAll());
    }

    @PostMapping()
    public ResponseEntity<Object> post${modelNameUpperCamel}() {
        return ResponseEntity.ok(${modelNameLowerCamel}Service.insert(null));
    }

    @PutMapping()
    public ResponseEntity<Object> put${modelNameUpperCamel}() {
        return ResponseEntity.ok(${modelNameLowerCamel}Service.update(null));
    }

    @DeleteMapping()
    public ResponseEntity<Object> delete${modelNameUpperCamel}(@RequestBody @Valid Object id) {
        return ResponseEntity.ok(${modelNameLowerCamel}Service.deleteByPrimaryKey(id));
    }
}
