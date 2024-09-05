package br.com.diferenciado.agendaaibackend.modules.aluno.controllers;

import br.com.diferenciado.agendaaibackend.exceptions.AlunoFoundException;
import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoEntity;
import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoRepository;
import br.com.diferenciado.agendaaibackend.modules.aluno.useCases.CreateAlunoUseCase;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {


    @Autowired
    private CreateAlunoUseCase createAlunoUseCase;



    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody AlunoEntity alunoEntity) {
        try{
           var result =  this.createAlunoUseCase.execute(alunoEntity);
           return ResponseEntity.ok().body(result);
        }catch (Exception  e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
