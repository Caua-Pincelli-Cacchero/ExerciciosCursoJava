import java.util.Date;

public class Exercicio1 {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hoje é dia " + relogio.getDay() + " do mês " + relogio.getMonth()
        + " são " + relogio.getHours() + ":" + relogio.getMinutes());
    }    
}
