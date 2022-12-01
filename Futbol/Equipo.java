public class Equipo {

    private String nome;
    public Xogador[] xogadores;
    private static final int DEFAULT_SIZE = 22;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void xogadores() {
        xogadores = new Xogador[DEFAULT_SIZE];
    }

    public void xogadores(String nome) {
        this.nome = nome;
        xogadores = new Xogador[DEFAULT_SIZE];
    }

    public void xogadores(String nome, int num) {
        this.nome = nome;
        xogadores = new Xogador[num];
    }

    public boolean fichar(Porteiro player) {
        for (Xogador xog : xogadores) {
            if (xog == null) {
                xog = player;
                return true;
            }
        }
        System.out.println("Non hai suficientes espazos libres no equipo");
        return false;
    }

    public boolean fichar(XogadorCampo player) {
        for (Xogador xog : xogadores) {
            if (xog == null) {
                xog = player;
                return true;
            }
        }
        System.out.println("Non hai suficientes espazos libres no equipo");
        return false;
    }

    public boolean venderXogador(Xogador player) {
        for (Xogador xog : xogadores) {
            if (xog.equals(player)) {
                xog = null;
                return true;
            }
        }
        System.out.println("Non se atopa o xogador indicado");
        return false;
    }

    public boolean venderXogador(int index) {
        if (index >= 0 && index < xogadores.length) {
            xogadores[index] = null;
            return true;
        } else {
            System.out.println("Non se atopa o xogador indicado");
            return false;
        }
    }

}
