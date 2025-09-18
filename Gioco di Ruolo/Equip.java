public class Equip {
    
    private String nome;
    private int peso;
    private TipoEquip tipo;


    public Equip(String nome, int peso, TipoEquip tipo) {
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public TipoEquip getTipo() {
        return tipo;
    }
    public void setTipo(TipoEquip tipo) {
        this.tipo = tipo;
    }

    
}
