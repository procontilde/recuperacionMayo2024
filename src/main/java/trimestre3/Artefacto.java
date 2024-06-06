package trimestre3;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Artefacto {

    private String artifact;
    private String architecture;
    private int productID;
    private List<Sensor> sensors;

    public Artefacto(String artifact, String architecture, int productID) {

        this.artifact = artifact;
        this.architecture = architecture;
        this.productID = productID;

    }

    public static Artefacto cargarDesdeJSON(String nombreArchivo) throws IOException {

        Gson gson = new GsonBuilder().create();
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

        return gson.fromJson(br, Artefacto.class);

    }

    public String getArtifact() { return artifact; }
    public String getArchitecture() { return architecture; }
    public int getProductID() { return productID; }
    public List<Sensor> getSensors() { return sensors; }

    public void setArtifact(String artifact) { this.artifact = artifact; }
    public void setArchitecture(String architecture) { this.architecture = architecture; }
    public void setProductID(int productID) { this.productID = productID; }

}
