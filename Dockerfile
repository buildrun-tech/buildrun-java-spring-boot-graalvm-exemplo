# Use Ubuntu as the base image
FROM ubuntu:latest

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o jar da aplicação para o diretório de trabalho do container
COPY target/graalvm graalvm

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Set the entry point to run the native binary
ENTRYPOINT ["/app/graalvm"]