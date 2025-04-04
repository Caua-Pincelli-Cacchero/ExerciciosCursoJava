import java.awt.Dimension;
import java.awt.Toolkit;

public class Exercicio3 {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension resolucao = t.getScreenSize();
        System.out.println("A resolução da tela é " + resolucao);
    }
}
