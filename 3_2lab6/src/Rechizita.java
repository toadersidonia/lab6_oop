public abstract class Rechizita {
    String eticheta;
    //nu o putem instania, nu putem avea un obiect de tip rechizita, e o notiune abstracta, e manual dsau caiet
    public Rechizita(String eticheta){
        this.eticheta = eticheta;
    }
    public abstract String getNume();
}
