package prova1.questao2;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    // ArrayList com agregação
    private int codigo;
    private Date data;

    // associação com ArrayList
    private ArrayList<Cliente> clientes;
    private ArrayList<Unidade> unidades;

    public Pedido() {
        // alocação de espaço na memória
        this.setClientes(new ArrayList<Cliente>());
        this.setUnidades(new ArrayList<Unidade>());
    }

    public Pedido(int codigo, Date data, ArrayList<Cliente> clientes, ArrayList<Unidade> unidades) {
        this.codigo = codigo;
        this.data = data;
        this.setClientes(clientes);
        this.setUnidades(unidades);
    }

    public ArrayList<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Unidade> unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Código: " + this.codigo + " Data: " + this.data + "\n Clientes: " + this.clientes.toString() + "\n Unidades: " + this.unidades.toString();
    }

    public void addCliente(Cliente cliente) { 
        this.clientes.add(cliente); // adicona clientes no vetor
    }

    public void addUnidade(Unidade unidade) { 
        this.unidades.add(unidade); // adicona unidades no vetor
    }
}
