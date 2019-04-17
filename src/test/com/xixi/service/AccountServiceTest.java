package com.xixi.service;

import com.xixi.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAll(){
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println("account = " + account);
        }

    }}