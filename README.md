# README.md

## Descrição do Código

Este projeto Java demonstra o uso básico do Java Persistence API (JPA) com o Hibernate para interagir com um banco de dados MySQL. Ele contém exemplos de inserção, busca, atualização e exclusão de registros no banco de dados.

## Estrutura do Projeto

O projeto é dividido em várias partes:

- **aplicacao**: Contém classes Java que demonstram diferentes operações com o JPA.
- **dominio**: Contém a classe `Pessoa` que é uma entidade JPA representando uma tabela no banco de dados.
- **persistence.xml**: Configuração de persistência para o JPA.
- **pom.xml**: Arquivo de configuração do Maven com as dependências necessárias.

## Funcionalidades

### 1. Inserindo Dados (Programa.java)
- Inserção de três registros de `Pessoa` no banco de dados.

### 2. Buscando Dados (Programa2.java)
- Busca um registro específico de `Pessoa` com base no ID fornecido.

### 3. Deletando Dados (Programa3.java)
- Remove um registro específico de `Pessoa` com base no ID fornecido.

### 4. Atualizando Dados (Programa4.java)
- Atualiza o nome de um registro específico de `Pessoa` com base no ID fornecido.

## Dependências

- **Hibernate Core**: 6.4.1.Final
- **Hibernate EntityManager**: 5.6.15.Final
- **MySQL Connector Java**: 8.0.33

## Executando o Projeto

1. Certifique-se de que o MySQL está instalado e em execução.
2. Crie um banco de dados chamado `aulajpa`.
3. Execute cada um dos programas `Programa.java`, `Programa2.java`, `Programa3.java` e `Programa4.java` para ver as operações em ação.

## Observações

- A estratégia de geração de ID é definida como `GenerationType.IDENTITY` na classe `Pessoa`, permitindo que o banco de dados defina o ID automaticamente.
- O arquivo `persistence.xml` contém as configurações de persistência necessárias para o JPA.
