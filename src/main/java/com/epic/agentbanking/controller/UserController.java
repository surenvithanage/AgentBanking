package com.epic.agentbanking.controller;

import com.epic.agentbanking.model.Users;
import com.epic.agentbanking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = {"/list"} , method = RequestMethod.GET)
    public String list(ModelMap model){
        List<Users> users = service.list();
        model.addAttribute("users" , users);
        return "user/user";
    }

    @RequestMapping(value = {"/create"} , method = RequestMethod.POST)
    public String insert(@Valid Users user , BindingResult result , ModelMap model){
        if(result.hasErrors()){
            return "users/user";
        }
        service.insert(user);
        model.addAttribute("success" , "User : " + user.getFullname() + " successfully created" );
        return "user/user";
    }

    public String delete(@PathVariable String username , ModelMap model){
        service.delete(username);
//      return "redirect:/list";
        model.addAttribute("success" , "User : " + username + " successfully deleted" );
        return "user/user";
    }

}
