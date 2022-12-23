package Controller;

import Entity.StudentEntity;
import Repo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @Autowired
    private studentRepo repo;
    @PostMapping("/save")
    public StudentEntity saveStudent(@RequestBody StudentEntity std) {
        StudentEntity s1 = repo.save(std);
        return s1;
    }
}
