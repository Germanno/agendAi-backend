package br.com.diferenciado.agendaaibackend.modules.endereco.controllers;

import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoEntity;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping("/")
    public EnderecoEntity create(@Valid @RequestBody EnderecoEntity enderecoEntity) {
        return this.enderecoRepository.save(enderecoEntity);
    }
}
