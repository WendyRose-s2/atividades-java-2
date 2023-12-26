package JavaAtividades2;

import java.util.Stack;
import java.util.Scanner;

public class FilaPilha {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros na pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println(nomeLivro + " foi adicionado à pilha.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha: " + pilhaLivros);
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia. Não é possível retirar um livro.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro retirado: " + livroRetirado);
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

