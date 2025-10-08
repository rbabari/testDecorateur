/**
 * Decorateur concret ...
 */
public class Oeuf extends Ingredient{
    public Oeuf(Plat plat) {
    this.sur = plat;
    }
    public double getExtra(){
        return 1.00 ;
    }

    @Override
    public double getPrix() {
        return sur.getPrix() + this.getExtra();
    }
}
