package com.prestijebank_v2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndex() {
    ModelAndView getIndexPage = new ModelAndView("index");
    getIndexPage.addObject("PageTitle", "index");
    System.out.println("In Index Controller");
    return getIndexPage;
    }
  //  @RequestMapping("/")
  //  public String index() {
   //     System.out.println("in index");
    //    return "index";
   // }
}
