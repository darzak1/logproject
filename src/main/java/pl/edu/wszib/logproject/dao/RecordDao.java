package pl.edu.wszib.logproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.logproject.domain.Log;

public interface  RecordDao extends JpaRepository<Log, Long>{

}
