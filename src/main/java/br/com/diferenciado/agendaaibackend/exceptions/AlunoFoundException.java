package br.com.diferenciado.agendaaibackend.exceptions;

public class AlunoFoundException extends RuntimeException{

    public AlunoFoundException() {
        super("Aluno já existe!");
    }

}
