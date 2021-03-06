package br.com.zup.orange.controller;

import br.com.zup.orange.domain.Veiculo;
import br.com.zup.orange.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
    private VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public List<Veiculo> list() {
        return veiculoService.listAll(); //com ResponseEntity traz mais informações, ex.: Status
    }

    @PostMapping
    public void save (@RequestBody Veiculo veiculo) {
        veiculoService.save(veiculo);
    }
}
