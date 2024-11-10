public class Ghiozdan {
    Rechizita[] rechizite = new Rechizita[10];
    private int nrRechizite = 0;

    public void addRechizita(Rechizita r)
    {
        rechizite[nrRechizite] = r;
        nrRechizite++;
    }
    public void listItems(){
        for(int i = 0 ; i < nrRechizite; i++){
            System.out.println(rechizite[i].getNume() + " ");
        }
    }

    public void listManual(){
        for(int i = 0 ; i < nrRechizite; i++){
            if(rechizite[i] instanceof Manual){ //VERIFICAM DACA E INSTANTA MANUAL
                System.out.println(rechizite[i].getNume() + " ");
            }
        }
    }

    public void listCaiet(){
        for(int i = 0 ; i < nrRechizite; i++){
            if(rechizite[i] instanceof Caiet){ //VERIFICAM DACA E INSTANTA MANUAL
                System.out.println(rechizite[i].getNume() + " ");
            }
        }
    }

    public int getNrRechizite(){
        return nrRechizite;
    }

    public int getNrCaiete(){
        int nrCaiete = 0;
        for(int i = 0; i < nrRechizite; i++){
            if(rechizite[i] instanceof Caiet){
                nrCaiete++;
            }
        }
        return nrCaiete;
    }

    public int getNrManuale(){
        int nrManuale = 0;
        for(int i = 0; i < nrRechizite; i++){
            if(rechizite[i] instanceof Manual){
                nrManuale++;
            }
        }
        return nrManuale;
    }
}
