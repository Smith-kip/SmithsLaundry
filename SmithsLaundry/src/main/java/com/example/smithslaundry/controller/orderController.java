package com.example.smithslaundry.controller;

import com.example.smithslaundry.entity.Order;
import com.example.smithslaundry.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class orderController {
    @Autowired
    private orderRepository orderRepository;

    @GetMapping(path = {"/orders","/"})
    public @ResponseBody
    Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping(path = "/orders")
    public @ResponseBody
    String addNewOrder(
            @RequestParam (name= "tshirt") Number tshirt,
            @RequestParam(name = "shirt") Number shirt,
            @RequestParam(name = "socks") Number socks,
            @RequestParam(name = "jackets") Number jackets,
            @RequestParam(name = "sweater") Number sweater,
            @RequestParam(name = "trouser") Number trouser,
            @RequestParam(name = "carpets") Number carpets)
    {
        Order o = new Order();
        o.setTShirt(tshirt);
        o.setShirt(shirt);
        o.setSocks(socks);
        o.setJackets(jackets);
        o.setSweater(sweater);
        o.setTrouser(trouser);
        o.setCarpets(carpets);
        orderRepository.save(o);
        return "Order Received, Thank you!";
    }
}
