package pl.edu.wszib.logproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.logproject.domain.Log;

public interface  RecordDao extends JpaRepository<Log, Long> {

}

/*import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.logproject.domain.Log;

import java.util.List;

@Repository
public interface RecordDao extends CrudRepository<Log, Long> {
    List<Log> findById(String name);

    Object findById();

}*/
