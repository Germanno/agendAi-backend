package br.com.diferenciado.agendaaibackend.exceptions;

public class EnderecoFoundException extends RuntimeException{

    public EnderecoFoundException() {
        super("Endereço já Existente: ");
    }
}
