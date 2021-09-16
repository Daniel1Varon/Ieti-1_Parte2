package ieti1.service;

import ieti1.data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskHashMap implements TaskService{
    private final HashMap<String,Task> taskMap= new HashMap<>();

    @Override
    public Task create(Task task) {
        return taskMap.put(task.getId(), task);
    }

    @Override
    public Task findById(String id) {
        return taskMap.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>(taskMap.values());
    }

    @Override
    public Boolean delete(String id) {
        taskMap.remove(id);
        Boolean delete = !taskMap.containsKey(id);
        return delete;
    }

    @Override
    public Task update(Task task, String id) {
        return taskMap.put(id, task);
    }
}
