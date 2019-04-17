package com.xixi.controller;

import com.xixi.domain.Account;
import com.xixi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        System.out.println("controller执行了" );
        return "success";
    }
}
