package br.com.lucascp1.msvmanagersales.controller;

import br.com.lucascp1.msvmanagersales.DTO.FreeAgentDTO;
import br.com.lucascp1.msvmanagersales.model.FreeAgent;
import br.com.lucascp1.msvmanagersales.service.FreeAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/freeAgent")
public class FreeAgentController {
    
    @Autowired
    public FreeAgentService freeAgentService;

    @GetMapping
    public ResponseEntity<List<FreeAgentDTO>> listarFreeAgent(){
        return ResponseEntity.ok(this.freeAgentService.listarFreeAgents());
    }

    @GetMapping("/{idFreeAgent}")
    public FreeAgentDTO buscarFreeAgentPorId(@PathVariable Integer idFreeAgent){
        return freeAgentService.buscarFreeAgentPorId(idFreeAgent);
    }

    @PostMapping
    public ResponseEntity<FreeAgentDTO> salvarFreeAgent(@RequestBody FreeAgent freeAgent){
        return ResponseEntity.ok(this.freeAgentService.salvarFreeAgent(freeAgent));
    }

    @PutMapping("/{idFreeAgent}")
    public FreeAgentDTO atualizarFreeAgentPorId(@PathVariable Integer idFreeAgent, @RequestBody FreeAgentDTO freeAgentDTO){
        return freeAgentService.atualizarFreeAgentPorId(idFreeAgent, freeAgentDTO);
    }

    @DeleteMapping("/{idFreeAgent}")
    public ResponseEntity<String> excluirFreeAgentPorId(@PathVariable Integer idFreeAgent){
        return ResponseEntity.ok(this.freeAgentService.excluirFreeAgentPorId(idFreeAgent));
    }
}
