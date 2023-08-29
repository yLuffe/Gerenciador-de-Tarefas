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

    public void validate() throws IllegalArgumentException {

        // Valida se nome e descrição não são nulos ou vazios
        if (this.nome == null || this.nome.isEmpty()) {
            throw new IllegalArgumentException("Oops! Nome da tarefa em branco? Defina um nome para sua tarefa!");
        }

        if (this.descricao == null || this.descricao.isEmpty()) {
            throw new IllegalArgumentException("Eita, parece que alguém esqueceu a descrição. O campo descrição não pode estar vazio! ");
        }

        // Pega a primeira letra de cada palavra e deixa em caixa alta
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : this.nome.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true; // Próximo caractere será capitalizado
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        // Definindo a caixa alta para nome e descrição
        this.nome = result.toString();
        this.descricao = this.descricao.substring(0, 1).toUpperCase() + this.descricao.substring(1);
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + " ID: " + id
                + "\n\nDescrição:\n" + descricao;
    }

}
