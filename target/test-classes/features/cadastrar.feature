Feature: Cadastrar
	Como usuario
	Quero enviar os dados
	Para realizar o cadastro
	
	Background:  acessar a funcionalidade de cadastro
		Given que esteja no site: "https://demoqa.com/"
		And clicar no menu "Elements"
		And clicar no submenu "Text Box"
		
				
		Scenario: Novo cadastro
			When preencher o campo nome
			And preencher o campo email
			And preencher o campo CurrentAddress
			And preencher o campo permanentAddress
			And clicar no botao submit
			Then valido as informacoes
			
		