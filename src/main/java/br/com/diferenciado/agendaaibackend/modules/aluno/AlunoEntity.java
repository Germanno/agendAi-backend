package br.com.diferenciado.agendaaibackend.modules.aluno;

import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name="aluno")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    @Valid
    private EnderecoEntity endereco;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
