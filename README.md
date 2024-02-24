<p align="center" width="100%">
    <img width="50%" src="https://github.com/buildrun-tech/buildrun-agregador-de-investimentos/blob/master/images/stock-market.jpg"> 
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

## Benchmark (Default Configuration)

| Runtime     | Memory  | Total Requests  | Requests per Second    | Latency Max | Error Rate  |
|-------------|---------|-----------------|------------------------|-------------|-------------|
| 1° JVM      | 100 MB  | 404604          | 6735.5                 | 213         | 0%          |
| 2° JVM      | 100 MB  | 428869          | 7139.7                 | 201         | 0%          |
| 3° JVM      | 100 MB  | 458290          | 7630.6                 | 216         | 0%          |
| 1° GraalVM  | 100 MB  | 55601           | 921.6                  | 284         | 0.001%      |
| 2° GraalVM  | 100 MB  | 54949           | 911.4                  | 287         | 0.001%      |
| 3° GraalVM  | 100 MB  | 54973           | 911.7                  | 287         | 0.09%       |


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