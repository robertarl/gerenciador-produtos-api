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
    "name": "SSD",
    "price": 180.0
  },
  {
    "id": 2,
    "name": "Tv",
    "price": 1200.0
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

### Exemplo de retorno
  
  Status: `200 OK`
  
  ```
{
  "id": 3,
  "name": "Cabo HDMI",
  "price": 100.0
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

### Exemplo de retorno
  
  Status: `200 OK`
  
  ```
{
  "id": 3,
  "name": "MousePad",
  "price": 150.0
}
```
  
  <h2> Excluir produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| DELETE | http://<dominio>/api/products/id|

### Exemplo de retorno
  
  Status: `204 No Content`
  
 
  
