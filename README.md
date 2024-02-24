<p align="center" width="100%">
    <img width="20%" src="https://github.com/buildrun-tech/buildrun-java-spring-boot-graalvm-exemplo/blob/main/images/k52X6F9e_400x400.png"> 
</p>


<h3 align="center">
  Backend de um Agregador de Investimentos
</h3>

<p align="center">

  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-java-green">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">

</p>

[Se inscreva em nosso canal no Youtube!](https://www.youtube.com/@buildrun-tech?sub_confirmation=1)

Para um maior entendimento do código deste repositório, acompanhe nossa série de vídeos:

## Como compilar o seu código para a GraalVM?

```bash
./mvnw clean -Pnative native:compile
```

## Problemas Comuns

### Executável compilado não detecta classes que utilizam "Reflections"

1. Execute o seu projeto dentro da JVM com a seguinte VM Option:
```VM Option
-agentlib:native-image-agent=config-output-dir=app/src/main/resources/META-INF/native-image
```
2. Após a aplicação subir, execute um teste funcional (fluxo de sucesso e erro) para que o profiling detecte os possíveis caminhos da aplicação
3. Após os seus testes, pode parar o projeto, será gerado um profiling neste caminho `/src/main/resources/META-INF/native-image` para a GraalVM
4. Execute o mesmo comando de compilação nativa novamente para recompilar utilizando as informações de profiling!


## :rocket: Tecnologias utilizadas

* Java 21
* Spring Boot
* GraalVM

:mag: Baixe o projeto e teste você mesmo na prática.

[Conheça mais sobre o nosso trabalho 😀](https://www.instagram.com/buildrun.tech/)

Developed by Build & Run