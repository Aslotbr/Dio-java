package DesafioParadigma;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso("Java Básico", "Curso de Java para iniciantes", 8);
        Curso curso2 = new Curso("Java Avançado", "Curso de Java para desenvolvedores experientes", 12);
        
        // Criando mentoria
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "Orientações sobre carreira em TI", LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Intensivo de desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // Criando Devs
        Dev dev1 = new Dev("Alice");
        Dev dev2 = new Dev("Bob");

        // Inscrevendo Devs no Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        // Progredindo nos conteúdos
        dev1.progredir(); // Alice conclui "Java Básico"
        dev1.progredir(); // Alice conclui "Java Avançado"
        dev2.progredir(); // Bob conclui "Java Básico"

        // Calculando XP
        System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
        System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}

