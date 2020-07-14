package com.udemy.compras;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver{
	
	public String hello() {
		return "Hello GraphQL";
	}

	public int soma(int a, int b){
		return a+b;
	}

	public Cliente cliente(){
		return new Cliente("Bruno", "bruno@gmail.com");
	}

	public List<Cliente> clientes() {
		List<Cliente> clienteList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			clienteList.add(new Cliente("Cliente "+ i, "bruno"+i+"@gmail.com"));
		}
		return clienteList;
	}
}
