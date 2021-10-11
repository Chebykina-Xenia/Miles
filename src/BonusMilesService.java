public class BonusMilesService {
    public int calculate(int ticket_price) {
        int bonus = 20;          //рублей за 1 милю
        //Расчитываем мили
        int miles = ticket_price / bonus;
        return miles;
    }
}
