import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);**/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito de Camila");
        System.out.println(dev1.getConteudosInscrito());
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteudos Comcluidos");
        System.out.println(dev1.getConteudosFinalizados());
        System.out.println("Conteudos inscrito de Camila");
        System.out.println(dev1.getConteudosInscrito());
        System.out.println("XP "+ dev1.calcularXP());
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteudos Comcluidos");
        System.out.println(dev1.getConteudosFinalizados());
        System.out.println("Conteudos inscrito de Camila");
        System.out.println(dev1.getConteudosInscrito());
        System.out.println("XP "+ dev1.calcularXP());


        System.out.println("--------------------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("JOão");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito de João");
        System.out.println(dev2.getConteudosInscrito());
        dev2.progredir();
        System.out.println("--");
        System.out.println("Conteudos Comcluidos");
        System.out.println(dev2.getConteudosFinalizados());
        System.out.println("Conteudos inscrito de João");
        System.out.println(dev2.getConteudosInscrito());
        System.out.println("XP "+ dev2.calcularXP());

    }
}