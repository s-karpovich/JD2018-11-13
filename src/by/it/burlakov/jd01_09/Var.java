package by.it.burlakov.jd01_09;

/**
 * Created by user on 27.11.2018.
 */
abstract class Var implements Operation {
    @Override
    public Var sub(Var other) {
        System.out.println("Вычитание " + this + " - " + other + " невозможно!");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Умнажение " + this + " * " + other + " невозможно!");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Деление " + this + " / " + other + " невозможно!");
        return null;
    }

    @Override
    public Var add(Var other) {
        System.out.println("Сложение " + this + " + " + other + " невозможно!");
        return null;
    }

    static Var createVar(String operand) {

        if(operand.matches(Patterns.SCALAR)){
            return new Scalar(operand);
        }
        if(operand.matches(Patterns.VECTOR)){
            return new Vector(operand);
        }
        if(operand.matches(Patterns.MATRIX)){
            return new Matrix(operand);
        }

        return null;
    }
}
