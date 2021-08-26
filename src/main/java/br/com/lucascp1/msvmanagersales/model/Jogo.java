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
@Table(name = "jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogo")
    private Integer idJogo;

    @Column(name = "time_local")
    private String timeLocal;

    @Column(name = "adversario")
    private String adversario;

    @Column(name = "placar_local")
    private Double placarLocal;

    @Column(name = "placar_adversario")
    private Double placarAdversario;
}
