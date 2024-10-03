Aqui está um exemplo de um arquivo `README.md` para o seu projeto no GitHub, descrevendo a implementação das classes e interfaces que modelam um iPhone com funcionalidades de reprodutor musical, aparelho telefônico e navegador na internet:

```markdown
# Projeto iPhone - Java Implementation

Este projeto implementa a modelagem de um **iPhone** em Java, utilizando os conceitos de **herança** e **interfaces** para representar as funcionalidades de um reprodutor musical, aparelho telefônico e navegador de internet.

## Descrição

O projeto segue a seguinte estrutura:

- **Interfaces:**
  - `ReprodutorMusical`: Define métodos relacionados à reprodução de música (tocar, pausar, selecionar música).
  - `NavegadorInternet`: Define métodos para navegação na web (exibir página, adicionar nova aba, atualizar página).
  
- **Classes:**
  - `AparelhoTelefonico`: Classe que representa as funcionalidades de um telefone (ligar, atender, iniciar correio de voz).
  - `Iphone`: Classe que **herda** de `AparelhoTelefonico` e **implementa** as interfaces `ReprodutorMusical` e `NavegadorInternet`. O iPhone é capaz de realizar operações de telefone, reprodução de música e navegação na web.

## Estrutura de Código

- **ReprodutorMusical.java**: Interface que define os métodos para controle de música.
- **NavegadorInternet.java**: Interface que define os métodos para navegação na web.
- **AparelhoTelefonico.java**: Classe que implementa as funcionalidades básicas de um telefone.
- **Iphone.java**: Classe que herda de `AparelhoTelefonico` e implementa `ReprodutorMusical` e `NavegadorInternet`.

### Diagrama UML

O seguinte diagrama UML ilustra as relações entre as classes e interfaces do projeto:

![UML Diagram](link_para_o_diagrama)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone rep
   ```

2. Compile os arquivos `.java`:
   ```bash
   javac Iphone.java
   ```

3. Execute a classe `Iphone`:
   ```bash
   java Iphone
   ```

## Funcionalidades

### Reprodutor Musical
- Tocar música
- Pausar música
- Selecionar música

### Aparelho Telefônico
- Ligar para um número
- Atender chamadas
- Iniciar correio de voz

### Navegador de Internet
- Exibir página da web
- Adicionar nova aba
- Atualizar página

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou fazer um **pull request**.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
```

Este `README.md` fornece uma descrição clara do projeto, incluindo suas funcionalidades e como executá-lo. Você pode adicionar um link para o diagrama UML e ajustar as seções conforme necessário.
