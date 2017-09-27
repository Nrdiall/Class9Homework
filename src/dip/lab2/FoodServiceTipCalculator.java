package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private ServiceQuality quality;
    private double billAmt;
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        setBillAmt(billAmt);
        setQuality(q);
    }

    @Override
    public double getTip() {
        double tipPercent = 0;
        switch(quality){
             case POOR:
                tipPercent = .05;
                break;
            case FAIR:
                tipPercent = .1;
                break;
            case GOOD:
                tipPercent = .2;
                break;
        }
        return billAmt * tipPercent;
    }

    public final double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        if(billAmt<MIN_BILL){
            throw new IllegalArgumentException("Bill amount can't be less than 0.");
        }
        this.billAmt = billAmt;
    }

    public final ServiceQuality getQuality() {
        return quality;
    }

    public final void setQuality(ServiceQuality quality) {
        this.quality = quality;
    }
}
