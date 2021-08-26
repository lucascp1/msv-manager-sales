package br.com.lucascp1.msvmanagersales.service;

import br.com.lucascp1.msvmanagersales.DTO.FreeAgentDTO;
import br.com.lucascp1.msvmanagersales.mapper.FreeAgentMapper;
import br.com.lucascp1.msvmanagersales.model.FreeAgent;
import br.com.lucascp1.msvmanagersales.repository.FreeAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeAgentService {

    @Autowired
    public FreeAgentRepository freeAgentRepository;

    @Autowired
    public FreeAgentMapper freeAgentMapper;

    public List<FreeAgentDTO> listarFreeAgents(){
        return freeAgentMapper.converterListaEntidadeParaDto(freeAgentRepository.findAll());
    }

    public FreeAgentDTO buscarFreeAgentPorId(Integer idFreeAgent){
        return freeAgentMapper.converterEntidadeParaDto(freeAgentRepository.getById(idFreeAgent));
    }

    public FreeAgentDTO salvarFreeAgent(FreeAgent freeAgent){
        return freeAgentMapper.converterEntidadeParaDto(freeAgentRepository.save(freeAgent));
    }

    public FreeAgentDTO atualizarFreeAgentPorId(Integer idFreeAgent, FreeAgentDTO freeAgentDTO) {
        FreeAgent freeAgent = freeAgentRepository.findById(idFreeAgent).get();
        freeAgent = freeAgentMapper.atualizaEntidadePorDTO(freeAgent, freeAgentDTO);
        return freeAgentMapper.converterEntidadeParaDto(freeAgentRepository.save(freeAgent));
    }

    public String excluirFreeAgentPorId(Integer idFreeAgent){
        freeAgentRepository.deleteById(idFreeAgent);
        return "Free Agent excluído com sucesso";
    }

}
