/**
 * Created by urijkunicyn on 08/01/2020.
 */
public class Izba extends House {
    public Izba(int length, int price, int width, String brigadir ) {
        this.length =length;
        this.width = width;
        this.price = price;
        this.brigadir = brigadir;
    }


    @Override
    protected void Construction() {
        if (square>100)
            price = square * 695;
        else
            price = square * 315;
    }

    @Override
    protected boolean isFinished() {
            if (brigadir.equals("Tolya") || brigadir.equals("Petya")  && price <500000)
                return true;
            else
                return false;
        }
}

