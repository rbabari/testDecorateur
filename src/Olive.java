/**
 * Decorateur concret ...
 */
public class Olive extends Ingredient{
    public Olive(Plat plat) {
    this.sur = plat;
    }
    public double getExtra(){
        return 2.00 ;
    }

    @Override
    public double getPrix() {
        return sur.getPrix() + this.getExtra();
    }
}
