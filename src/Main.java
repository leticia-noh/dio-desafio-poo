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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
