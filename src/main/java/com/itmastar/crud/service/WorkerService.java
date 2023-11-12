package com.itmastar.crud.service;

import com.itmastar.crud.entity.Worker;
import com.itmastar.crud.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public List<Worker>  getAllWorkers(){
        return repository.findAll();
    }

    public void saveWorker(Worker worker) {
        repository.save(worker);
    }

    public Optional<Worker> getWorkerById(int id) {

       return  repository.findById(id);
    }
}
