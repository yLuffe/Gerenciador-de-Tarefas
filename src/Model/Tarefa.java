package Model;

public class Tarefa {

    // Definindo Tarefa
    private int UUID;
    private String nome;
    private String descricao;

    // Construtores
    public Tarefa() {
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters and Setters
    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome
                + "\n\nDescrição:\n" + descricao;
    }

}
