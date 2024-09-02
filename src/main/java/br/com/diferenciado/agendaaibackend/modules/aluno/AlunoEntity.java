package br.com.diferenciado.agendaaibackend.modules.aluno;

import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import lombok.Data;

import java.util.UUID;

@Data
public class AlunoEntity {

    private UUID  id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String password;
    private EnderecoEntity endereco;
}
