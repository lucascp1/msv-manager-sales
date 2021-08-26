package br.com.lucascp1.msvmanagersales.mapper;

import br.com.lucascp1.msvmanagersales.DTO.FreeAgentDTO;
import br.com.lucascp1.msvmanagersales.model.FreeAgent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FreeAgentMapper {

    public FreeAgent converterDtoParaEntidade(FreeAgentDTO dto){
        return new FreeAgent(
                dto.getIdFreeAgent(),
                dto.getNome(),
                dto.getAltura(),
                dto.getPosicao(),
                dto.getValor());
    }

    public FreeAgentDTO converterEntidadeParaDto(FreeAgent freeAgent){
        return new FreeAgentDTO(
                freeAgent.getIdFreeAgent(),
                freeAgent.getNome(),
                freeAgent.getAltura(),
                freeAgent.getPosicao(),
                freeAgent.getValor());
    }

    public List<FreeAgent> converterListaDtoParaEntidade(List<FreeAgentDTO> listDto){
        List<FreeAgent> listFreeAgent = new ArrayList<>();

        for (FreeAgentDTO dto:listDto) {
            FreeAgent freeAgent = new FreeAgent();

            freeAgent.setIdFreeAgent(dto.getIdFreeAgent());
            freeAgent.setNome(dto.getNome());
            freeAgent.setAltura(dto.getAltura());
            freeAgent.setPosicao(dto.getPosicao());
            freeAgent.setValor(dto.getValor());
            listFreeAgent.add(freeAgent);
        }
        return listFreeAgent;
    }

    public List<FreeAgentDTO> converterListaEntidadeParaDto(List<FreeAgent> listFreeAgent){

        List<FreeAgentDTO>  listDto = new ArrayList<>();

        for (FreeAgent freeAgent:listFreeAgent) {
            FreeAgentDTO freeAgentDTO = new FreeAgentDTO();

            freeAgentDTO.setIdFreeAgent(freeAgent.getIdFreeAgent());
            freeAgentDTO.setNome(freeAgent.getNome());
            freeAgentDTO.setAltura(freeAgent.getAltura());
            freeAgentDTO.setPosicao(freeAgent.getPosicao());
            freeAgentDTO.setValor(freeAgent.getValor());
            listDto.add(freeAgentDTO);
        }
        return listDto;
    }

    public FreeAgent atualizaEntidadePorDTO(FreeAgent freeAgent, FreeAgentDTO freeAgentDTO){
        freeAgent.setNome(freeAgentDTO.getNome());
        freeAgent.setAltura(freeAgentDTO.getAltura());
        freeAgent.setPosicao(freeAgentDTO.getPosicao());
        freeAgent.setValor(freeAgentDTO.getValor());

        return freeAgent;
    }
}
