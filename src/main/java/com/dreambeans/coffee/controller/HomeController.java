package com.dreambeans.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mAv = new ModelAndView();
        mAv.setViewName("index.html");
        return mAv;
    }

}
