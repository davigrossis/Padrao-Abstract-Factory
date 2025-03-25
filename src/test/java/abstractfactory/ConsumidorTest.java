package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ConsumidorTest {

    @Test
    void deveEmitirGarantiaCelular() {
        FabricaAbstrata fabrica = new FabricaCelular();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Garantia do Celular", consumidor.emitirGarantia());
    }

    @Test
    void deveEmitirNotaCelular() {
        FabricaAbstrata fabrica = new FabricaCelular();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Nota Fiscal do Celular", consumidor.emitirNota());
    }

    @Test
    void deveExibirProdutoCelular() {
        FabricaAbstrata fabrica = new FabricaCelular();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Iphone 15, Meia-Noite , 128gb", consumidor.exibirProduto());
    }

    @Test
    void deveEmitirGarantiaComputador() {
        FabricaAbstrata fabrica = new FabricaComputador();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Garantia do Computador", consumidor.emitirGarantia());
    }

    @Test
    void deveEmitirNotaComputador() {
        FabricaAbstrata fabrica = new FabricaComputador();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Nota fiscal do Computador", consumidor.emitirNota());
    }

    @Test
    void deveExibirProdutoComputador() {
        FabricaAbstrata fabrica = new FabricaComputador();
        Consumidor consumidor = new Consumidor(fabrica);
        assertEquals("Computador i7 9° geração, rtx 2060 , ssd nvme 120gb", consumidor.exibirProduto());
    }

}
