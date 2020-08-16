package com.udemy.compras.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udemy.compras.persistence.Cliente;
import com.udemy.compras.persistence.Compra;
import com.udemy.compras.persistence.Produto;
import com.udemy.compras.service.ClienteService;
import com.udemy.compras.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraResolver implements GraphQLResolver<Compra> {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    public String status(Compra c){
        return "Status: " + c.getStatus();
    }

    public Cliente cliente(Compra c){
        return clienteService.findById(c.getCliente().getId());
    }

    public Produto produto(Compra c){
        return produtoService.findById(c.getCliente().getId());
    }
}
