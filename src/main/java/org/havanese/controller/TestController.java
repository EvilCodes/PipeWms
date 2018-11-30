package org.havanese.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by blackfox on 2018/11/30 0030.
 */
@RestController
@RequestMapping("/PipeWms")
public class TestController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public String getMsg(){
        return "hello Intellij";
    }
}
