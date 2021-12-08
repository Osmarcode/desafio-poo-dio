package br.com.dio.desafio.dominio;

//quando a classe for abstract não conseguiremos
//instanciar a classe, classe criada apenas
//para que o código não fique repetido
//então as outras apenas irão herdar
public abstract class Conteudo {
    //final representra uma constante
    //static o atributo pode ser acessado
    // fora dessa classe
    //protected só pode ser acessado
    // pelos filhos de conteudo private
    //aqui serão criados atributos e métodos
    //que as classes filhas herdaram
    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    //método abstract, as classes que extenderem
    //serão obrigadas a implementar esse método

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
