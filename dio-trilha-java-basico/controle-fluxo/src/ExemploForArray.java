public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno no indice i = " + i + " é " + alunos[i]);
        }

        System.out.println("--------------------------------------------");

        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
