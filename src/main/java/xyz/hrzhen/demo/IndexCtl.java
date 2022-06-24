package xyz.hrzhen.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexCtl {

    @Resource
    GoodProp goodProp;


    @GetMapping("/config")
    public Map config( )   {
        Map res = new HashMap();
        res.put("name","测试: 配置中心,数据同步");
        res.put("data",goodProp.toString());
        return res;
    }

}
