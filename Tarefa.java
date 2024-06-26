public class Tarefa {
    private String nome;
    private boolean completa;

    public Tarefa(String nome) {
        this.nome = nome;
        this.completa = false; // Por padrão, a tarefa inicia como não completa
    }

    public String getNome() {
        return nome;
    }

    public boolean estaCompleta() {
        return completa;
    }

    public void marcarComoCompleta() {
        completa = true;
    }

    @Override
    public String toString() {
        return nome + " - " + (completa ? "Completa" : "Incompleta");
    }
}