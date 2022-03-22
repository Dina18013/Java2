public class Main {
    public static void main(String[] args) {

        
        int cenaTicket = 30_000; // стоимость билета
        int bonusMila = 20; // количество рублей для одной бонусной мили


     
        int mila = cenaTicket / bonusMila; //расчет количества бонусных миль
        System.out.println("количество бонусных миль=" + mila);
    }

}
