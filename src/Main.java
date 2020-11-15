import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        elev elev1 = new elev("Ion", "Popescu", 17, "a XI-a I");
        elev elev2 = new elev("Andeea", "Georgescu", 18, "a XII-a J");
        elev elev3 = new elev("Gabi", "Stoica", 18, "a XII-a J");

        elev1.print_info();
        elev2.print_info();
        elev3.print_info();

        ArrayList<elev> lista_elevi = new ArrayList<elev>();
        lista_elevi.add(elev1);
        lista_elevi.add(elev2);
        lista_elevi.add(elev3);


    }
}
