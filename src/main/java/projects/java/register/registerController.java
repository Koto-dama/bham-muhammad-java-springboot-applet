package projects.java.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="register")
public class registerController {

    private final registerService service;

    @Autowired
    public registerController(registerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Register> getRegister(){
        return service.getRegister();
    }

}
