public class XogadorCampo extends Xogador {
    enum posicion {DIANTEIRO, MEDIO, DEFENSA};

    public void Marcar(int goles){
        setNumGoles(getNumGoles()+goles);
        setSalario(getSalario()+50000);
    }
    
}
