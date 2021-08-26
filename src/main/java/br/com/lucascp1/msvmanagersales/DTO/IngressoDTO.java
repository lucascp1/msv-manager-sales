package br.com.lucascp1.msvmanagersales.DTO;

import br.com.lucascp1.msvmanagersales.model.Jogo;
import br.com.lucascp1.msvmanagersales.model.Quadra;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngressoDTO {
    private Integer idIngresso;
    private Double vendidos;
    private Double preco;
    private Double assento;
    private String setor;
    private String portaoEntrada;
    private Jogo jogo;
    private Quadra quadra;
}
