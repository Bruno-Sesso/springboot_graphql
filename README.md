# SpringBoot with GraphQL

<b><i>Api RestFull purchases using GraphQL with Spring Boot</b></em>

<h4> Exemplo de Query com Alias</h4>

```
{
  c1:cliente(id:1){
    id,
    nome,
    email
  },
  c2:cliente(id:2){
      id,
      nome,
      email
  },
}
```

<h4> Exemplo de Query com Fragment</h4>

```
{
  c1:cliente(id:1){
    ...FragCliente
  }
  c2:cliente(id:2){
      ...FragCliente
  }
}

fragment FragCliente on Cliente {
    id,nome
}
```

<h4> Exemplo de Query Mutation com input type</h4>

```
mutation{
  saveCliente(cliente:{
    id:5,
    nome:"Bruno Brandão Mendes Sesso", 
    email:"bruno@gmail.com"
  }){
    id,
    nome,
    email
  }
}
```

<h4> Exemplo de Query com variáveis</h4>

```
query GetCliente($id:ID!) {
        cliente(id:$id) {
        id
        nome
        email
    }
}
```
>Abaixo o campo de variáveis
>```
>{
>   "id":2
>}
>```

<h4> Exemplo de Query com paginação</h4>
 
 ```
{
  compras(page:1, size:5){
    id
    quantidade
    status
    cliente{
      id, nome
    }
    produto{
      id, nome, valorReais
    }
  }
}
```