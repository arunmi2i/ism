package com.ideas2it.ism.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value="/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
		                 throws ServletException, IOException {
        return new ModelAndView("/login");
    }

    @RequestMapping(value="/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
		                 throws ServletException, IOException {
        return new ModelAndView("/index");
    }
}