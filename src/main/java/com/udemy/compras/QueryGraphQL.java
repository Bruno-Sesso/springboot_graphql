package com.udemy.compras;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

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
}
