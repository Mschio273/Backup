package br.com.estudos.forum.controller;

import br.com.estudos.forum.model.Curso;
import br.com.estudos.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "programação"));

        return Arrays.asList(topico, topico, topico);
    }
}
