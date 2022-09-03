package kz.first.project.demo.controllers;

import kz.first.project.demo.database.DButil;
import kz.first.project.demo.prop.Laptop;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Laptop> laptops = DButil.getLaptops();
        model.addAttribute("laptops",laptops);
        return "index";

    }

}