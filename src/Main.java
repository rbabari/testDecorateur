//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Main (Client)
 */
public class Main {
    public static void main(String[] args) {

        Plat p1 = new Ognion(new Pizza_de_Base());

        Plat p2 = new Ognion(new Olive(new Oeuf(new Pizza_de_Base())));

        Plat p3 = new Ognion(p2);
        }
    }
