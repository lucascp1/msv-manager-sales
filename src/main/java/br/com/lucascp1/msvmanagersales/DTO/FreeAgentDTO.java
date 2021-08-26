package br.com.lucascp1.msvmanagersales.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FreeAgentDTO {

    private Integer idFreeAgent;
    private String nome;
    private Double altura;
    private String posicao;
    private Double valor;
}
