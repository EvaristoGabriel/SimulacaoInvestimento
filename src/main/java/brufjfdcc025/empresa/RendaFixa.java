package brufjfdcc025.empresa;

/*
    Gabriel Evaristo Carlos
    201965034AB
*/

public class RendaFixa extends Investimento{

    public RendaFixa(String titulo, float valor, Data d) {
        this.setTitulo(titulo);
        this.setValor(valor);
        this.setD(d);
    }

    @Override
    public float CalculaRendimento(Data d) {
        // Só vai entrar no if se os valores de ano e mes forem menores
        //que o da data solicitada
        if(this.getD().getAno() <= d.getAno() && this.getD().getMes() <= d.getMes()){
            int meses = this.getD().Diferenca(d);
            float rendimento = 0f;
            if(meses >= 1){
                rendimento = (meses * 0.005f)*this.getValor();
            }
            return rendimento;
        }
        //Se não entrar no if, quer dizer que a data é maior que a data final
        else
            return 0.0f;
    }
    
}
