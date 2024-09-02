package br.com.diferenciado.agendaaibackend.modules.aluno.controllers;

import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {



    @PostMapping("/")
    public  void create(@Valid @RequestBody AlunoEntity alunoEntity) {
        System.out.println("Aluno");
        System.out.println(alunoEntity.getEmail());
    }
}
