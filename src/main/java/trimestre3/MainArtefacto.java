package trimestre3;

import java.io.IOException;

public class MainArtefacto {

    public static void main(String[] args) {

        try {

            Artefacto artefacto = Artefacto.cargarDesdeJSON("ejemplo.json");
            Campo nuevoCampo = new Campo("New Field", "N/A", 0);

            for (Sensor sensor : artefacto.getSensors()) {

                sensor.agregarCampo(nuevoCampo);
                sensor.borrarCampo("Temperature");

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
