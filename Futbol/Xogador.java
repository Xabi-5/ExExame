abstract class Xogador{

    //Attributes
    private String nome;
    private String apelidos;
    private int idade;
    private int dorsal;
    private int numGoles;
    private int salario;

    //Getters
    public String getNome() {
        return nome;
    }
    public String getApelidos() {
        return apelidos;
    }
    public int getIdade() {
        return idade;
    }
    public int getDorsal() {
        return dorsal;
    }
    public int getNumGoles() {
        return numGoles;
    }
    public int getSalario() {
        return salario;
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    


    
}