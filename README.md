# ApiContato

# Sobre o projeto

https://api-contato-protfolio.onrender.com

Um projeto desenvilvido para uso geral.

A API foi criada com o intuito de receber os dados de visitantes em uma página web que tenham interece em orçamento ou contratar serviços. 
Alem de percistir os dados em banco, a API tambem envia um email de recebimento para o usuário e para o ADM da página web em questão.

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
- Swagger UI
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


# Autor

Dyeggo Silva

https://www.linkedin.com/in/dyeggo-bezerra-0518211b1/

