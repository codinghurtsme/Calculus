public class Variable{
    protected String name;
    protected double coefficient;
    protected double power;

    public Variable(String name, double power, double coefficient){
        this.name = name;
        this.power = power;
        this.coefficient = coefficient;
    }
    public Variable(){
        name = "x";
        power = 1;
        coefficient = 1;
    }
    public Variable(String name){
        this.name = name;
        power = 1;
        coefficient = 1;
    }
    public double solveFor(double value){
        return coefficient * Math.pow(value,power);
    }
    public void multiply(double value){
        coefficient*=value;
    }
    public void raiseTo(double power){
        this.power*=power;
    }

    public MultiVariable multiplyVariable(Variable var){
        double coefficient=var.coefficient*this.coefficient;
        double power;
        String name;
        if(var.name.equals(this.name)){
            name = this.name;
            power = this.power + var.power;
            Variable varToReturn = new Variable(name,power,coefficient);
            return new MultiVariable(varToReturn);
        }
        else{
            return new MultiVariable(var,this);
        }
    }
    public void derive(){
        coefficient*=power;
        power--;
    }
    public void integrate(){
        power++;
        coefficient/=power;
    }
    public String toString(){

        return coefficient+name+"^"+power;
    }
}
