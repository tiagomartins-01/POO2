# PREPARANDO AMBIENTE

## UPDATE SERVER HOST

    sudo apt upgrade
    sudo apt update

## CONFERINDO O DOCKER

    docker info
    docker ps -a

## APAGANDO VOLUMES E IMAGENS ANTIGAS

    docker rm -f ...
    docker image rm ...

## AMBIENTE DOCKER PARA BANCO DE DADOS

     docker run --name postgres -e POSTGRES_PASSWORD=password -d -p 5433:5432 postgres

## INSTALANDO O PGADMIN
### INSTALANDO CHAVE PUBLICA DO REPOSITORIO

    sudo curl https://www.pgadmin.org/static/packages_pgadmin_org.pub | sudo apt-key add

### CRIANDO O ARQUIVO DE CONFIGURACAO DO REPOSITORIO

    sudo sh -c 'echo "deb https://ftp.postgresql.org/pub/pgadmin/pgadmin4/apt/$(lsb_release -cs) pgadmin4 main" > /etc/apt/sources.list.d/pgadmin4.list && apt update'

### INSTALACAO

    sudo apt install pgadmin4


# INICIANDO AMBIENTE VIA DOCKER-COMPOSE

    docker-compose up -d

