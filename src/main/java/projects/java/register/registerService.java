package projects.java.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.java.students.Student;
import projects.java.students.studentRepository;

import java.util.List;

@Service
public class registerService {

    private final registerRepository repo;

    @Autowired
    public registerService(registerRepository repo) {
        this.repo = repo;
    }

    public List<Register> getRegister(){
        return repo.findAll();
    }
}
