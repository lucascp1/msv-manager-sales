package br.com.lucascp1.msvmanagersales.service;

import br.com.lucascp1.msvmanagersales.DTO.JogoDTO;
import br.com.lucascp1.msvmanagersales.mapper.JogoMapper;
import br.com.lucascp1.msvmanagersales.model.Jogo;
import br.com.lucascp1.msvmanagersales.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    public JogoRepository jogoRepository;

    @Autowired
    public JogoMapper jogoMapper;

    public List<JogoDTO> listarJogos(){
        return jogoMapper.converterListaEntidadeParaDto(jogoRepository.findAll());
    }

    public JogoDTO buscarJogoPorId(Integer idJogo){
        return jogoMapper.converterEntidadeParaDto(jogoRepository.getById(idJogo));
    }

    public JogoDTO salvarJogo(Jogo jogo){
        return jogoMapper.converterEntidadeParaDto(jogoRepository.save(jogo));
    }

    public JogoDTO atualizarJogoPorId(Integer idJogo, JogoDTO jogoDTO) {
        Jogo jogo = jogoRepository.findById(idJogo).get();
        jogo = jogoMapper.atualizaEntidadePorDTO(jogo, jogoDTO);
        return jogoMapper.converterEntidadeParaDto(jogoRepository.save(jogo));
    }

    public String excluirJogoPorId(Integer idJogo){
        jogoRepository.deleteById(idJogo);
        return "Jogo excluído com sucesso";
    }
}
