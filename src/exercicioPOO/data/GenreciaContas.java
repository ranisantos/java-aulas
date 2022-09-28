package exercicioPOO.data;

import exercicioPOO.modelo.Conta;
import exercicioPOO.util.NumberGenerator;

import java.util.HashMap;
import java.util.Map;

public class GenreciaContas {
    private Map<Integer, Conta> contas;
    NumberGenerator numberGenerator;

    public GenreciaContas() {
        contas = new HashMap<>();
        //numberGenerator = NumberGenerator().getInstance();
    }
}
