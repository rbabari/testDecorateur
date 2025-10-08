/**
 * Decorateur concret ...
 */
public class Formage extends Ingredient{
    public Formage(Plat plat) {
    this.sur = plat;
    }
    public double getExtra(){
        return 4.00 ;
    }

    @Override
    public double getPrix() {
        return sur.getPrix() + this.getExtra();
    }
}
