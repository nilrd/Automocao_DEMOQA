Feature: Cadastrar 
Como usuario
Quero enviar os dados
Para realizar o cadastro


Background: acessar a funcionalidade de cadastro
Given que esteja no site "https://demoqa.com/"
And clicar no menu "Elements" 
And clicar no submenu "Text Box"

Scenario: Novo cadastro
When preencher o campo nome "Nilson Brites"
And preencher o campo email "nilson.brites@qadesucesso.com"
And preencher o campo CurrentAddress "Rua dos QA de sucesso"
And preencher o campo permanentAddress "São Paulo - SP"
And clicar no botao submit
Then valido as informacoes "Name:Nilson Brites Email:nilson.brites@qadesucesso.com Current Address :Rua dos QA de sucesso Permananet Address :São Paulo - SP"
