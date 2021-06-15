package com.ndt.controllers;

import com.ndt.models.ChiTietCaKhamBenh;
import com.ndt.service.IChiTietCaKhamBenhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    IChiTietCaKhamBenhService iChiTietCaKhamBenhService;

    @RequestMapping()
    public String index(ModelMap model) {
        model.addAttribute("schedules", iChiTietCaKhamBenhService.getAll(ChiTietCaKhamBenh.class));
        return "index";
    }
}
