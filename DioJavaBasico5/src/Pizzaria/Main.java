package Pizzaria;
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder()
                .massa("Tradicional")
                .molho("Tomate")
                .recheio("Calabresa")
                .queijoExtra(true)
                .build();

        Pizza pizza2 = new Pizza.Builder()
                .massa("Fina")
                .molho("Branco")
                .recheio("Frango")
                .queijoExtra(false)
                .build();

        GerenciadorDePedidos gerenciador = GerenciadorDePedidos.getInstance();
        gerenciador.adicionarPedido(pizza1);
        gerenciador.adicionarPedido(pizza2);

        gerenciador.mostrarPedidos();
    }
}
