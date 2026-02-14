import java.util.ArrayList;
import java.util.Arrays;

public class MultiVariable{
    protected ArrayList<Variable> variables = new ArrayList<>();
    private double coefficient = 1;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Double> powers = new ArrayList<>();
    public MultiVariable(Variable...var){
        for(Variable variable:var){
            variables.add(variable);
            coefficient*=variable.coefficient;
            if(!names.contains(variable.name)){
                names.add(variable.name);
                powers.add(variable.power);
            }
            else{
                int index = names.indexOf(variable.name);
                powers.set(index,powers.get(index)+variable.power);
            }
        }

    }
    static String toSuperscript(double n) {
        String normal = Double.toString(n);

        return normal
                .replace("-", "⁻")
                .replace("0", "⁰")
                .replace("1", "¹")
                .replace("2", "²")
                .replace("3", "³")
                .replace("4", "⁴")
                .replace("5", "⁵")
                .replace("6", "⁶")
                .replace("7", "⁷")
                .replace("8", "⁸")
                .replace(".","·")
                .replace("9", "⁹");

    }

    public void addVariable(Variable var){
        variables.add(var);
    }


    public String toString(){
        String toReturn = "";
        toReturn+=coefficient;
        for(String name:names){
            int index = names.indexOf(name);
            toReturn += name+"^"+toSuperscript(powers.get(index));
        }

        return toReturn;
    }
    public void derive(){
        ArrayList<Variable> tempVar = variables;
        ArrayList<String> toAddTo = new ArrayList<>();
        MultiVariable toAdd = new MultiVariable();
        int uses = 0;
        for(Variable var: tempVar){
            var.derive();
            toAdd.addVariable(var);
             uses++;
        }
    }

}