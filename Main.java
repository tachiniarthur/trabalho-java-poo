package trabFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Matheus", 5f, 2f, 1f);
        System.out.println("objeto aluno1: " + aluno1.toString());

        Aluno aluno2 = new Aluno("Arthur", 1f, 2f, 3f);
        System.out.println("objeto aluno2: " + aluno2.toString());

        Aluno aluno3 = new Aluno("Gabriel", 6f, 7f, 4f);
        System.out.println("objeto aluno3: " + aluno3.toString());

        System.out.println("Media aluno 1: " + aluno1.getMedia());
        System.out.println("Media aluno 2: " + aluno2.getMedia());
        System.out.println("Media aluno 3: " + aluno3.getMedia());

        // Escrever os dados dos alunos em um arquivo
        escreverDadosAlunos("dados_alunos.txt", aluno1, aluno2, aluno3);

        // Ler os dados dos alunos de um arquivo
        lerDadosAlunos("dados_alunos.txt");
    }

    public static void escreverDadosAlunos(String nomeArquivo, Aluno... alunos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.toString());
                writer.newLine();
            }
            System.out.println("Dados dos alunos foram escritos no arquivo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados dos alunos no arquivo: " + e.getMessage());
        }
    }

    public static void lerDadosAlunos(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println("Dados do aluno lido do arquivo: " + linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler dados dos alunos do arquivo: " + e.getMessage());
        }
    }
}
