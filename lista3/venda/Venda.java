package lista3.venda;
import java.util.ArrayList;
import java.util.Date;

// ArrayList com composição
public class Venda {

    private int codigo;
    private float valorTotal;
    private Date data;
    // ArrayList
    private ArrayList<ItemVenda> itens;

    public Venda() {
        this.setItens(new ArrayList<ItemVenda>());
    }

    public Venda(int codigo, float valorTotal, Date data) {
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setData(data);
        this.setItens(new ArrayList<ItemVenda>());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    
    // adiciona um item de venda - composição
    public void addItemVenda(int codigo, String nome, int qtde, float valor) {
        // item venda depende da venda
        this.itens.add(new ItemVenda(codigo, nome, qtde, valor));
    }

    public String toString() {
        return "Código: " + this.codigo + " Valor Total: " + this.valorTotal + " Data: " + this.data + " Itens da venda: " + this.itens.toString();
    }
}
