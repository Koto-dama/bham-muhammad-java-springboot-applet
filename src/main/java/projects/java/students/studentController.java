package projects.java.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="student")
public class studentController {

    private final studentService service;

    @Autowired
    public studentController(studentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudent(){
        return service.getStudent();
    }
}
