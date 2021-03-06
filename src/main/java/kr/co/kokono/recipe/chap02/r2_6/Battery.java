package kr.co.kokono.recipe.chap02.r2_6;

public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price, double discount) {
        super(name, price, discount);
    }

    public boolean getRechargeable() {
        return rechargeable;
    }


    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
