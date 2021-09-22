package br.com.estudos.enumerator;

public enum Cargo {

    VENDEDOR(1.02),
    GERENTE(1.05);

    public double bonus;

    Cargo(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

}
