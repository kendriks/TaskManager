package br.com.taskmanager.service;

import java.time.LocalDate;
import java.util.List;

import br.com.taskmanager.model.Task;
import br.com.taskmanager.repository.TaskRepository;

public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task criarTarefa(Long id, String titulo, String descricao, LocalDate prazo) {
        if (titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("Título deve ter no mínimo 3 caracteres");
        }

        if (prazo.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Prazo da atividade não pode ser no passado");
        }

        Task tarefa = new Task(id, descricao, descricao, prazo);
        tarefa.setId(id);
        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setPrazo(prazo);

        return repository.salvar(tarefa);
    }

    public List<Task> listar() {
        return repository.listar();
    }

    public void removerTarefa(Long id) {
    repository.remover(id);
}

    public void atualizarTarefa(Long id, String titulo, String descricao, LocalDate prazo) {
        Task tarefa = repository.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("Tarefa com ID " + id + " não encontrada."));

        if (titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("Título deve ter no mínimo 3 caracteres.");
        }

        if (prazo.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Prazo não pode ser no passado.");
        }

        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setPrazo(prazo);

        repository.salvar(tarefa);
    }

    public Task buscarPorId(Long id) {
        return repository.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("Tarefa com ID " + id + " não encontrada."));
    }
}