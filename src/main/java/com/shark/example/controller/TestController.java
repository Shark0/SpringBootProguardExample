package com.shark.example.controller;

import com.shark.example.service.TestService;
import com.shark.example.service.dio.Test1Input;
import com.shark.example.service.dto.Test1Output;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("TestController")
@RequestMapping(value = "/test")
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("test1")
    public Test1Output test1(@Valid @ModelAttribute Test1Input input) {
        return testService.start(input);
    }
}
