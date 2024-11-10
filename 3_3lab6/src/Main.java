//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TablaSah t = new TablaSah();
        Pion p1 = new Pion(1,0, "Black"); //litera mare
        Pion p2 = new Pion(6, 6, "White");
        Nebun n1 = new Nebun(2, 2, "White"); //litera mica
        Tura t1 = new Tura(7, 7 , "Black");
        Regina r1 = new Regina(1, 4, "White");

        t.setElement(r1);
        t.setElement(t1);
        t.setElement(p1);
        t.setElement(p2);
        t.setElement(n1);
        t.afisareTabla();
        System.out.println();
        p1.mutareValida(t, p1,2, 0);
        t.afisareTabla();
        System.out.println();

        n1.mutareValida(t, n1, 5, 5);
        t1.mutareValida(t, t1, 3, 7);
        t.afisareTabla();
        n1.mutareValida(t, n1, 7, 3);
        t.afisareTabla();
        System.out.println();

        r1.mutareValida(t, r1, 3, 2);
        t.afisareTabla();
    }
}