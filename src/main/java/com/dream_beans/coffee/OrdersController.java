package com.dream_beans.coffee;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OrdersController {

    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @RequestMapping(value = "message", method = RequestMethod.GET)
    public String orders(Model model) {
        model.addAttribute("orders", ordersService.getAllOrders());
        return "orders/list";
    }
    @RequestMapping(value = "/api/orders", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView listAllOrders(){
       ModelAndView mav = new ModelAndView("orders/list");
       mav.addObject("orders", ordersService.getAllOrders());
       return mav;
    }

    @ModelAttribute("/api/orders")
    public Iterable<Orders> orders(){
        return ordersService.getAllOrders();
    }
}
