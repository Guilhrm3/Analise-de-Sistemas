package br.edu.iftm.ds.exemplos.arquitetura.control;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;
import br.edu.iftm.ds.exemplos.arquitetura.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteControl {

    private final ClienteRepository repository;
    
    public ClienteControl(ClienteRepository repository) {
        this.repository = repository;

    }
    @GetMapping
    public List<Cliente> listarTodos(){
        return repository.findAll();
    }
    
}
