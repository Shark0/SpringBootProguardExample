package com.shark.example.service.account;

import com.shark.example.dao.entity.AccountDaoEntity;
import com.shark.example.dao.mapper.AccountMapper;
import com.shark.example.dao.repository.AccountRepository;
import com.shark.example.service.account.dio.RegisterInput;
import com.shark.example.service.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("RegisterService")
public class RegisterService extends BaseService<RegisterInput, AccountDaoEntity> {

    private final AccountMapper accountMapper;

    @Override
    public AccountDaoEntity start(RegisterInput registerInput) {
        AccountDaoEntity accountDaoEntity = new AccountDaoEntity();
        accountDaoEntity.setAccount(registerInput.getAccount());
        accountDaoEntity.setName(registerInput.getAccount());
        accountDaoEntity.setPassword(registerInput.getPassword());
        accountMapper.insertAccount(accountDaoEntity);
        return accountDaoEntity;
    }
}
