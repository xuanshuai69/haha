package com.xixi.service;

import com.xixi.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
