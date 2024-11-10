public class Pion extends Piesa {

    public Pion(int coordX, int coordY, String color){
        super("P", coordX, coordY, color);
    }

    public void mutareValida(TablaSah myTabla, Piesa p, int i, int j){
        int pozX = p.getCoordX();
        int pozY = p.getCoordY();
        String element = myTabla.getElement(i,j);
        String currentElement = myTabla.getElement(pozX,pozY);

        if(i >= 0 && i < 8 && j >= 0 && j < 8){
            if(element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))){
                if(i - pozX == 1 && pozY == j){
                    p.setCoordX(i);
                    myTabla.setSpace("_", pozX, pozY);
                    myTabla.setElement(p);
                }else{
                    System.out.println("Mutare invalida");
                }
            }else{
                System.out.println("Casuta e ocupata");
            }
        }else{
            System.out.println("Mutare invalida");
        }
    }
}
