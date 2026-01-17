<img src="VLCODE.png" alt="logo" width="150">

# Inventory Manager API

API REST profissional para gestão de inventário, desenvolvida com foco em arquitetura limpa, segurança e escalabilidade.

## Tecnologias Utilizadas
- **Java 21** & **Spring Boot 3**
- **MySQL 8** (Containerizado via Docker)
- **Flyway** (Versionamento de Banco de Dados)
- **Swagger/OpenAPI** (Documentação Automática)
- **Bean Validation** (Regras de negócio e blindagem de dados)
- **Docker Compose** (Infraestrutura como Código)

## Arquitetura e Design
O projeto segue a **Layered Architecture** para garantir o princípio de Responsabilidade Única (SOLID):
- **Controller:** Gerencia requisições REST e validação de DTOs.
- **Service:** Encapsula a lógica de negócio (Ex: validação de estoque negativo).
- **Repository:** Camada de persistência segura com Spring Data JPA.
- **DTO Pattern:** Proteção da estrutura do banco de dados na exposição da API.

## Como Rodar o Projeto

### Pré-requisitos
- Docker Desktop instalado
- Java 21 JDK

### Passo a Passo
1. Clone o repositório:
```bash
git clone [https://github.com/SEU-USUARIO/inventory-manager-api.git](https://github.com/SEU-USUARIO/inventory-manager-api.git)

Suba o banco de dados (MySQL):
docker-compose up -d

Execute a aplicação na sua IDE ou via Maven.
Acesse a documentação interativa (Swagger): http://localhost:8080/swagger-ui/index.html
```

## Diferenciais Técnicos

- **Tratamento Global de Erros:** Exceções capturadas e transformadas em JSON padronizado.

- **Database Migrations:** O banco não é criado "magicamente"; usamos scripts SQL versionados via Flyway.

- **Validações Estritas:** Uso de @NotNull, @Min e @NotBlank para garantir integridade.
