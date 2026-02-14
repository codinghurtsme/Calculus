import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Variable var = new Variable();
        Variable var1 = new Variable("y",10,-5);
        var.multiply(-10);
        var.raiseTo(5);
        System.out.println(var.toString());
        MultiVariable var2 = new MultiVariable(var,var1);
        System.out.println(var2.toString());

    }
}
