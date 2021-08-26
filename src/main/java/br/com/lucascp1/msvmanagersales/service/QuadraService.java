package br.com.lucascp1.msvmanagersales.service;

import br.com.lucascp1.msvmanagersales.DTO.QuadraDTO;
import br.com.lucascp1.msvmanagersales.mapper.QuadraMapper;
import br.com.lucascp1.msvmanagersales.model.Quadra;
import br.com.lucascp1.msvmanagersales.repository.QuadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuadraService {

    @Autowired
    public QuadraRepository quadraRepository;

    @Autowired
    public QuadraMapper quadraMapper;

    public List<QuadraDTO> listarQuadras(){
        return quadraMapper.converterListaEntidadeParaDto(quadraRepository.findAll());
    }

    public QuadraDTO buscarQuadraPorId(Integer idQuadra){
        return quadraMapper.converterEntidadeParaDto(quadraRepository.getById(idQuadra));
    }

    public QuadraDTO salvarQuadra(Quadra quadra){
        return quadraMapper.converterEntidadeParaDto(quadraRepository.save(quadra));
    }

    public QuadraDTO atualizarQuadraPorId(Integer idQuadra, QuadraDTO quadraDTO) {
        Quadra quadra = quadraRepository.findById(idQuadra).get();
        quadra = quadraMapper.atualizaEntidadePorDTO(quadra, quadraDTO);
        return quadraMapper.converterEntidadeParaDto(quadraRepository.save(quadra));
    }

    public String excluirQuadraPorId(Integer idQuadra){
        quadraRepository.deleteById(idQuadra);
        return "Quadra excluída com sucesso";
    }


}
