
public class Cottage extends House {
    public Cottage(int length, int price, int width, String brigadir ) {
        this.length =length;
        this.width = width;
        this.price = price;
        this.brigadir = brigadir;
    }

    @Override
    protected void Construction() {
        if (square>200)
            price = square * 1075;
        else
            price = square * 585;


    }

    @Override
    protected boolean isFinished() {
        if ((brigadir.equals("Tolya") || brigadir.equals("Petya")) && price >500000)
            return true;
        else
            return false;
    }
}
