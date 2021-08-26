package br.com.lucascp1.msvmanagersales.mapper;

import br.com.lucascp1.msvmanagersales.DTO.QuadraDTO;
import br.com.lucascp1.msvmanagersales.model.Quadra;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuadraMapper {

    public Quadra converterDtoParaEntidade(QuadraDTO dto){
        return new Quadra(
                dto.getIdQuadra(),
                dto.getTime(),
                dto.getNome(),
                dto.getCidade(),
                dto.getCapacidade());
    }

    public QuadraDTO converterEntidadeParaDto(Quadra quadra){
        return new QuadraDTO(
                quadra.getIdQuadra(),
                quadra.getTime(),
                quadra.getNome(),
                quadra.getCidade(),
                quadra.getCapacidade());
    }

    public List<Quadra> converterListaDtoParaEntidade(List<QuadraDTO> listDto){
        List<Quadra> listQuadra = new ArrayList<>();

        for (QuadraDTO dto:listDto) {
            Quadra quadra = new Quadra();

            quadra.setIdQuadra(dto.getIdQuadra());
            quadra.setTime(dto.getTime());
            quadra.setNome(dto.getNome());
            quadra.setCidade(dto.getCidade());
            quadra.setCapacidade(dto.getCapacidade());
            listQuadra.add(quadra);
        }
        return listQuadra;
    }

    public List<QuadraDTO> converterListaEntidadeParaDto(List<Quadra> listQuadra){

        List<QuadraDTO>  listDto = new ArrayList<>();

        for (Quadra quadra:listQuadra) {
            QuadraDTO quadraDTO = new QuadraDTO();

            quadraDTO.setIdQuadra(quadra.getIdQuadra());
            quadraDTO.setTime(quadra.getTime());
            quadraDTO.setNome(quadra.getNome());
            quadraDTO.setCidade(quadra.getCidade());
            quadraDTO.setCapacidade(quadra.getCapacidade());
            listDto.add(quadraDTO);
        }
        return listDto;
    }

    public Quadra atualizaEntidadePorDTO(Quadra quadra, QuadraDTO quadraDTO){
        quadra.setTime(quadraDTO.getTime());
        quadra.setNome(quadraDTO.getNome());
        quadra.setCidade(quadraDTO.getCidade());
        quadra.setCapacidade(quadraDTO.getCapacidade());

        return quadra;
    }
}
