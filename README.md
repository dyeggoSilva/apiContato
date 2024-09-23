# ApiContato

 ## URL da execução em produção

  https://api-contato-protfolio.onrender.com

# Sobre o projeto

Um projeto desenvolvido para uso geral.

A API foi criada com o intuito de receber os dados de visitantes em uma página web que tenham interece em orçamento ou contratar serviços. 
Além de persistir os dados em banco, a API também envia um email de recebimento para o usuário e para o ADM da página web em questão.

## Exemplo de página web
![Mobile 1](https://github.com/dyeggoSilva/apiContato/blob/main/imagens/tela.png) 

## Diagrama de camadas
![Mobile 1](https://github.com/dyeggoSilva/apiContato/blob/main/imagens/camadas-1.jpg) 

# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Docker
- Lombok
- Swagger UI (Java Doc)
- Mockito
- JUnit 5
## Implantação em produção
- Back end: Render
- Banco de dados: Postgresql
  
# Como executar o projeto

## Back end
Pré-requisitos:
- Java 17
- Docker

## Comandos

```bash
# clonar repositório
git clone 

# entrar na pasta do projeto
cd apiContato

# Crie a imagem do projero no docker
docker build -t contatos .

# rode a imagem criada 
docker run -p 8080:8080 contatos
```

## URL da execução local 

- http://localhost:8080/
- http://localhost:8080/swagger-ui/index.html

# Autor

Dyeggo Silva

https://www.linkedin.com/in/dyeggo-bezerra-0518211b1/

