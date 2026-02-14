import java.util.ArrayList;

public class Expression{
    protected ArrayList<Variable> variables = new ArrayList<>();

    public Expression(Variable...var){
        for(Variable variable:var){
            variables.add(variable);
        }
    }
    public void addVariable(Variable var){
        variables.add(var);
    }


    public String toString(){
        String toReturn = "";
        int uses = 0;
        String posOrNeg = " + ";
        for(Variable var:variables){
            if(Math.signum(var.coefficient)==-1) posOrNeg=" - ";
            else posOrNeg=" + ";
            if(uses!=0)toReturn+=posOrNeg;
            if(uses==0)toReturn += var.coefficient+var.name+"^"+var.power;
            else toReturn += Math.abs(var.coefficient)+var.name+"^"+var.power;
            uses++;
        }
        return toReturn;
    }


}