package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String getHello(){
        return "hello world!";
    }
    @GetMapping("/name")
    public String getName()
    {
        return "Flature";
    }
    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable)
    {
        return variable;
    }
    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }
    @GetMapping("/request1")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email,@RequestParam String Organization){
        return name+ " "+email+" "+Organization;
    }
    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb=new StringBuilder();

        param.entrySet().forEach(map ->{
            sb.append(map.getKey()+" : "+map.getValue()+"\n");
        });

        return sb.toString();
    }
}
