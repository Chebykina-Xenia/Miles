public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int ticket_price = 5_862; //стоимость билета
        int miles = service.calculate(ticket_price);

        System.out.println(miles);
    }
}
