package com.itmastar.crud.controller;

import com.itmastar.crud.entity.Worker;
import com.itmastar.crud.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WorkerController {

    @Autowired
    private WorkerService service;

    @GetMapping("/workers")
    public List<Worker>  getAllWorkers(){
      return service.getAllWorkers();
    }

    @GetMapping("/workers/{id}")
    public Optional<Worker> getWorkerById(@PathVariable int id){
        return service.getWorkerById(id);
    }

    @PostMapping("/workers")
    public String saveWorker(@RequestBody Worker worker){
        service.saveWorker(worker);
       return "Worker created with id :: "+worker.getId();
    }
}
