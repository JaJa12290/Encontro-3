import java.time.LocalDate;

import dominio.*;

public class App{
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno();
        a1.setCodigo(1);
        a1.setNome("Janderson");
        a1.setEndereco("Rua Joao Mizael Mamore, 609");
        a1.setTelefone("987654321");
        a1.setDataNascimento(LocalDate.of(2004, 10, 12));
        a1.setRg("1234432");
        a1.setCpf("12345678998");
        a1.setDataMatricula(LocalDate.of(2021, 03, 01));
         
        Professor p1 = new Professor(2, "Marcio", "Rua Mazzine Mandarano, 343", "987654321", LocalDate.of(1979, 06, 10), "9876543", "98765432111", LocalDate.of(2013, 02, 28), "123", LocalDate.of(2019, 05, 21));
        
        InfoAluno(a1);
        InfoProf(p1);
    }
    public static void InfoAluno(Aluno aluno) {
        System.out.println("Informações do Aluno:\n");
        System.out.println("Código: " + aluno.getCodigo());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("RG: " + aluno.getRg());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Data de Matrícula: " + aluno.getDataMatricula());
        System.out.println();
    }
    public static void InfoProf(Professor professor) {
        System.out.println("Informações do Professor:\n");
        System.out.println("Código: " + professor.getCodigo());
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Telefone: " + professor.getTelefone());
        System.out.println("Data de Nascimento: " + professor.getDataNascimento());
        System.out.println("RG: " + professor.getRg());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Registro: " + professor.getRegistro());
        System.out.println("Data de Contratação: " + professor.getDataContratacao());
    }
    
}