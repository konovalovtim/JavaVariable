import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
        ArrayList <String> carModels = new ArrayList ();
        carModels.add("m2");
        carModels.add("m4");
        carModels.add("m8");
        carModels.add("m240");
        carModels.add(3, "m6");
        carModels.add(0,"1m");
        carModels.add(2, "750");
        carModels.remove(3);
        carModels.remove(0);
        carModels.remove(1);

        System.out.println(carModels.size());
        System.out.println(carModels);
    }
}
