package br.com.lucascp1.msvmanagersales.service;

import br.com.lucascp1.msvmanagersales.DTO.IngressoDTO;
import br.com.lucascp1.msvmanagersales.mapper.IngressoMapper;
import br.com.lucascp1.msvmanagersales.model.Ingresso;
import br.com.lucascp1.msvmanagersales.repository.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngressoService {

    @Autowired
    public IngressoRepository ingressoRepository;

    @Autowired
    public IngressoMapper ingressoMapper;

    public List<IngressoDTO> listarIngressos(){
        return ingressoMapper.converterListaEntidadeParaDto(ingressoRepository.findAll());
    }

    public IngressoDTO buscarIngressoPorId(Integer idIngresso){
        return ingressoMapper.converterEntidadeParaDto(ingressoRepository.getById(idIngresso));
    }

    public IngressoDTO salvarIngresso(Ingresso ingresso){
        return ingressoMapper.converterEntidadeParaDto(ingressoRepository.save(ingresso));
    }

    public IngressoDTO atualizarIngressoPorId(Integer idIngresso, IngressoDTO ingressoDTO) {
        Ingresso ingresso = ingressoRepository.findById(idIngresso).get();
        ingresso = ingressoMapper.atualizaEntidadePorDTO(ingresso, ingressoDTO);
        return ingressoMapper.converterEntidadeParaDto(ingressoRepository.save(ingresso));
    }

    public String excluirIngressoPorId(Integer idIngresso){
        ingressoRepository.deleteById(idIngresso);
        return "Ingresso excluído com sucesso";
    }
    
}
