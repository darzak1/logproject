package pl.edu.wszib.logproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.logproject.domain.*;

import java.util.Date;
import java.util.List;

@Repository
public interface FormDao extends CrudRepository <Form, Date> {
    List<Form> findByEntryDate(Date entryDate);
}
