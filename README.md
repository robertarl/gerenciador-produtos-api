<h1> Gerenciador de Produtos </h1>

<p> Este é um sistema web utilizando angular + spring boot (API)  </p>

<h1> Pré-requisitos </h1>

- Spring Boot
- Banco de dados (utilizado: banco h2 escrito em java)

<h1> Documentação api </h1>

<h2> Listar produtos </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| GET    | http://<dominio>/api/products|

### Exemplo de retorno

Status: `200 OK`

```
[
  {
    "id": 1,
    "name": "Produto Exemplo 1",
    "category": {
        "id": 1,
        "name": "Categoria Exemplo 1",
        "hibernateLazyInitializer": {}
    },
    "price": 3149.1,
    "quantity": 30,
    "description": "Descrição Exemplo 1 "
},
{
    "id": 2,
    "name": "Produto Exemplo 2",
    "category": {
        "id": 1,
        "name": "Categoria Exemplo 2",
        "hibernateLazyInitializer": {}
    },
    "price": 3149.1,
    "quantity": 30,
    "description": "Descrição Exemplo 2"
}
]
```
  
  <br>
  
  <h2> Criar produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| POST   | http://<dominio>/api/products|

### BODY PARAMS

| Campo             |  Descrição                           | Tipo    | Obrigatório? |
|:------------------|:-------------------------------------|:--------|:-------------|
| name              | Nome do produto                      | string  | Sim          |
| price             | Preço do produto                     | double  | Sim          |
| quantity          | Quantidade de produtos disponíveis   | int     | Sim          |
| description       | Descrição do produto                 | string  | Sim          |
| categoryId        | Id da Categoria do produto           | int     | Sim          |

### Exemplo de retorno
  
  Status: `200 OK`
  
  ```
{
    "id": 6,
    "name": "Produto Exemplo",
    "category": {
        "id": 1,
        "name": "Categoria Exemplo",
        "hibernateLazyInitializer": {}
    },
    "price": 3149.1,
    "quantity": 30,
    "description": "Descrição Exemplo "
}
```

  <h2> Editar produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| PUT    | http://<dominio>/api/products/id|

### BODY PARAMS

| Campo             |  Descrição                           | Tipo    | Obrigatório? |
|:------------------|:-------------------------------------|:--------|:-------------|
| name              | Nome do produto                      | string  | Sim          |
| price             | Preço do produto                     | double  | Sim          |
| quantity          | Quantidade de produtos disponíveis   | int     | Sim          |
| description       | Descrição do produto                 | string  | Sim          |
| categoryId        | Id da categoria do produto           | int     | Sim          |

### Exemplo de retorno
  
  Status: `200 OK`
  
  ```
{
    "id": 6,
    "name": "Produto Exemplo",
    "category": {
        "id": 1,
        "name": "Categoria Exemplo",
        "hibernateLazyInitializer": {}
    },
    "price": 3149.1,
    "quantity": 30,
    "description": "Descrição Exemplo "
}
```
  
  <h2> Excluir produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| DELETE | http://<dominio>/api/products/id|

### Exemplo de retorno
  
  Status: `204 No Content`
  
 
  
