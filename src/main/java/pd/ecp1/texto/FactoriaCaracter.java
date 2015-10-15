package pd.ecp1.texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private static FactoriaCaracter factoria = new FactoriaCaracter();

    private Map<Character, Caracter> map;

    private FactoriaCaracter() {
        map = new HashMap<Character, Caracter>();
    }

    public Caracter get(char key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Caracter caracter = new Caracter(key);
            map.put(key, caracter);
            return caracter;
        }
    }

    public static FactoriaCaracter getFactoria() {
        return factoria;
    }

}
