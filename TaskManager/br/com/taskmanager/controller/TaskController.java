package br.com.taskmanager.controller;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.taskmanager.model.Task;
import br.com.taskmanager.service.TaskService;

public class TaskController {
    private TaskService service;
    private Scanner input = new Scanner(System.in);

    public TaskController(TaskService service) {
        this.service = service;
    }

    private void exibirMensagemErro(String mensagem) {
        System.out.println("erro: " + mensagem);
    }

    public void criarTarefa() {
        try {
            System.out.println("Digite o título:");
            String titulo = input.nextLine();

            System.out.println("Digite a descrição:");
            String descricao = input.nextLine();

            System.out.println("Digite o prazo (yyyy-MM-dd):");
            LocalDate prazo = LocalDate.parse(input.nextLine());

            Task tarefa = service.criarTarefa(null, titulo, descricao, prazo);

            System.out.println("Tarefa criada com sucesso! id: " + tarefa.getId());

        } catch (Exception e) {
            exibirMensagemErro(e.getMessage());
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas cadastradas:");
        service.listar().forEach(tarefa -> {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("Título: " + tarefa.getTitulo());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Prazo: " + tarefa.getPrazo());
            System.out.println("----------------------");
        });
    }

    public void removerTask(Long id) {
        try {
            service.removerTarefa(id);
            System.out.println("Tarefa removida com sucesso!");
        } catch (Exception e) {
            exibirMensagemErro(e.getMessage());
        }
    }

    public void atualizarTarefa() {
        try {
            System.out.print("Digite o ID da tarefa a ser atualizada: ");
            Long id = Long.parseLong(input.nextLine());

            System.out.print("Digite o novo título: ");
            String titulo = input.nextLine();

            System.out.print("Digite a nova descrição: ");
            String descricao = input.nextLine();

            System.out.print("Digite o novo prazo (yyyy-MM-dd): ");
            LocalDate prazo = LocalDate.parse(input.nextLine());

            service.atualizarTarefa(id, titulo, descricao, prazo);
            System.out.println("Tarefa atualizada com sucesso!");

        } catch (Exception e) {
            exibirMensagemErro(e.getMessage());
        }
    }
}