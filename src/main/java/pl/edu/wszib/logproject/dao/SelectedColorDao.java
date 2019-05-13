package pl.edu.wszib.logproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.List;

@Repository
public interface SelectedColorDao extends CrudRepository<SelectedAction, Integer> {
    List<SelectedAction> findByColor(String color);
}
