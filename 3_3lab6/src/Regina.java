public class Regina extends Piesa{

    public Regina(int pozX, int pozY, String color){
        super("R", pozX, pozY, color);
    }

    public void mutareValida(TablaSah myTabla, Piesa p, int i, int j) {
        int[] dx = {-1, 1, 1, -1, 1, -1, 0, 0};
        int[] dy = {-1, -1, 1, 1, 0, 0, 1, -1}; //toate mutarile de la nebun + tura

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
