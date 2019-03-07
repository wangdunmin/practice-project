package cn.yzlsoft.unitedfront.server.admin.controller;

import cn.yzl.module.test.Test1;
import cn.yzlsoft.lib.vo.response.JsonResult;
import cn.yzlsoft.lib.vo.response.code.ResultCode;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *@author wangt
 *@date 2019/3/1 10:31
 *@describe
 **/
@RequestMapping("/test")
@Controller
@Log4j2
public class TestController {

    @GetMapping("/index")
    @ResponseBody
    public JsonResult test() {
        log.debug("");
        new Test1().test();
        new Date().setTest("");
        return new JsonResult().quickFilling(ResultCode.SUCCESS);
    }

    @Data
    private class Date{
        private String test;
    }
}
