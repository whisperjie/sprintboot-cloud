package com.whisperjie.test.controller

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class HelloController {
    @RequestMapping("hello")
    fun sayHi():String{
        println("测试输出")
        return "test"
    }
}