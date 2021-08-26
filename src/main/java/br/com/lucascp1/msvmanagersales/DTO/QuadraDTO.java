package br.com.lucascp1.msvmanagersales.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuadraDTO {
    private Integer idQuadra;
    private String time;
    private String nome;
    private String cidade;
    private Double capacidade;
}
