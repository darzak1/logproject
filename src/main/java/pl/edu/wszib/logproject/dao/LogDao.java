package pl.edu.wszib.logproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.logproject.domain.Log;

@Repository
public interface LogDao extends CrudRepository<Log, Long> {
}
