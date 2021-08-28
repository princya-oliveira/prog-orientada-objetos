package lista3.ecommerce;
import java.util.Date;

public class Carrinho {

    private int codigo;
    private float valorTotal;
    private String formaPagto;
    private Date data;
    private String formaEntrega;
    // associação
    private ItemCarrinho itemCarrinho;

    public Carrinho() {
    }

    public Carrinho(int codigo, float valorTotal, String formaPagto, Date data, String formaEntrega, 
    int codigoIC, float valorIC, int qtdeIC) {
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setFormaPagto(formaPagto);
        this.setData(data);
        this.setFormaEntrega(formaEntrega);
        this.itemCarrinho = new ItemCarrinho(codigoIC, valorIC, qtdeIC); // composição
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

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public ItemCarrinho getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(int codigoIC, float valorIC, int qtdeIC) {
        this.itemCarrinho = new ItemCarrinho(codigoIC, valorIC, qtdeIC); // composição
    }

    public String toString() {
        return "Código: " + this.codigo + " Valor total: " + this.valorTotal + " Pagto: " + this.formaPagto +
        " Data: " + this.data + " Entrega: " + this.formaEntrega + " \n Item carrinho: " + this.itemCarrinho.toString();
    }

}
