package com.usian.controller;

import com.usian.pojo.TbUser;
import com.usian.service.SSOService;
import com.usian.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Loser
 * @date 2021年12月01日 14:05
 */
@RestController
@RequestMapping("/service/sso")
public class TbUserController {

    @Autowired
    private SSOService ssoService;

    @RequestMapping("/checkUserInfo/{checkValue}/{checkFlag}")
    public Boolean checkUserInfo(@PathVariable String checkValue , @PathVariable Integer checkFlag){
        return ssoService.checkUserInfo(checkValue, checkFlag);
    }

    @RequestMapping("/userRegister")
    public Integer userRegister(@RequestBody TbUser tbUser){
        return ssoService.userRegister(tbUser);
    }

    @RequestMapping("/userLogin")
    public Map userLogin(String username , String password){
        return ssoService.userLogin(username, password);
    }

    @RequestMapping("/getUserByToken/{token}")
    public TbUser getUserByToken(@PathVariable String token){
         return ssoService.getUserByToken(token);
    }

    @RequestMapping("/logOut")
    public Boolean logOut(String token){
        return ssoService.logOut(token);
    }
}
