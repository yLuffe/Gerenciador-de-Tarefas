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


    public void validate() throws Exception{
        if (this.nome.isEmpty() || this.nome == null) {
            throw new Exception("Oops! Nome da tarefa em branco? Defina um nome para sua tarefa!");
        }

        if (this.descricao.isEmpty() || this.descricao == null) {
            throw new Exception("Eita, parece que alguém esqueceu a descrição. O campo descrição não pode estar vazio! ");
        }

    }
    @Override
    public String toString() {
        return "Tarefa: " + nome + " ID: " + id
                + "\n\nDescrição:\n" + descricao;
    }

}
