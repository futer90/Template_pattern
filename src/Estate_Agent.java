import java.util.Scanner;

public class Estate_Agent {
    public static void main(String[] args) {
        final HouseCode houseCode = HouseCode.COTTAGE;
        House house;
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        int price = in.nextInt();
        String brigadir =in.next();
        switch (houseCode){
            case COTTAGE :
                house = new Cottage(length, width, price, brigadir );
                break;
            case IZBA :
                house = new Izba(length, width, price, brigadir );
                break;
            default :
                throw new IllegalStateException();
        }
    }
}
