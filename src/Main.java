public class Main {
    public static void main(String[] args) {

        
        int priceTicket = 30_000; // стоимость билета
        int bonusMiles = 20; // количество рублей для одной бонусной мили


     
        int miles = priceTicket / bonusMiles; //расчет количества бонусных миль
        System.out.println("количество бонусных миль=" + miles);
    }

}
