package com.example.lab2_20221957.controller;

import com.example.lab2_20221957.entity.Auto;
import com.example.lab2_20221957.repository.AutoRepositorio;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@RequestMapping("/autos")
public class AutoController {

    private final AutoRepositorio autoRepositorio;

    public AutoController(AutoRepositorio autoRepositorio) {
        this.autoRepositorio = autoRepositorio;
    }

    @GetMapping("/list")
    public String listarAutos(Model model) {
        List<Auto> jugadorList = autoRepositorio.findAll();
        model.addAttribute("listaJugadores",jugadorList);
        return "jugadores/listaJugadores";
    }

}
