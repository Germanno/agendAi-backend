package br.com.diferenciado.agendaaibackend.modules.endereco;

import lombok.Data;

@Data
public class EnderecoEntity {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
