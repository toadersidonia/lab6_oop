public class Nebun extends Piesa{

    public Nebun(int pozX, int pozY, String color){
        super("N", pozX, pozY, color);
    }

    /*public void mutareValida(TablaSah myTabla, Piesa p, int i, int j){
        if(i >= 0 && i < 8 && j >= 0 && j < 8){
            int pozXAux = p.getCoordX();
            int pozYAux = p.getCoordY();

            int pozX = p.getCoordX();
            int pozY = p.getCoordY();
            String element = myTabla.getElement(i,j);
            String currentElement = myTabla.getElement(pozX, pozY);

            //presupunem ca nebunul poate merge doar inainte si ca nu se poate intoarce
            if(element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))){ //daca pe pozitia unde vrem sa ajungem nu e niciun element
                pozX++;
                pozY++;
                while(pozX < i && pozY < j && myTabla.getElement(pozX, pozY).equals("_")){
                    pozX++;
                    pozY++;
                }
                if(pozX == i && pozY == j){
                    p.setCoordX(i);
                    p.setCoordY(j);
                    myTabla.setElement(p);
                    myTabla.setSpace("_", pozXAux, pozYAux);
                }else{
                    System.out.println("Am inatlanit un obscatol pe drum");
                }
            }else{
                System.out.println("Casuta ocupata");
            }
        }else{
            System.out.println("Mutare invalida");
        }
    }*/

    public void mutareValida(TablaSah myTabla, Piesa p, int i, int j) {
        int[] dx = {-1, 1, 1, -1};
        int[] dy = {-1, -1, 1, 1};
        //x - pe linii
        //y - pe coloane
        //(-1, -1) - stanga sus: dx = -1 duce piesa in sus, dy = -1 duce piesa in stanga
        //(1, -1) - stanga jos
        //(1, 1) - dreapta jos
        //((-1, 1) - dreapta sus

        int pozX = p.getCoordX();
        int pozY = p.getCoordY();

        int pozXAux = pozX;
        int pozYAux = pozY;

        String element = myTabla.getElement(i,j);
        String currentElement = myTabla.getElement(pozX, pozY);

        if (element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))) { //daca pe pozitia unde vrem sa ajungem nu e niciun element

            for (int d = 0; d < 4; d++) {
                pozX = p.getCoordX();
                pozY = p.getCoordY();

                while (true) {
                    pozX += dx[d];
                    pozY += dy[d];

                    if (pozX == i && pozY == j) {
                        p.setCoordX(i);
                        p.setCoordY(j);
                        myTabla.setElement(p);
                        myTabla.setSpace("_", pozXAux, pozYAux);
                        return;
                    }

                    if (pozX < 0 || pozX >= 8 || pozY < 0 || pozY >= 8 || !myTabla.getElement(pozX, pozY).equals("_")) {
                        break;
                    }
                }
            }
        }else{
            System.out.println("Mutare invalida");
        }
    }
}
