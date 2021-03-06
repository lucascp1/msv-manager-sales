package br.com.lucascp1.msvmanagersales.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JogoDTO {
    private Integer idJogo;
    private String timeLocal;
    private String adversario;
    private Double placarLocal;
    private Double placarAdversario;
    private LocalDate dataJogo;
}
