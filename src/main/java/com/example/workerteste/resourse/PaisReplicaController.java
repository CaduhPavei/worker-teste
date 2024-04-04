package com.example.workerteste.resourse;

import com.example.workerteste.model.Pais;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises-replica")
public class PaisReplicaController {

    @PostMapping
    public ResponseEntity create(@RequestBody Pais entity) {
        System.out.println("Integração que chegou no serviço do worker");
        System.out.println(entity);
        return ResponseEntity.ok().build();
    }
}
