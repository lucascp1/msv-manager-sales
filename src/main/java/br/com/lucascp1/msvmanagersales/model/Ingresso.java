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
@Table(name = "ingresso")
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingresso")
    private Integer idIngresso;

    @Column(name = "vendidos")
    private Double vendidos;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "assento")
    private Double assento;

    @Column(name = "setor")
    private String setor;

    @Column(name = "portao_entrada")
    private String portaoEntrada;

    @ManyToOne
    @JoinColumn(name = "id_jogo")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "id_quadra")
    private Quadra quadra;
}
