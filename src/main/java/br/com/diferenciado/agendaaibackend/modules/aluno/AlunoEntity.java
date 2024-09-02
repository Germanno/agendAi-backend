package br.com.diferenciado.agendaaibackend.modules.aluno;

import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class AlunoEntity {

    private UUID  id;
    @Pattern(regexp = "^[^\\s]+$", message = "O campo [username] não deve conter espaço")
    private String username;
    private String nome;
    private String cpf;
    private String telefone;

    @Email(message = "O campo [email] deve conter um email valido   ")
    private String email;

    @Length(min = 8, max = 16,message = "A senha deve ter entre (8) e (16) caracteres")
    private String password;
    private EnderecoEntity endereco;
}
