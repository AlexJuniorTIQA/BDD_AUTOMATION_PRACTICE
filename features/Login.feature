# language: pt

Funcionalidade: Processo de login 

@LoginComSucesso
Cenario: Login com sucesso 
Dado que eu esteja na HomePage do site AutomationPractice
Quando clico em 'Sign In'
E preencho o campos de login
Entao ao clicar em 'Sign In' efetuo o login com sucesso

@LoginComFalha
Cenario: Login com Falha 
do que eu esteja na HomePage do site Automation Practice
Quando clico no campo 'Sign In'
E preencho o campo 'Email address'
E preencho o campo 'Password'
Entao ao clicar em 'Sign In' recebo uma mensagem de erro 
