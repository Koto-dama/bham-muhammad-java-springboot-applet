package projects.java.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void addStudent(Student newStudent){

        Optional<Student> searchByEmail = repo.findStudentByEmail(newStudent.getEmail());

        if (searchByEmail.isPresent()){
            throw new IllegalStateException("Account with email already exists");
        }else {
            repo.save(newStudent);
        }
    }

    public void deleteStudent(long id){
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new IllegalStateException("Student with ID " + id + " does not exist");
        }

    }
}
