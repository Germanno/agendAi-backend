package br.com.diferenciado.agendaaibackend.modules.aluno.useCases;

import br.com.diferenciado.agendaaibackend.exceptions.AlunoFoundException;
import br.com.diferenciado.agendaaibackend.exceptions.EnderecoFoundException;
import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoEntity;
import br.com.diferenciado.agendaaibackend.modules.aluno.AlunoRepository;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoEntity;
import br.com.diferenciado.agendaaibackend.modules.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CreateAlunoUseCase {

    @Autowired
    private AlunoRepository alunoRepository;


    @Autowired
    private EnderecoRepository enderecoRepository;

    //@Transactional para garantir que todas as operações sejam atômicas.
    @Transactional
    public AlunoEntity execute(AlunoEntity alunoEntity){
        this.alunoRepository.
                findByUsernameOrEmailOrCpf(alunoEntity.getUsername(), alunoEntity.getEmail(),alunoEntity.getCpf())
                .ifPresent((aluno -> {
                    throw new AlunoFoundException();
                }));

        // Verifica se o endereço está presente
        if (alunoEntity.getEndereco() != null) {

            // pega o endereço primeiro
            EnderecoEntity endereco = alunoEntity.getEndereco();
            // Busca um endereço existente com os mesmos atributos
            Optional<EnderecoEntity> existingEndereco = enderecoRepository.findByRuaAndNumeroAndBairroAndCidadeAndEstadoAndCep(
                    endereco.getRua(),
                    endereco.getNumero(),
                    endereco.getBairro(),
                    endereco.getCidade(),
                    endereco.getEstado(),
                    endereco.getCep()
            );
            if (existingEndereco.isPresent()) {
                // Se o endereço já existe, usa o endereço existente
                alunoEntity.setEndereco(existingEndereco.get());
            } else {
                // Se o endereço não existe, salva o novo endereço
                endereco = enderecoRepository.save(endereco);
                alunoEntity.setEndereco(endereco);
            }
        }
        return this.alunoRepository.save(alunoEntity);
    }

}
