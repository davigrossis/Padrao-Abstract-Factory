package abstractfactory;

public class FabricaCelular implements FabricaAbstrata {

    @Override
    public Produto createProduto() { return new ProdutoCelular(); }

    @Override
    public Garantia createGarantia() { return new GarantiaCelular(); }

    @Override
    public Nota createNota() { return new NotaCelular(); }

}
