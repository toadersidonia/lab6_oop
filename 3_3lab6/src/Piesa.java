public abstract class Piesa {
    private String numePiesa;
    private int coordX;
    private int coordY;
    private String color;

    public Piesa(){
        numePiesa = "";
        coordX = 0;
        coordY = 0;
        color = "";
    }

    public Piesa(String numePiesa, int coordX, int coordY, String color){
        if(color.equals("Black")){
            this.numePiesa = numePiesa;
        }else{
            this.numePiesa = numePiesa.toLowerCase();
        }
        this.coordX = coordX;
        this.coordY = coordY;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getNumePiesa(){
        return numePiesa;
    }

    public int getCoordX(){
        return coordX;
    }

    public int getCoordY(){
        return coordY;
    }

    public void setCoordX(int coordX){
        this.coordX = coordX;
    }

    public void setCoordY(int coordY){
        this.coordY = coordY;
    }

    public abstract void mutareValida(TablaSah myTabla, Piesa p, int new_coordX, int new_coordY);

}
