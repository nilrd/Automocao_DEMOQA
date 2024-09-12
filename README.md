# Automacao_DEMOQA

## Descrição
Este projeto de automação utiliza **Selenium**, **Java** e **Cucumber** para realizar o preenchimento automático de formulários no site de testes [DEMOQA](https://demoqa.com/). Ele foi desenvolvido com o objetivo de automatizar e validar cenários de teste para campos de formulários interativos, garantindo a correta funcionalidade e integridade do sistema.

## Tecnologias Utilizadas
- **Java**: Linguagem principal do projeto.
- **Selenium WebDriver**: Para interação com o navegador e automação das ações de preenchimento de formulário.
- **Cucumber**: Para a definição de testes em uma linguagem de fácil compreensão utilizando BDD (Behavior Driven Development).
- **JUnit**: Ferramenta de testes para rodar os cenários do Cucumber.
- **Maven**: Gerenciador de dependências e build.

## Estrutura do Projeto
- `src/main/java`: Contém os arquivos de implementação do código.
- `src/test/java`: Contém os arquivos de testes e cenários.
- `features`: Contém os arquivos `.feature` que descrevem os cenários de teste em linguagem Gherkin.
- `pom.xml`: Arquivo de configuração do Maven com as dependências do projeto.

## Pré-requisitos
Antes de rodar o projeto, certifique-se de ter instalado:
- **Java JDK** (versão 8 ou superior)
- **Maven**
- **ChromeDriver** (ou o driver para o navegador de sua escolha)

## Como Executar o Projeto
**1. Clone o repositório:**

   
  `git clone https://github.com/seu-usuario/Automacao_DEMOQA.git`


** 2  Navegue até o diretório do projeto:**


`cd Automacao_DEMOQA`


**Compile o projeto com Maven:**

`mvn clean install`

** 4  Execute os testes:**


`mvn test`

## Cenários de Teste ##

** Os testes cobrem os seguintes cenários:**

- Preenchimento de todos os campos obrigatórios do formulário.
- Validação de campos inválidos.
- Testes de borda para entradas com limites de caracteres.
- Contribuição
- Se você quiser contribuir com este projeto, siga os passos abaixo:

##Faça um fork do projeto.##

- Crie uma nova branch (`git checkout -b feature/sua-feature`).
- Commit suas mudanças (`git commit -m 'Adiciona nova feature`).
- Faça um push para a branch (`git push origin feature/sua-feature`).
- Abra um Pull Request.
