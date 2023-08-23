package Model;

public class Tarefa {

    // Definindo Tarefa
    private int id;
    private String nome;
    private String descricao;

    // Construtores
    public Tarefa() {
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Tarefa(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Tarefa: " + nome + " ID: " + id
                + "\n\nDescrição:\n" + descricao;
    }

}
