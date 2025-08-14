package model;

public class Medicamento {
    private String name;
    private Double dosePerKg;
    private String unity;

    public Medicamento(String name, Double dosePerKg, String unity) {
        this.name = name;
        this.dosePerKg = dosePerKg;
        this.unity = unity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDosePerKg() {
        return dosePerKg;
    }

    public void setDosePerKg(Double dosePerKg) {
        this.dosePerKg = dosePerKg;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }
}
