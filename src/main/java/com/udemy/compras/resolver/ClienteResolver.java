package com.udemy.compras.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udemy.compras.persistence.Cliente;
import com.udemy.compras.persistence.Compra;
import com.udemy.compras.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteResolver implements GraphQLResolver<Cliente> {

    @Autowired
    private CompraService compraService;

    public List<Compra> compras(Cliente c){
        return compraService.findAllByCliente(c);
    }
}
