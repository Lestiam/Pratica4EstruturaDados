package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Pessoa> deque = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite o telefone da pessoa " + i + ": ");
            String telefone = sc.nextLine();
            System.out.print("Digite o e-mail da pessoa " + i + ": ");
            String email = sc.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            deque.add(pessoa);
        }

        System.out.println("\nLista na ordem convencional:");
        for (Pessoa pessoa : deque) {
            System.out.println(pessoa);
        }

        System.out.println("\nLista na ordem inversa:");
//        while (!deque.isEmpty()) { //decrescente usando while
//            System.out.println(deque.pollLast());
//        }

        //descrescente usando Iterator
        for (Iterator itr = deque.descendingIterator(); itr.hasNext();) {
            System.out.println(itr.next().toString());
        }
        sc.close();

    }
}
