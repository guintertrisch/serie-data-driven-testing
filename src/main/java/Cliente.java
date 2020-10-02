public class Cliente {
    private String nome;
    private String tipo_pessoa;
    private String idade;

    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    private String nomeCenario;

    public Cliente(String nome, String tipo_pessoa, String idade, String nomeCenario) {
        this.nome = nome;
        this.tipo_pessoa = tipo_pessoa;
        this.idade = idade;
        this.nomeCenario = nomeCenario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


}
