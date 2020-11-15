import java.util.ArrayList;
import java.util.Collections;

public class Scoala {

    private String nume;
    private String adresa;
    private String tip;
    private ArrayList<Elev> elevi_gimnaziu;

    public Scoala(String nume, String adresa, String tip, ArrayList<Elev> elevi_gimnaziu) {
        this.nume = nume;
        this.adresa = adresa;
        this.tip = tip;
        this.elevi_gimnaziu = elevi_gimnaziu;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.nume + " cu adresa " + this.adresa + " are urmatorii elevi: ");

        for(Elev e:elevi_gimnaziu){
            builder.append(e);
            builder.append("\n");

            return builder.toString();
        }
    }


}


