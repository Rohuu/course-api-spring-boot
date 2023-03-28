package org.rohuu.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    // whenever a http req comes to this application at the url /hello, then run this method
    // @RequestMapping maps only to THE GET method by default
    public String sayHi() {
        return "Hi!";
    }

}
