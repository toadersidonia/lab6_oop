public class Tura extends Piesa{
    public Tura(int coordX, int coordY, String color){
        super("T", coordX, coordY, color);
    }

    public void mutareValida(TablaSah myTabla, Piesa p, int i, int j) {
        int pozX = p.getCoordX();
        int pozY = p.getCoordY();

        int pozXAux = pozX;
        int pozYAux = pozY;

        String element = myTabla.getElement(i, j);
        String currentElement = myTabla.getElement(pozX, pozY);

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        //dx = 0 => ramane pe aceeasi linie, dy = 1 => dreapta
        //(1, 0) - jos
        //(-1, 0) - sus
        //(0, 1) - dreapta
        //(0, -1) - stanga

        if (element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))) {
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

                    if(pozX < 0 || pozX >= 8 || pozY < 0 || pozY >= 8 || !myTabla.getElement(pozX, pozY).equals("_")) {
                        break;
                    }
                }
            }

        } else {
            System.out.println("Mutare invalida");
        }
    }
}
