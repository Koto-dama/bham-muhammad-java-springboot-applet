package projects.java.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewStudent(@RequestBody Student newStudent){
        service.addStudent(newStudent);
    }

    @DeleteMapping(path="{studentID}")
    public void removeStudent(@PathVariable("studentID")long id){
        service.deleteStudent(id);
    }
}
