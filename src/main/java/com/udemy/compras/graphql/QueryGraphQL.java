package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	public String hello() {
		return "Hello GraphQL";
	}

	public int soma(int a, int b){
		return a+b;
	}
}
