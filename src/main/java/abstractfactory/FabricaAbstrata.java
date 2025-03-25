package abstractfactory;

public interface FabricaAbstrata {
    Produto createProduto();
    Garantia createGarantia();
    Nota createNota();
}
