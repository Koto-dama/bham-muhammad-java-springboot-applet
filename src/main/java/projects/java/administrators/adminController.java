package projects.java.administrators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="admin")
public class adminController {

    private final adminService service;

    @Autowired
    public adminController(adminService service) {
        this.service = service;
    }

    @GetMapping
    public List<admin> getStudent(){
        return service.getAdmin();
    }

}
