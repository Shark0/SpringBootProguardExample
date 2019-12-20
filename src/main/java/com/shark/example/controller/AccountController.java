package com.shark.example.controller;

import com.shark.example.dao.entity.AccountDaoEntity;
import com.shark.example.service.account.RegisterService;
import com.shark.example.service.account.SearchAccountListService;
import com.shark.example.service.account.dio.RegisterInput;
import com.shark.example.service.account.dio.SearchAccountInput;
import com.shark.example.service.base.BaseResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Api(tags = "帳號")
@RequestMapping(value = "/account")
@RestController("AccountController")
@RequiredArgsConstructor
public class AccountController {

    private final SearchAccountListService searchAccountListService;

    @ApiOperation(value = "搜尋帳號列表", notes = "", produces = "application/json")
    @GetMapping
    public Page<AccountDaoEntity> searchAccountList(
            @Valid @ModelAttribute SearchAccountInput searchAccountInput) {
        return searchAccountListService.start(searchAccountInput);
    }

    private final RegisterService registerService;

    @ApiOperation(value = "註冊", notes = "", produces = "application/json")
    @PostMapping("register")
    public BaseResponseEntity<AccountDaoEntity> register(
            @Valid @ModelAttribute RegisterInput registerInput) {
        return registerService.start(registerInput);
    }
}
