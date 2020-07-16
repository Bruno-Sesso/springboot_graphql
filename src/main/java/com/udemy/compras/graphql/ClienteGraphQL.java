package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.Cliente;
import com.udemy.compras.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private ClienteRepository clienteRep;

	public Cliente cliente(Long id){
		return clienteRep.findById(id).orElse(null);
	}

	public List<Cliente> clientes() {
		return clienteRep.findAll();
	}

	public Cliente saveCliente(Long id, String nome, String email){
		Cliente c = new Cliente(id, nome, email);
		return clienteRep.save(c);
	}
}
