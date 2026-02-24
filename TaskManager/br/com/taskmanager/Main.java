package br.com.taskmanager;

import java.util.Scanner;

import br.com.taskmanager.controller.TaskController;
import br.com.taskmanager.repository.TaskRepository;
import br.com.taskmanager.service.TaskService;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TaskRepository repository = new TaskRepository();
        TaskService service = new TaskService(repository);
        TaskController controller = new TaskController(service);


        int opcao;

        do {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Deletar tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Atualizar tarefa");
            System.out.println("5 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    controller.criarTarefa();
                    break;
            
                case 2: 
                    controller.listarTarefas();
                    System.out.print("Digite o índice para remover: ");
                    int id = input.nextInt();
                    controller.removerTask((long) id);
                    break;
                
                case 3:
                    controller.listarTarefas();
                    break;

                case 4:
                    controller.atualizarTarefa();
                    break;

                case 5:
                    System.out.println("Saindo da aplicação!");
                    break;

            default:
                break;
        }
    } while (opcao != 5);
    }
}