import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        //ctrl+d cola apenas selecionando
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //usando polimorfismo, criando um curso a partir da classe pai
        //curso a partir de conteudo, porque conteúdo não pode ser instanciado
        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        //quando for criada vai chamar a data da criação

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */
        //criando uma instância e adicionando conteúdo a Conteudo
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.inscrverBootcamp(bootcamp);
        devCamila.setNome("Camila");
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Conluidos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("..............");

        //conforme progride, vai concluindo os cursos
        Dev devJoao = new Dev();
        devJoao.inscrverBootcamp(bootcamp);
        devJoao.setNome("Joao");
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
