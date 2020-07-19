# SpringBoot with GraphQL
<b><i>Api RestFull purchases using GraphQL with Spring Boot</b></em>

### h3 Exemplos de Query com Alias
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

### h3 Exemplos de Query com Fragment
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

### h3 Exemplos de Query Mutation com input type
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
### h3 Exemplos de Query com variáveis
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