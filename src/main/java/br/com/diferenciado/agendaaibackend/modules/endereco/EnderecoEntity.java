package br.com.diferenciado.agendaaibackend.modules.endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name="endereco")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @NotEmpty(message = "O campo 'rua' não pode estar vazio.")
    private String rua;

    @NotEmpty(message = "O campo 'número' não pode estar vazio.")
    private String numero;

    @NotEmpty(message = "O campo 'bairro' não pode estar vazio.")
    private String bairro;

    @NotEmpty(message = "O campo 'cidade' não pode estar vazio.")
    private String cidade;

    @NotEmpty(message = "O campo 'estado' não pode estar vazio.")
    private String estado;

    @NotEmpty(message = "O campo 'cep' não pode estar vazio.")
    private String cep;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
