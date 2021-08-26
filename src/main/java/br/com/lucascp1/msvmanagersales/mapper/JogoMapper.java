package br.com.lucascp1.msvmanagersales.mapper;

import br.com.lucascp1.msvmanagersales.DTO.JogoDTO;
import br.com.lucascp1.msvmanagersales.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JogoMapper {

    public Jogo converterDtoParaEntidade(JogoDTO dto){
        return new Jogo(
                dto.getIdJogo(),
                dto.getTimeLocal(),
                dto.getAdversario(),
                dto.getPlacarLocal(),
                dto.getPlacarAdversario(),
                dto.getDataJogo());
    }

    public JogoDTO converterEntidadeParaDto(Jogo jogo){
        return new JogoDTO(
                jogo.getIdJogo(),
                jogo.getTimeLocal(),
                jogo.getAdversario(),
                jogo.getPlacarLocal(),
                jogo.getPlacarAdversario(),
                jogo.getDataJogo());
    }

    public List<Jogo> converterListaDtoParaEntidade(List<JogoDTO> listDto){
        List<Jogo> listJogo = new ArrayList<>();

        for (JogoDTO dto:listDto) {
            Jogo jogo = new Jogo();

            jogo.setIdJogo(dto.getIdJogo());
            jogo.setTimeLocal(dto.getTimeLocal());
            jogo.setAdversario(dto.getAdversario());
            jogo.setPlacarLocal(dto.getPlacarLocal());
            jogo.setPlacarAdversario(dto.getPlacarAdversario());
            jogo.setDataJogo(dto.getDataJogo());
            listJogo.add(jogo);
        }
        return listJogo;
    }

    public List<JogoDTO> converterListaEntidadeParaDto(List<Jogo> listJogo){
        List<JogoDTO>  listDto = new ArrayList<>();

        for (Jogo jogo:listJogo) {
            JogoDTO jogoDTO = new JogoDTO();

            jogoDTO.setIdJogo(jogo.getIdJogo());
            jogoDTO.setTimeLocal(jogo.getTimeLocal());
            jogoDTO.setAdversario(jogo.getAdversario());
            jogoDTO.setPlacarLocal(jogo.getPlacarLocal());
            jogoDTO.setPlacarAdversario(jogo.getPlacarAdversario());
            jogoDTO.setDataJogo(jogo.getDataJogo());
            listDto.add(jogoDTO);
        }
        return listDto;
    }

    public Jogo atualizaEntidadePorDTO(Jogo jogo, JogoDTO jogoDTO){
        jogo.setTimeLocal(jogoDTO.getTimeLocal());
        jogo.setAdversario(jogoDTO.getAdversario());
        jogo.setPlacarLocal(jogoDTO.getPlacarLocal());
        jogo.setPlacarAdversario(jogoDTO.getPlacarAdversario());
        jogo.setDataJogo(jogoDTO.getDataJogo());
        return jogo;
    }
}
