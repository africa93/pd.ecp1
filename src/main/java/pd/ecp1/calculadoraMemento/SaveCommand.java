package pd.ecp1.calculadoraMemento;

import upm.jbb.IO;

public class SaveCommand extends Operation {

    private GestorMementos<MementoCalculadora> gestorMementos;

    public SaveCommand(CalculatorMementable calculator, GestorMementos<MementoCalculadora> gestorMementos) {
        super(calculator);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public String name() {
        return "Guardar";
    }

    @Override
    public void execute() {
        String nombre = IO.getIO().readString();
        gestorMementos.addMemento(nombre, calculator.createMemento());
    }

}
