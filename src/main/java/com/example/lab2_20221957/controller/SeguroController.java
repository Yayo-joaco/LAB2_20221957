package com.example.lab2_20221957.controller;

import com.example.lab2_20221957.entity.Sede;
import com.example.lab2_20221957.entity.Seguro;
import com.example.lab2_20221957.repository.SeguroRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/seguros")
public class SeguroController {

    private final SeguroRepositorio seguroRepositorio;

    public SeguroController(SeguroRepositorio seguroRepositorio) {
        this.seguroRepositorio = seguroRepositorio;
    }

    @GetMapping("/list")
    public String listarSeguros(Model model) {
        List<Seguro> seguroList = seguroRepositorio.findAll();
        model.addAttribute("listaSeguros",seguroList);
        return "seguros/listaSeguros";
    }
}
