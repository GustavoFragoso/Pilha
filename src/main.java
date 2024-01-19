import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        System.out.println("Digite o tamanho da Pilha");
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        Pilha<String> p = new Pilha<>(tamanho );
        p.limparConsole();

        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("1 - PRINTAR\n" + "2 - DESEMPILHAR\n" + "3 - EMPILHAR\n" + "0 - FIM");
            System.out.print("escolha uma opção: ");
            String opcao = sc1.next().toUpperCase();
            switch (opcao) {
                case "PRINTAR", "1":
                    p.mostrarElementos();
                    break;
                case "DESEMPILHAR", "2":
                    if (p.estaVazia()) {
                        System.out.println("pilha esta vazia");
                        break;
                    } else {
                        System.out.println("desimpilhando a palavra:" + p.topo());
                        p.desempilhar();
                        break;
                    }
                case "EMPILHAR", "3":
                    while (true) {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.print("Oque deseja empilhar: ");
                        String palavra = sc2.next().toUpperCase();
                        if (palavra.equals("SAIR")) {
                            p.limparConsole();
                            break;
                        } else if (!p.pilhaCheia()) {
                            p.limparConsole();
                            System.out.println("Empililhando: "+palavra);
                            p.empilhar(palavra);
                        }
                    }
                    break;
                case "FIM" , "0":
                    sc1.close();
                    return;
            }
        }
    }
}