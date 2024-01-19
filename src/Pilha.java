public class Pilha<T> {
        private T[] pilha;
        private int localizacao;
        private int tamanho;

        public Pilha(int tamanho) {
            this.localizacao = 0;
            this.tamanho = tamanho;
            this.pilha = (T[]) new Object[tamanho];
        }
        public boolean estaVazia() {
            if (localizacao == 0){
                return true;
            }else{
                return false;
            }
        }
        public int getTamanho() {
            return localizacao + 1;
        }
        public void empilhar(T valor) {
            if (!pilhaCheia()) {
                pilha[localizacao++] = valor;
                if(true) {
                    int espacoRestante = tamanho-localizacao;
                    System.out.println("Faltam apenas:"+ espacoRestante);
                }
            }
        }
        public T desempilhar() {
            if (estaVazia()) {
                System.out.println("A pilha está vazia");
            }
            T elemento = pilha[localizacao];
            pilha[localizacao] = null; // Limpa a referência
            localizacao--;
            return elemento;
        }

        public Object topo() {
            if (estaVazia()) {
                System.out.println("A pilha está vazia");
            }
            return pilha[localizacao];
        }
    public void mostrarElementos() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Elementos da pilha:");
            for (int i = localizacao -1; i >= 0; i--) {
                System.out.println("┌────────────┐");
                System.out.println("│ " + pilha[i] );
                System.out.println("└────────────┘");

            }
        }
    }
    public boolean pilhaCheia(){
            if(tamanho == localizacao){
                System.out.println("pilha cheia  \nRemova elementos para continuar");
                return true;
            } else {
                return false;
            }
    }
    public String limparConsole(){
        for (int i = 0; i < 50; ++i){
            System.out.println();
        }
        return "";
    }
}

