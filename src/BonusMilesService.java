public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonus = 20;          //рублей за 1 милю
        //Расчитываем мили
        int miles = ticketPrice / bonus;
        return miles;
    }
}
