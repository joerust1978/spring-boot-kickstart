package com.springkickstarter.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController("/greetings")
@Api(value="Operations related to saying hello")
public class HelloController {

	@RequestMapping(path="/hello/{name}", method=RequestMethod.GET)
	@ApiOperation(value = "Get a greeting", response=String.class)
    public String respond(@PathVariable String name) {
        return "Hey " + name + ", we gucci!!!!";
    }
}
