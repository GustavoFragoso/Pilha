public class Pilha<T> {
        private T[] pilha;
        private int localizacao;
        private int tamanho;

        public Pilha(int tamanho) {
            this.localizacao = -1;
            this.tamanho = tamanho;
            this.pilha = (T[]) new Object[tamanho];
        }

        public boolean estaVazia() {
            return localizacao == -1;
        }

        public int getTamanho() {
            return localizacao + 1;
        }

        public void empilhar(T valor) {
            if (localizacao < tamanho - 1) {
                pilha[++localizacao] = valor;
            } else {
                throw new IllegalStateException("A pilha está cheia");
            }
        }

        public T desempilhar() {
            if (estaVazia()) {
                throw new IllegalStateException("A pilha está vazia");
            }
            T elemento = pilha[localizacao];
            pilha[localizacao] = null; // Limpa a referência
            localizacao--;
            return elemento;
        }

        public T topo() {
            if (estaVazia()) {
                throw new IllegalStateException("A pilha está vazia");
            }
            return pilha[localizacao];
        }
    public void mostrarElementos() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Elementos da pilha:");
            for (int i = 0; i <= localizacao; i++) {
                System.out.println(pilha[i]);
            }
        }
    }


        // Métodos de impressão ou qualquer outro podem ser adicionados no código cliente.
        public static void main(String args[]){
            Pilha<String> p = new Pilha<>(3);
            p.empilhar("luffy");
            p.empilhar("naruto");
            p.empilhar("ichigo");
            p.desempilhar();
            p.mostrarElementos();

        }

}

