package projects.java.administrators;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService {
    public adminService(adminRepository repository) {
        this.repository = repository;
    }

    private final adminRepository repository;
    public List<admin> getAdmin(){
        return repository.findAll();
    }
}
