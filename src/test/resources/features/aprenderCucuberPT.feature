# language: pt

Funcionalidade: Aprender Cucumber 
	Como um aluno 
	Eu queri aprender Cucuber
	Para que eu possa automatizar criterios de aceitacao

@testPT
Cenario: Deve executar especificacao
	Dado que criei o arquivo corretamente 
	Quando executa lo
	Entao a especificacao deve finaliuzar com sucesso 

@testPT2	
Cenario: Deve Incrementar Contador com sucesso
	Dado que o valor do contador e 15
	Quando eu incremnetar em 5
	Entao o valor do contador sera 20