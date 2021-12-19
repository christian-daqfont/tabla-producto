/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.approducto.clase01.controller;


import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.approducto.clase01.service.SProducto;

/**
 *
 * @author admin
 */
@RestController
public class HomeController {
    @Autowired
    private SProducto sp;
    @GetMapping("/products")
    List<Map<String, Object>>mensaje(){   
    return sp.readAll();
    }
}
