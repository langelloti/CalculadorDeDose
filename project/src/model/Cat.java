package model;

public class Cat extends Animal{

    public Cat(Integer age, Double weight) {
        super(age, weight);
    }
    public Cat() {
        super(null, null);
    }

    @Override
    public Double calculateDose(Medicamento medicamento) {
        if(getWeight() <= 0)throw new IllegalArgumentException("O peso do animal deve ser maior que zero.");
        if(medicamento.getDosePerKg() <= 0)throw new IllegalArgumentException("A dose por kilograma do medicamento deve ser maior que zero.");
        return getWeight() * medicamento.getDosePerKg();
    }

}
