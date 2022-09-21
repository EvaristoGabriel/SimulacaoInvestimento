package brufjfdcc025.empresa;

/*
    Gabriel Evaristo Carlos
    201965034AB
*/

public abstract class Investimento implements Rendimento{

    private String titulo;
    private float valor;
    private Data d;
    
    @Override
    public abstract float CalculaRendimento(Data d);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Data getD() {
        return d;
    }

    public void setD(Data d) {
        this.d = d;
    }
    
    
}
