package br.com.diferenciado.agendaaibackend.modules.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AlunoRepository extends JpaRepository<AlunoEntity, UUID> {

    Optional<AlunoEntity> findByUsernameOrEmailOrCpf(String username, String email, String cpf);

}
