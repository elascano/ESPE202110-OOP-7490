package ec.edu.espe.model;

/**
 *
 * @author Leonel.M
 */
public class ArrayList {
    private java.util.ArrayList<Integer> datasOrdenated = new java.util.ArrayList<Integer>();
    private int tam;
    private java.util.ArrayList<String> datasNoOrdenated = new java.util.ArrayList<String>();
    private String algorithm;

    public ArrayList(java.util.ArrayList<String> datasNoOrdenated,int tam,java.util.ArrayList<Integer> datasOrdenated,String algorithm) {
        this.tam = tam;
        this.algorithm = algorithm;
        this.datasOrdenated = datasOrdenated;
        this.datasNoOrdenated = datasNoOrdenated;
    }

    public java.util.ArrayList<Integer> getDatasOrdenated() {
        return datasOrdenated;
    }

    public void setDatasOrdenated(java.util.ArrayList<Integer> datasOrdenated) {
        this.datasOrdenated = datasOrdenated;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public java.util.ArrayList<String> getDatasNoOrdenated() {
        return datasNoOrdenated;
    }

    public void setDatasNoOrdenated(java.util.ArrayList<String> datasNoOrdenated) {
        this.datasNoOrdenated = datasNoOrdenated;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return "Unsorted"+datasNoOrdenated+"Size"+tam +"Sort algorithm"+datasOrdenated+"Algorithm"+algorithm;
    }
    
}
