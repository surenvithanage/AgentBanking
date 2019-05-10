package com.epic.agentbanking.controller;

import com.epic.agentbanking.model.Pagesectionuserrole;
import com.epic.agentbanking.service.HomeService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shalini_w
 */
@Controller
@ControllerAdvice
public class HomeController {

    @Autowired
    private HomeService service;

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String loadHome(HttpServletRequest request, Model model) {

        System.out.println("called HomeController Method : loadHome");

        String retPage = "home/home";

        String userrole = (String) model.asMap().get("userrolecode");
        String section = (String) model.asMap().get("section");
        String username = (String) model.asMap().get("username");

        //or
//        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
//        String uname = (String) flashMap.get("username");

        try {
            List<Pagesectionuserrole> pages = service.getPageList(userrole, section);
            model.addAttribute("pages", pages);
            model.addAttribute("username", username);
            model.addAttribute("userrole", userrole);
        } catch (Exception ex) {
            model.addAttribute("error", "Problem while executing loadHome()");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retPage;
    }
}
