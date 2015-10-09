package pd.ecp1.calculadoraMemento;

import upm.jbb.IO;

public class UndoCommand extends Operation {

    private GestorMementos<MementoCalculadora> gestorMementos;

    public UndoCommand(CalculatorMementable calculator, GestorMementos<MementoCalculadora> gestorMementos) {
        super(calculator);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        String key = (String) IO.getIO().select(gestorMementos.keys());
        calculator.restoreMemento(gestorMementos.getMemento(key));
    }
}
