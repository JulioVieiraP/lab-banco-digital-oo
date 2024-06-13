public class Transaction {
    private String tipo;
    private double valor;

    public Transaction(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +'}';
    }
}
