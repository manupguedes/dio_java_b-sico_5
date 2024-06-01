package Pizzaria;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDePedidos {
    private static GerenciadorDePedidos instancia;
    private List<Pizza> pedidos;

    private GerenciadorDePedidos() {
        pedidos = new ArrayList<>();
    }

    public static GerenciadorDePedidos getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorDePedidos();
        }
        return instancia;
    }

    public void adicionarPedido(Pizza pizza) {
        pedidos.add(pizza);
    }

    public List<Pizza> getPedidos() {
        return pedidos;
    }

    public void mostrarPedidos() {
        for (Pizza pizza : pedidos) {
            System.out.println(pizza);
        }
    }
}
