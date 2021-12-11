Este Desafio da DIO aborda conceitos primordiais sobre orientação a objetos como: Classes e Objetos, Herança, Polimorfismo, Encapsulamento, associação de classes, etc...
Tudo isso criado num contexto de inscrições em um Bootcamp, possuindo as seguintes classes:
Bootcamp, Dev, Curso, Main, Mentoria e Conteudo.
O fluxo para ser realizada a inscrição:
Criado o bootcamp o Dev se inscreve e recebe contéudos,
cada conteúdo que o mesmo consome, vai alimentando o método calcularXP,
ao finalizar os conteudos como concluídos o XP vai aumentando;
Obs.: Algumas linhas foram comentadas para melhor entendimento e assimilação do conteúdo.

CONCEPÇÕES BÁSICAS SOBRE OS PRINCIPAIS CONCEITOS DE POO
:arrow_forward: CLASSE E OBJETO: 
PODEMOS ENCHERGAR UMA CLASSE COMO UMA MATRIZ E OS OBJETOS SÃO AS "CÓPIAS DESSA CLASSE", POSSUINDO OU NÃO, TODOS OS SEUS ATRIBUTOS E COMPORTAMENTOS.

:arrow_forward: ASSOCIAÇÃO DE CLASSES:
QUANDO UTILIZAMOS UMA CLASSE DENTRO DE OUTRA CLASSE.

:arrow_forward: ENCAPSULAMENTO: 
E A POSSIBILIDADE DE PROTEGER
ALGUNS DADOS OU FUNCIONALIDADES
DA CLASSE, NÃO PERMITINDO QUE SEUS
CONSUMIDORES POSSAM ACESSÁ-LA, EXEMPLOS DE MÉTODOS QUE UTILIZAMOS PARA ENCAPSULAR NOSSAS INFORMAÇÕES: MÉTODOS GETTERS E SETTERS, MODIFICADORES DE ACESSO(PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL ENTRE OUTROS)

:arrow_forward: HERANÇA: 
CONSISTE EM UMA CLASSE PAI EM QUE TODOS AS OUTRAS CLASSES QUE SERÃO SUAS FILHAS PODERÃO HERDAR SEUS MÉTODOS E ATRIBUTOS.

:arrow_forward: POLIMORFISMO:
AQUI PODEMOS CRIAR FUNÇÕES QUE TERÃO
O MESMO NOME, MAS QUE PODEM TER
DIFERENTES PROCESSAMENTOS, IMPLEMENTAÇÕES,
OU NA MESMA CLASSE O MESMO NOME E DIFERENTES ENTRADAS O MESMO OBJETO PODE SER REFERENCIADO DE VÁRIAS FORMAS.
UMA EXEMPLO SERIA CRIAR UMA FUNÇÃO QUE RETORNA APENAS UM PARÂMETRO E DEPOIS CRIAR ESSA MESMA FUNÇÃO EM UMA OUTRA PARTE DO CÓDIGO E PASSAR 2 OU MAIS PARÂMETROS. EXISTEM ALGUNS CONCEITOS DENTRO DO POLIMORFISMO QUE SÃO CONSEQUÊNCIAS DA HERANÇA:
SOBREESCRIÇÃO(@OVERRIDE) :arrow_forward:  OCORRE QUANDO HERDAMOS MÉTODOS DE UMA CLASSE PAI EM SUAS CLASSES FILHAS QUE POSSUEM O MESMO NOME, MAS QUE RETORNAM MENSAGENS DIFERENTES. 

:arrow_forward: OUTROS CONCEITOS UTILIZADOS EM POO
:arrow_forward: SOBRECARGA(OVERLOAD) :arrow_forward:  OCORRE QUANDO CRIAMOS MÉTODOS COM O MESMO NOME, MAS QUE POSSUEM CHAMADAS DE ARGUMENTOS DIFERENTES.
:arrow_forward: UM EXEMPLO DE SOBRECARGA SÃO OS CONSTRUTORES QUE QUANDO DECLARADOS POSSUEM PARÂMETROS DIFERENTES QUE OBRIGAM O USUÁRIO A PREENCHER QUANDO FOR INSTANCIADA UMA NOVA CLASSE DE DAQUELE OBJETO. EX: CLASSE PESSOA QUE TEM ATRIBUTOS String nome, int idade.
NO PRIMEIRO CONSTRUTOR EU DECLARO VAZIO E NO SEGUNDO EU DECLARO PEDINDO NOME E IDADE QUE PODE RECEBER VALORES PADRÃO OU NÃO.
public Pessoa () {
//VAZIO
}
public Pessoa ( String nome, int idade) {
//AQUI PODEMOS CRIAR VALORES PADRÃO
}
**OBSERVAÇÃO: O JAVA JÁ CRIA AUTOMATICAMENTE UM CONSTRUTOR VAZIO ASSIM QUE CRIAMOS UMA CLASSE
ASSIM COMO TAMBÉM IMPLICITAMENTE AO CRIAR UMA CLASSE ELA JÁ HERDA DE OBJECT.**