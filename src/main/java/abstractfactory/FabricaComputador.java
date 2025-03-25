package abstractfactory;

public class FabricaComputador implements FabricaAbstrata {

    @Override
    public Produto createProduto() { return new ProdutoComputador(); }

    @Override
    public Garantia createGarantia() { return new GarantiaComputador(); }

    @Override
    public Nota createNota() { return new NotaComputador(); }

}
