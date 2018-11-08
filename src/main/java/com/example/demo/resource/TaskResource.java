package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Task;
import com.example.demo.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskResource 
{
	@Autowired
	private TaskRepository taskRepository;
	
	
	@PostMapping
	public void addTask(
			@RequestBody Task task) {
		taskRepository.save(task);
	}
	
	@GetMapping
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}
	
	@PutMapping("/{id}")
	public void editTask(
			@PathVariable long id,
			@RequestBody Task task) {
		Task existing = taskRepository.findById(id).get();
		Assert.notNull(existing, "Task not found");
		existing.setDescription(task.getDescription());
		taskRepository.save(task);
	}
	
	@DeleteMapping("{/id}")
	public void deleteTask(
			@PathVariable long id) {
		Task taskToDel = taskRepository.findById(id).get();
		taskRepository.delete(taskToDel);
	}
	
}
