import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome) {
        Tarefa novaTarefa = new Tarefa(nome);
        tarefas.add(novaTarefa);
    }

    public void marcarTarefaComoCompleta(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoCompleta();
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }

    public void listarTarefas() {

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Lista de Tarefas: ");
            System.out.println(">> " + i + " - " + tarefas.get(i));
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Marcar Tarefa como Completa");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Listar Tarefas");
            System.out.println("0 - Sair");
            System.out.println("=================");
            System.out.println("\n");
            System.out.print("--> Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nomeTarefa = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(nomeTarefa);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa para marcar como completa: ");
                    int indiceCompleta = scanner.nextInt();
                    listaDeTarefas.marcarTarefaComoCompleta(indiceCompleta);
                    break;
                case 3:
                    System.out.print("Digite o índice da tarefa para remover: ");
                    int indiceRemover = scanner.nextInt();
                    listaDeTarefas.removerTarefa(indiceRemover);
                    break;
                case 4:
                    listaDeTarefas.listarTarefas();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
