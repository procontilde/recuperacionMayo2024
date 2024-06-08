package trimestre3;

public class Campo {

        private String name, unit;
        private int decPrecision;

    public Campo(String name, String unit, int decPrecision) {

        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;

    }

    public String getName() { return name; }
    public String getUnit() { return unit; }
    public int getDecPrecision() { return decPrecision; }

    public void setName(String name) { this.name = name; }
    public void setUnit(String unit) { this.unit = unit; }
    public void setDecPrecision(int decPrecision) { this.decPrecision = decPrecision; }

}
