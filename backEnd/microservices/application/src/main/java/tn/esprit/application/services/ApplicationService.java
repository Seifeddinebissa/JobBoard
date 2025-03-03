package tn.esprit.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.application.entities.Application;
import tn.esprit.application.repositorys.ApplicationRepository;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> findAll() {
        return applicationRepository.findAll();
    }
    public Application findById(Long id) {
        return applicationRepository.findById(id).get();
    }
    public Application save(Application application) {
        return applicationRepository.save(application);
    }
    public void delete(Long id) {
        applicationRepository.deleteById(id);
    }


}
