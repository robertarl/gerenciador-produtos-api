<h1 align="center"> Gerenciador de Produtos </h1>

<p align="center"> Este é um sistema web utilizando angular + spring boot (API)  </p>

<h1 align="center"> Pré-requisitos </h1>

- Spring Boot
- Banco de dados (utilizado: banco h2 escrito em java)

<h1 align="center"> Documentação api </h1>

<h2 align="center"> Listar produtos </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| GET    | http://<dominio>/api/products|

### BODY PARAMS

| Campo             |  Descrição                           | Tipo    | Obrigatório? |
|:------------------|:-------------------------------------|:--------|:-------------|
| id                | Id do produto(Gerado automaticamente)| Long    | Sim          |
| name              | Nome do produto                      | string  | Sim          |
| price             | Preço do produto                     | double  | Sim          |

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
  
  <h2 align="center"> Criar produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| POST   | http://<dominio>/api/products|

### BODY PARAMS

| Campo             |  Descrição                           | Tipo    | Obrigatório? |
|:------------------|:-------------------------------------|:--------|:-------------|
| id                | Id do produto(Gerado automaticamente)| Long    | Sim          |
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

  <h2 align="center"> Editar produto </h2>

| Method | Url                               |
|:-------|:----------------------------------|
| PUT    | http://<dominio>/api/products/id|

### BODY PARAMS

| Campo             |  Descrição                           | Tipo    | Obrigatório? |
|:------------------|:-------------------------------------|:--------|:-------------|
| id                | Id do produto(Gerado automaticamente)| Long    | Sim          |
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
  
 
  
