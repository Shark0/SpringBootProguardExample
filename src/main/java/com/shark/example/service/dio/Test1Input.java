package com.shark.example.service.dio;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Test1Input {
    @NotEmpty
    private String parameter;
}
