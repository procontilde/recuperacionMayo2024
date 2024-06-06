package trimestre3;

import java.util.List;

public class Sensor {

        private int type;
        private int num;
        private List<Campo> fields;

        // Constructor, getters y setters

        // CRUD de Campo
        public void agregarCampo(Campo campo) {
            if (campo != null && !existeCampo(campo.getName())) {
                fields.add(campo);
            }
        }

        public void borrarCampo(String nombreCampo) {
            fields.removeIf(campo -> campo.getName().equals(nombreCampo));
        }

        private boolean existeCampo(String nombreCampo) {
            for (Campo campo : fields) {
                if (campo.getName().equals(nombreCampo)) {
                    return true;
                }
            }
            return false;
        }


}
