import javax.xml.parsers.SAXParser;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        int cenaTicket = 30_000;
        int bonusMila = 20;


        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int mila = cenaTicket / bonusMila;
        System.out.println(mila);
    }

}
