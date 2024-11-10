public class TablaSah {
    private static final int NR_COLOANE = 8;
    private static final int NR_LINII = 8;
    private String[][] mat;

    public TablaSah() {
        mat = new String[NR_LINII][NR_COLOANE];
        for (int i = 0; i < NR_LINII; i++) {
            for (int j = 0; j < NR_COLOANE; j++) {
                mat[i][j] = "_";
            }
        }
    }

    public String getElement(int i, int j){
        return mat[i][j];
    }

    public void setElement(Piesa piesa){
        int x = piesa.getCoordX();
        int y = piesa.getCoordY();
        mat[x][y] = piesa.getNumePiesa();
    }

    public void setSpace(String s, int x, int y){
        mat[x][y] = s;
    }

    public void afisareTabla(){
        System.out.print("   ");
        for(int i = 1; i < NR_COLOANE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < NR_LINII; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < NR_COLOANE; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
