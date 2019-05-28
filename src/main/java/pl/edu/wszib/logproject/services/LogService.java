package pl.edu.wszib.logproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.logproject.dao.RecordDao;
import pl.edu.wszib.logproject.domain.Log;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//Dodaję  metodę pobierającą utworzone wpisy. Metoda wpierw pobierze wszystkie wpisy później ma zwrócić
// wszystkie wpisy, których data utworzenia jest mniejsza lub równa bieżącej dacie

@Service
public class LogService {

    @Autowired
    RecordDao recordDao;

    public List<Log> getPublishedLogs(){

        List<Log> logs = recordDao.findAll();
        LocalDateTime now = LocalDateTime.now();
        Predicate<Log> predicate = post -> {
            return now.isBefore (LocalDateTime.now());
        };
        return logs.stream().filter(predicate).collect(Collectors.toList());


    }

}
