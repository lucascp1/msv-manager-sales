package br.com.lucascp1.msvmanagersales.controller;

import br.com.lucascp1.msvmanagersales.DTO.IngressoDTO;
import br.com.lucascp1.msvmanagersales.model.Ingresso;
import br.com.lucascp1.msvmanagersales.service.IngressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingresso")
public class IngressoController {


    @Autowired
    public IngressoService ingressoService;

    @GetMapping
    public ResponseEntity<List<IngressoDTO>> listarQuadras(){
        return ResponseEntity.ok(this.ingressoService.listarIngressos());
    }

    @GetMapping("/{idIngresso}")
    public IngressoDTO buscarIngressoPorId(@PathVariable Integer idIngresso){
        return ingressoService.buscarIngressoPorId(idIngresso);
    }

    @PostMapping
    public ResponseEntity<IngressoDTO> salvarIngresso(@RequestBody Ingresso ingresso){
        return ResponseEntity.ok(this.ingressoService.salvarIngresso(ingresso));
    }

    @PutMapping("/{idIngresso}")
    public IngressoDTO atualizarIngressoPorId(@PathVariable Integer idIngresso, @RequestBody IngressoDTO ingressoDTO){
        return ingressoService.atualizarIngressoPorId(idIngresso, ingressoDTO);
    }

    @DeleteMapping("/{idIngresso}")
    public ResponseEntity<String> excluirIngressoPorId(@PathVariable Integer idIngresso){
        return ResponseEntity.ok(this.ingressoService.excluirIngressoPorId(idIngresso));
    }
}
