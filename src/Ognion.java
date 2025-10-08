/**
 * Decorateur concret ...
 */
public class Ognion extends Ingredient{
    public Ognion(Plat plat) {
    this.sur = plat;
    }
    public double getExtra(){
        return 3.00 ;
    }

    @Override
    public double getPrix() {
        return sur.getPrix() + this.getExtra();
    }
}
