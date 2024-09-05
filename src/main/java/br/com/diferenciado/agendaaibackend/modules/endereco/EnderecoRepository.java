package br.com.diferenciado.agendaaibackend.modules.endereco;

import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, UUID> {

    //Método para encontrar um endereço por todos os campos
    Optional<EnderecoEntity> findByRuaAndNumeroAndBairroAndCidadeAndEstadoAndCep(
            String rua, String numero, String bairro, String cidade, String estado, String cep);
}
