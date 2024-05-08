/* 
    Para executar o arquivo corretamente, primeiro, compile-o digitando no seu terminal:

    - javac AboutMe.java

    
    E em seguida digite:

    - java AboutMe nome sobrenome idade altura 
                  
    
    @Entrada de dados:
    
    nome: String
    sobrenome: String
    idade: int
    altura: double

*/

public class AboutMe {
    public static void main(String[] args) {
        
        // Nome na primeira posição do terminal
        String nome = args[0];
        // Sobrenome na segunda posição do terminal
        String sobrenome = args[1];
        // Idade na terceira posição do terminal
        int idade = Integer.valueOf(args[2]);
        // Altura na quarta posição do terminal
        double altura = Double.valueOf(args[3]);
       
        // Saída dos resultados
        System.out.println("Olá, me chamado " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
