Desafio QA South System

Começando

Para rodar os teste inserir no terminal o comando 

Testes

@positivo @tempoAno @perfilParaVoce
Cenario: Deve concluir investimento para o perfil Para Voce com o tempo em ano
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Voce
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao ano
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @tempomes @perfilParaVoce
Cenario: Deve concluir investimento para o perfil Para Voce com o tempo em mes
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Voce
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @tempomes @perfilParaEmpresa
Cenario: Deve concluir investimento para o perfil Para Empresa com o tempo em mes
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @tempoAno @perfilParaEmpresa
Cenario: Deve concluir investimento para o perfil Para Empresa com o tempo em ano
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao ano
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @valorAplicaco @minimo @perfilParaEmpresa @tempoAno 
Cenario: Deve concluir investimento para um perfil com o valor de aplicacao minimo
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao em mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @valorAplicaco @maximo @perfilParaEmpresa @tempomes 
Cenario: Deve concluir investimento para um perfil com o valor de aplicacao maximo
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao em mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @valorInvestir @maximo @perfilParaEmpresa @tempomes 
Cenario: Deve concluir investimento para um perfil com o valor de investimento maximo
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao em mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@positivo @valorInvestir @minimo @perfilParaEmpresa @tempomes 
Cenario: Deve concluir investimento para um perfil com o valor de investimento minimo
DADO que informo o perfil do investidor
QUANDO escolho o perfil sendo Para Empresa
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao em mes
E seleciona simular
ENTAO recebe um retorno de quanto estara guardando

@negativo @valorAplicacao @minimo 
Cenario: Deve informar um valor de aplicacao menor que o minimo
DADO que informa o valor que voce quer aplicar
QUANDO esse valor e menor que o valor minimo
E seleciona simular
ENTAO recebe uma mensagem informando que "Valor minimo de 20.00"

@negativo @valorAplicacao @maximo 
Cenario: Deve informar um valor de aplicacao maior que o maximo
DADO que informa o valor que voce quer aplicar
QUANDO esse valor e maior que o valor maximo
E seleciona simular
ENTAO recebe uma mensagem informando que "Maximo de 9999999.00"

@negativo @valorInvestir @minimo 
Cenario: Deve informar um valor de investimento menor que o minimo
DADO que informo quanto voce quer poupar todo mes
QUANDO esse valor e menor que o valor minimo
E seleciona simular
ENTAO recebe uma mensagem informando que "Valor minimo de 20.00"

@negativo @valorInvestir @maximo 
Cenario: Deve informar um valor de aplicacao maior que o maximo
DADO que informo quanto voce quer poupar todo mes
QUANDO esse valor e maior que o valor maximo
E seleciona simular
ENTAO recebe uma mensagem informando que "Maximo de 9999999.00"

@negativo @tempoParaPoupar
Cenario: Deve informar um valor de aplicacao nulo
DADO que informa por quanto tempo voce quer poupar
QUANDO esse valor e vazio
E seleciona simular
ENTAO recebe uma mensagem informando que "Obrigatorio"

@negativo @tempoParaPoupar @tempoMes @minimo
Cenario: Deve informar um valor de aplicacao minimo em mes
DADO que informa por quanto tempo voce quer poupar
QUANDO esse valor e menor que o minimo
E seleciona a opcao mes
E seleciona simular
ENTAO recebe uma mensagem informando que "Valor esperado não confere"

@negativo @tempoParaPoupar @tempoAno @minimo
Cenario: Deve informar um valor de aplicacao minimo em ano
DADO que informa por quanto tempo voce quer poupar
QUANDO esse valor e menor que o minimo
E seleciona a opcao ano
E seleciona simular
ENTAO recebe uma mensagem informando que "Valor esperado não confere"

@negativo @tempoParaPoupar @tempoAno @maximo
Cenario: Deve informar um valor de aplicacao maximo em ano
DADO que informa por quanto tempo voce quer poupar
QUANDO esse valor e maior que o maximo
E seleciona a opcao ano
E seleciona simular
ENTAO recebe uma mensagem informando que "Valor esperado não confere"

@positivo @tempoAno @perfilParaVoce @limparFormulario
Cenario: Deve limpar formulario que se encontrar preenchido
DADO que quero limpar o formulario preenchido
QUANDO informo o perfil do investidor
E escolho o perfil sendo Para Voce
E informa o valor que voce quer aplicar
E informa quanto voce quer poupar todo mes
E informa por quanto tempo voce quer poupar
E seleciona a opcao ano
E seleciono limpar formulario
ENTAO deve ser verificado se o valor aplicado retornou vazio
E deve ser verificado se o valor investido retornou vazio
E deve ser verificado e o tempo que quer poupar retornou vazio

Browser 

Chrome - 
Firefox - 
Edge - 

Desenvolvido  com

Selenium - 3.141.59 - Framework
Maven - 4.0.0 - Gerente de Dependência
Java - 8 - Linguegem
JUnit - 4.11 - Framework de Teste

Autora

Ana Carolina Prates Santi

