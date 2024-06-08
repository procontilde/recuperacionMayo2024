package trimestre3;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private int type, num;
    private List<Campo> fields;

    public Sensor() {
        type = 0;
        num = 0;
        fields = new ArrayList<>();
    }

    public void agregarCampo(Campo campo) {

        if (campo != null && !existeCampo(campo.getName())) fields.add(campo);

    }

    public void borrarCampo(String nombreCampo) {

        for (int i = 0; i < fields.size(); i++) {

            if (fields.get(i).getName().equals(nombreCampo)) {

                fields.remove(i);
                break;

            }

        }

    }

    private boolean existeCampo(String nombreCampo) {

        for (Campo campo : fields) if (campo.getName().equals(nombreCampo)) return true;

        return false;

    }

}
