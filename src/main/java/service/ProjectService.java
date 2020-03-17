package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.DesignerMessage;
import net.javaguides.springboot.springsecurity.model.News;
import net.javaguides.springboot.springsecurity.model.Project;
import net.javaguides.springboot.springsecurity.repository.NewsRepository;
import net.javaguides.springboot.springsecurity.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Project project){
        if (project != null){
            return projectRepository.save(project);
        } else {
            throw new IllegalArgumentException("cannot save news");
        }
    }

    public Optional<Project> getProjects(Long id){
        return projectRepository.findById(id);
    }

    public List<Project> retriveProjects(){
        return  projectRepository.findAll();
    }
}
