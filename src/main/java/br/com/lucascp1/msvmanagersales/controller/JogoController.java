package br.com.lucascp1.msvmanagersales.controller;


import br.com.lucascp1.msvmanagersales.DTO.JogoDTO;
import br.com.lucascp1.msvmanagersales.model.Jogo;
import br.com.lucascp1.msvmanagersales.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    @Autowired
    public JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<JogoDTO>> listarQuadras(){
        return ResponseEntity.ok(this.jogoService.listarJogos());
    }

    @GetMapping("/{idJogo}")
    public JogoDTO buscarJogoPorId(@PathVariable Integer idJogo){
        return jogoService.buscarJogoPorId(idJogo);
    }

    @PostMapping
    public ResponseEntity<JogoDTO> salvarJogo(@RequestBody Jogo jogo){
        return ResponseEntity.ok(this.jogoService.salvarJogo(jogo));
    }

    @PutMapping("/{idJogo}")
    public JogoDTO atualizarJogoPorId(@PathVariable Integer idJogo, @RequestBody JogoDTO jogoDTO){
        return jogoService.atualizarJogoPorId(idJogo, jogoDTO);
    }

    @DeleteMapping("/{idJogo}")
    public ResponseEntity<String> excluirJogoPorId(@PathVariable Integer idJogo){
        return ResponseEntity.ok(this.jogoService.excluirJogoPorId(idJogo));
    }
}
