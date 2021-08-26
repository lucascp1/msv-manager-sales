package br.com.lucascp1.msvmanagersales.controller;

import br.com.lucascp1.msvmanagersales.DTO.QuadraDTO;
import br.com.lucascp1.msvmanagersales.model.Quadra;
import br.com.lucascp1.msvmanagersales.service.QuadraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quadra")
public class QuadraController {

    @Autowired
    public QuadraService quadraService;

    @GetMapping
    public ResponseEntity<List<QuadraDTO>> listarQuadras(){
        return ResponseEntity.ok(this.quadraService.listarQuadras());
    }

    @GetMapping("/{idQuadra}")
    public QuadraDTO buscarQuadraPorId(@PathVariable Integer idQuadra){
        return quadraService.buscarQuadraPorId(idQuadra);
    }

    @PostMapping
    public ResponseEntity<QuadraDTO> salvarQuadra(@RequestBody Quadra quadra){
        return ResponseEntity.ok(this.quadraService.salvarQuadra(quadra));
    }

    @PutMapping("/{idQuadra}")
    public QuadraDTO atualizarQuadraPorId(@PathVariable Integer idQuadra, @RequestBody QuadraDTO quadraDTO){
        return quadraService.atualizarQuadraPorId(idQuadra, quadraDTO);
    }

    @DeleteMapping("/{idQuadra}")
    public ResponseEntity<String> excluirQuadraPorId(@PathVariable Integer idQuadra){
        return ResponseEntity.ok(this.quadraService.excluirQuadraPorId(idQuadra));
    }
}
