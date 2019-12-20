package com.shark.example.controller;

import com.shark.example.service.test.TestService;
import com.shark.example.service.test.dio.TestInput;
import com.shark.example.service.test.dto.TestOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("TestController")
@RequestMapping(value = "/test")
@RequiredArgsConstructor
@Api(tags = "測試")
public class TestController {

    private final TestService testService;

    @ApiOperation(value = "測試1")
    @PostMapping
    public TestOutput test1(@Valid @ModelAttribute TestInput input) {
        return testService.start(input);
    }
}
