public class Main {
    public static void main(String[] args){

        int pricePerTicket = 125; // Цена за билет
        int costPerMile = 20; // Количество рублей для одной бонусной мили
        int countOfMiles; // Количество бонусных миль

        countOfMiles = pricePerTicket/costPerMile; // Рассчитывает количество бонусных миль

        System.out.println(countOfMiles + " бонусных миль"); //Вывод результата на экран
    }
}
