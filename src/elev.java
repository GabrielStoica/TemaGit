public class elev {

    private String nume;
    private String prenume;
    private int varsta;
    private String clasa;

    public elev(String nume, String prenume, int varsta, String clasa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.clasa = clasa;
    }

    public void print_info()
    {
        System.out.println("Elevul " + nume + prenume + " are " + varsta + " ani " + " clasa " + clasa);
    }
}
