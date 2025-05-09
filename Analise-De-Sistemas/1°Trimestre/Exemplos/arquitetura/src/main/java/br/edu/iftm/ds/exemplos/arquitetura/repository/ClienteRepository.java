package br.edu.iftm.ds.exemplos.arquitetura.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;

@Repository
public class ClienteRepository {
    private List<Cliente> clientes;

    public ClienteRepository(){
        this.clientes = new ArrayList<>();
        Cliente senna = Cliente.builder()
                               .codigo(1)
                               .nome("Ayrton Senna")
                               .build();
        Cliente fangio = Cliente.builder()
                                .codigo(2)
                                .nome("Juan Manoel Fangio")
                                .build();
                                
        clientes.add(senna);
        clientes.add(fangio);
    }
    public List<Cliente> findAll(){
        return clientes;
    }
}
