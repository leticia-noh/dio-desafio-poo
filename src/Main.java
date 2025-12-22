import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição do curso Java", 8);

        Curso curso2 = new Curso("Curso JS", "Descrição do curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da mentoria Java", LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMary = new Dev();
        devMary.setNome("Mary");
        devMary.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (Mary): " + devMary.getConteudosInscritos() + "\n");

        devMary.progredir();
        devMary.progredir();

        System.out.println("-------------------------------------------------------\n");

        System.out.println("Conteúdos inscritos (Mary): " + devMary.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos concluídos (Mary): " + devMary.getConteudosConcluidos() + "\n");
        System.out.println("XP (Mary): " + devMary.calcularTotalXP() + "\n");

        System.out.println("========================================================\n");

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (John): " + devJohn.getConteudosInscritos() + "\n");

        devJohn.progredir();

        System.out.println("-------------------------------------------------------\n");

        System.out.println("Conteúdos inscritos (John): " + devJohn.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos concluídos (John): " + devJohn.getConteudosConcluidos() + "\n");
        System.out.println("XP (John): " + devJohn.calcularTotalXP() + "\n");
    }
}
