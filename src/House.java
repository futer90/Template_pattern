public abstract class House {
    int length;
    int width;
    int square;
    int price;
    String workers;
    String brigadir;

    protected int Square( int length, int width){
        square = length * width;
        return square;
    }
    protected abstract void Construction() ;

    protected abstract boolean isFinished();

    public final void playOneGame(int playersAmount){
        setHouseSquare(length, width);

        Construction();

        isFinished();
    }

    public void setHouseSquare(int length, int width){
        this.square = length * width;
    }

}

