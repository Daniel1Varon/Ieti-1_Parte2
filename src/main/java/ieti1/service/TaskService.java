package ieti1.service;

import ieti1.data.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    Boolean  delete( String id );

    Task update( Task task, String id );
}
