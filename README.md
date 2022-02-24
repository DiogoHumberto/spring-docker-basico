# spring-docker-basico

Finalidade basica para conhecer como criar um projeto spring com docker usando dockerfile.

Usamos:
<div style="display: inline_block"><br>
  <img align="center" alt="Diogo-Java" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  <img align="center" alt="Diogo-Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg">
  <img align="center" alt="Diogo-docker" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg">
 
  
 
  
  ##
 
<div>   

## Fazendo build da Imagem 
docker build -t first-spring-docker:0.0.1-SNAPSHOT .

---> pode acessar o repositorio docker: https://hub.docker.com/r/diogohumberto/first-spring-docker


docker run -p 8085:8080 -d diogohumberto/first-spring-docker:0.0.1-SNAPSHOT

Abrir no navegador : http://localhost:8085/docker/port

Comando basicos 
//lista containers ativos
  
docker container ls 

//lista todos os containers 
  
docker container ls -a

//inicia container 
  
docker container start "nome container"

//para um container
  
docker container stop "nome container" 
