package abstractfactory;

public class Consumidor {
    private Produto produto;
    private Garantia garantia;
    private Nota nota;

    public Consumidor(FabricaAbstrata fabrica) {
        this.produto = fabrica.createProduto();
        this.garantia = fabrica.createGarantia();
        this.nota = fabrica.createNota();
    }
    public String exibirProduto() { return this.produto.exibirDescricao(); }

    public String emitirGarantia() { return this.garantia.emitir(); }

    public String emitirNota() { return this.nota.emitir(); }

}
