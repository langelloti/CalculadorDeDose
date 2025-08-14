package model;

public class Cat extends Animal{

    public Cat(Integer age, Double weight) {
        super(age, weight);
    }

    @Override
    public Double calculateDose(Medicamento medicamento) {
        return getWeight() * medicamento.getDosePerKg();
    }

}
