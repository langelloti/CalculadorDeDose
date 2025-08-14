package model;

abstract class Animal {

    private Integer age;
    private Double weight;

    public Animal(Integer age, Double weight) {
        this.age = age;
        this.weight = weight;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public abstract Double calculateDose(Medicamento medicamento);
}
