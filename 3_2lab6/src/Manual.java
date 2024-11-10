public class Manual extends Rechizita {
    public Manual(String nume){
        super(nume); //apelam construtorul din clasa parinte
    }
    public String getNume() {
        return "Manual " + eticheta;
    }
}
