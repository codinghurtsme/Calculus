public class Variable{
    private String name;
    private double coefficient;
    private double power;

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
