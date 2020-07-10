Desafio QA South System
====================================
Como executar<br /> 
Os testes podem ser executados atraves de uma IDE ou pelo comando<br /> 
>

Testes UI<br />
@positivo @tempoAno @perfilParaVoce<br />
Cenario: Deve concluir investimento para o perfil Para Voce com o tempo em ano<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Voce<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao ano<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @tempomes @perfilParaVoce<br />
Cenario: Deve concluir investimento para o perfil Para Voce com o tempo em mes<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Voce<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @tempomes @perfilParaEmpresa<br />
Cenario: Deve concluir investimento para o perfil Para Empresa com o tempo em mes<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @tempoAno @perfilParaEmpresa<br />
Cenario: Deve concluir investimento para o perfil Para Empresa com o tempo em ano<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao ano<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @valorAplicaco @minimo @perfilParaEmpresa @tempoAno <br />
Cenario: Deve concluir investimento para um perfil com o valor de aplicacao minimo<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao em mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @valorAplicaco @maximo @perfilParaEmpresa @tempomes<br /> 
Cenario: Deve concluir investimento para um perfil com o valor de aplicacao maximo<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao em mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @valorInvestir @maximo @perfilParaEmpresa @tempomes<br />
Cenario: Deve concluir investimento para um perfil com o valor de investimento maximo<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao em mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@positivo @valorInvestir @minimo @perfilParaEmpresa @tempomes<br /> 
Cenario: Deve concluir investimento para um perfil com o valor de investimento minimo<br />
DADO que informo o perfil do investidor<br />
QUANDO escolho o perfil sendo Para Empresa<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao em mes<br />
E seleciona simular<br />
ENTAO recebe um retorno de quanto estara guardando<br />

@negativo @valorAplicacao @minimo <br />
Cenario: Deve informar um valor de aplicacao menor que o minimo<br />
DADO que informa o valor que voce quer aplicar<br />
QUANDO esse valor e menor que o valor minimo<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Valor minimo de 20.00"<br />

@negativo @valorAplicacao @maximo <br />
Cenario: Deve informar um valor de aplicacao maior que o maximo<br />
DADO que informa o valor que voce quer aplicar<br />
QUANDO esse valor e maior que o valor maximo<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Maximo de 9999999.00"<br />

@negativo @valorInvestir @minimo <br />
Cenario: Deve informar um valor de investimento menor que o minimo<br />
DADO que informo quanto voce quer poupar todo mes<br />
QUANDO esse valor e menor que o valor minimo<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Valor minimo de 20.00"<br />

@negativo @valorInvestir @maximo <br />
Cenario: Deve informar um valor de aplicacao maior que o maximo<br />
DADO que informo quanto voce quer poupar todo mes<br />
QUANDO esse valor e maior que o valor maximo<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Maximo de 9999999.00"<br />

@negativo @tempoParaPoupar<br />
Cenario: Deve informar um valor de aplicacao nulo<br />
DADO que informa por quanto tempo voce quer poupar<br />
QUANDO esse valor e vazio<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Obrigatorio"<br />

@negativo @tempoParaPoupar @tempoMes @minimo<br />
Cenario: Deve informar um valor de aplicacao minimo em mes<br />
DADO que informa por quanto tempo voce quer poupar<br />
QUANDO esse valor e menor que o minimo<br />
E seleciona a opcao mes<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Valor esperado não confere"<br />

@negativo @tempoParaPoupar @tempoAno @minimo<br />
Cenario: Deve informar um valor de aplicacao minimo em ano<br />
DADO que informa por quanto tempo voce quer poupar<br />
QUANDO esse valor e menor que o minimo<br />
E seleciona a opcao ano<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Valor esperado não confere"<br />

@negativo @tempoParaPoupar @tempoAno @maximo<br />
Cenario: Deve informar um valor de aplicacao maximo em ano<br />
DADO que informa por quanto tempo voce quer poupar<br />
QUANDO esse valor e maior que o maximo<br />
E seleciona a opcao ano<br />
E seleciona simular<br />
ENTAO recebe uma mensagem informando que "Valor esperado não confere"<br />

@positivo @tempoAno @perfilParaVoce @limparFormulario<br />
Cenario: Deve limpar formulario que se encontrar preenchido<br />
DADO que quero limpar o formulario preenchido<br />
QUANDO informo o perfil do investidor<br />
E escolho o perfil sendo Para Voce<br />
E informa o valor que voce quer aplicar<br />
E informa quanto voce quer poupar todo mes<br />
E informa por quanto tempo voce quer poupar<br />
E seleciona a opcao ano<br />
E seleciono limpar formulario<br />
ENTAO deve ser verificado se o valor aplicado retornou vazio<br />
E deve ser verificado se o valor investido retornou vazio<br />
E deve ser verificado e o tempo que quer poupar retornou vazio<br />

Para execucao dos testes e necessario ter os browser nas versoes abaixo<br />
Chrome - Version 83.0.4103.116<br />
Firefox - Version 78.0.2 <br />
Edge - Version 41.16299.1004.0<br />

O brownser de execucao pode ser alterado em: UISimulacao.setUp() <br />
Valores aceitos:<br />
"Chrome"<br />
"Firefox"<br />
caso seja informado um valor diferente sera executado atraves do Edge<br />


Desenvolvido  com<br />
Selenium - 3.141.59 - Framework<br />
Maven - 4.0.0 - Gerente de Dependencia<br />
Java - 8 - Linguegem<br />
JUnit - 4.11 - Framework de Teste<br />
Windows - 10 - Sistema Operacional<br />

Autora<br />
Ana Carolina Prates Santi<br />

