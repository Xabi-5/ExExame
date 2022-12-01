public class Porteiro extends Xogador{
    private int numParadas;
    private int golesEncaixados;

    //Getters
    public int getNumParadas() {
        return numParadas;
    }
    public int getGolesEncaixados() {
        return golesEncaixados;
    }

    //Setters
    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }
    public void setGolesEncaixados(int golesEncaixados) {
        this.golesEncaixados = golesEncaixados;
    }

    //Methods
    public void Marcar(int goles){
        setNumGoles(getNumGoles()+goles);
    }
    
}
