package com.shark.example.service;

import com.shark.example.service.base.BaseService;
import com.shark.example.service.dio.Test1Input;
import com.shark.example.service.dto.Test1Output;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestService extends BaseService<Test1Input, Test1Output> {
    public Test1Output start(Test1Input test1Input) {
        Test1Output output = new Test1Output();
        output.setParameter(test1Input.getParameter());
        return output;
    }
}
