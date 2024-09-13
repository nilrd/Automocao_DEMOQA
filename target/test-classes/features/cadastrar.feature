Feature: Cadastrar
	Como usuario do site DEMOQA
	Quero preencher o formulario
	Para realizar o cadastro
	
	Background:  acessar a funcionalidade de cadastro
		Given que esteja no site: "https://demoqa.com/"
		And clicar no menu "Elements"
		And clicar no submenu "Text Box"
		
				
		Scenario: Novo cadastro
			When preencher o campo nome "Nilson Brites"
			And preencher o campo email "nilson.brites@QAdesucesso.com"
			And preencher o campo CurrentAddress "Vale do Silicio, California, EUA"
			And preencher o campo permanentAddress "Apple, Vale do Silicio California EUA"
			And clicar no botao submit 
			Then valido as informacoes "Name:Nilson Brites Email:nilson.brites@QAdesucesso.com Current Address :Vale do Silicio, California, EUA Permananet Address :Apple, Vale do Silicio California EUA"
			
		