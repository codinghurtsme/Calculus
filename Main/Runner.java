import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Variable var = new Variable();
        var.multiply(10);
        var.raiseTo(5);
        System.out.println(var.toString());
        Variable[] vars = {var};
        System.out.println(Arrays.toString(vars));
        MultiVariable var2 = new MultiVariable(vars);
        System.out.println(var2.toString());

    }
}
