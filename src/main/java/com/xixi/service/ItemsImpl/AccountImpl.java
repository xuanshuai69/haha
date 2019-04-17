package com.xixi.service.ItemsImpl;

import com.xixi.dao.AccountDao;
import com.xixi.domain.Account;
import com.xixi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service执行了findAll....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service执行了saveAccount....");
        accountDao.saveAccount(account);
    }
}
