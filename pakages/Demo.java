import pakages.tools.AdvCalc;
import pakages.tools.Calc;

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj.sum(10, 20));
        System.out.println(obj1.mul(10, 20));
    }
}
