package br.com.taskmanager.repository;

import br.com.taskmanager.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {
    private List<Task> tarefas = new ArrayList<>();
    private Long contadorId = 1L;

    public Task salvar(Task tarefa) {
        tarefa.setId(contadorId++);
        tarefas.add(tarefa);
        return tarefa;
    }

    public List<Task> listar() {
        return tarefas;
    }

    public Optional<Task> buscarPorId(Long id) {
        return tarefas.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst();
    }
    
    public void remover(Long id) {
        tarefas.removeIf(t -> t.getId().equals(id));
    }
}