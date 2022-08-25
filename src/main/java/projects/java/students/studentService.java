package projects.java.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private final studentRepository repo;

    @Autowired
    public studentService(studentRepository repo) {
        this.repo = repo;
    }
    public List<Student> getStudent() {
        return repo.findAll();
    }
}
