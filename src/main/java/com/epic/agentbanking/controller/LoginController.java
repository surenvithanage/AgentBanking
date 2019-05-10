/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.controller;

import com.epic.agentbanking.model.Page;
import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.model.Users;
import com.epic.agentbanking.service.LoginService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author shalini_w
 */
@Controller
@ControllerAdvice
public class LoginController {

    @Autowired
    private LoginService service;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String check(@ModelAttribute("user") @Validated Users user, BindingResult result, Model model,RedirectAttributes redirectAttributes) {

        String retPage = "/";
        System.out.println("called LoginController Method : check");
        if (result.hasErrors()) {
            return "error";
        }
        try {
            if (user.getUsername() != null && user.getPassword() != null) {
                Users loggedUser = service.findUserDatabyUsernameandPassword(user.getUsername(), user.getPassword());
                if (loggedUser != null) {
//                    retPage = "home/home";
                    String userrolecode = loggedUser.getUserrole().getUserrolecode();
                    String section = "ALL";
//                    List<Pagesectionuserrole> pages = service.getPageList(userrolecode, section);

                    model.addAttribute("username", loggedUser.getFullname());
                    model.addAttribute("userrole", userrolecode);
//                    model.addAttribute("pages", pages);

                    redirectAttributes.addFlashAttribute("userrolecode", userrolecode);
                    redirectAttributes.addFlashAttribute("username", loggedUser.getFullname());
                    redirectAttributes.addFlashAttribute("section", section);
                    return "redirect:/home";
                    
                } else {
                    System.out.println("----- Invalid Username or Password!");
                    model.addAttribute("error", "Invalid Username or Password!");
                }
            } else {
                System.out.println("----- Empty Username and password");
                model.addAttribute("error", "Empty Username and password");
            }
        } catch (Exception ex) {
            System.out.println("----- Cannot Login. Please contact administrator.");
            model.addAttribute("error", "Cannot Login. Please contact administrator.");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:"+retPage;
    }
}
