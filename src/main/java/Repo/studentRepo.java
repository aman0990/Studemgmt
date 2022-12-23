package Repo;

import Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepo extends JpaRepository<StudentEntity, Integer> {

    @Override
    List < StudentEntity > findAll ( );
}
