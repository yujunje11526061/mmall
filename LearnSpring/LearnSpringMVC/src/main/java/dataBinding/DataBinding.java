package dataBinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@ResponseBody
public class DataBinding {

    @RequestMapping(value = "baseType.do")
    public String baseType(@RequestParam(value = "指定参数名", required = false, defaultValue = "100") int age){
        // 请求参数注解，可以另外指定参数名，required默认为true，此时基本类型不传则报错，包装类型不传则默认为null。如果required为false，可以设置默认值。
        return "age: "+age;
    }

    @RequestMapping(value = "wrapType.do")
    public String wrapType(Integer age){
        return "age: "+age;
    }
}
