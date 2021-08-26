package br.com.lucascp1.msvmanagersales.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "free_agent")
public class FreeAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_free_agent")
    private Integer idFreeAgent;

    @Column(name = "nome")
    private String nome;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "posicao")
    private String posicao;

    @Column(name = "valor")
    private Double valor;
}
