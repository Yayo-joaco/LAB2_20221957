package com.example.lab2_20221957.controller;

import com.example.lab2_20221957.entity.Auto;
import com.example.lab2_20221957.entity.Sede;
import com.example.lab2_20221957.repository.SedeRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sedes")
public class SedeController {

    private final SedeRepositorio sedeRepositorio;

    public SedeController(SedeRepositorio sedeRepositorio) {
        this.sedeRepositorio = sedeRepositorio;
    }

    @GetMapping("/list")
    public String listarSedes(Model model) {
        List<Sede> sedeList = sedeRepositorio.findAll();
        model.addAttribute("listaSedes",sedeList);
        return "sedes/listaSedes";
    }
}
