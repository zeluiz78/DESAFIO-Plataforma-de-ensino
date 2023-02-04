package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Video;
import entities.Task;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> lesson = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            System.out.println();
            System.out.println("Dados da " + (i+1) + "a aula: ");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            sc.nextLine();
            char type = sc.next().charAt(0);
            System.out.print("Título: ");
            sc.nextLine();
            String title = sc.nextLine();
            if (type == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                Integer seconds = sc.nextInt();
                Video vd = new Video(title, url, seconds);
                lesson.add(vd);
            }
            else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                Integer questionCount = sc.nextInt();
                Task task = new Task(title, description, questionCount);
                lesson.add(task);
            }

        }

        int sum = 0;
        System.out.println();
        for (Lesson ln : lesson) {
            sum += ln.duration();
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");


        sc.close();
    }

}