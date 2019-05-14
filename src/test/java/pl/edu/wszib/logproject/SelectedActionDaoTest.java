/*
package pl.edu.wszib.logproject;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.wszib.logproject.dao.SelectedActionDao;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectedActionDaoTest {

    public static final String COLOR1 = "red";
    public static final String COLOR2 = "blue";

    @Autowired
    SelectedActionDao selectedActionDao;

    @Before
    public void setUp() throws Exception {

        SelectedAction selectedAction1 = new SelectedAction(COLOR1, new Date());
        SelectedAction selectedAction2 = new SelectedAction(COLOR2, new Date());

        assertNull(selectedAction1.getAddEntry()); //tu sprawdzxa czy nie ma nic w bazie na wstępie
        assertNull(selectedAction2.getAddEntry());

        selectedActionDao.save(selectedAction1); //zapisuje obiekt do bazy przy teście
        selectedActionDao.save(selectedAction2); //zapisuje obiekt do bazy przy teście

        assertNotNull(selectedAction1.getAddEntry()); // tu sprawdza czy się zapisało
        assertNotNull(selectedAction2.getAddEntry()); // tu sprawdza czy się zapisało

        System.out.println("-----------------------------------------------------------------------");

    }
    @Test
    public void testFetchAllData() {// metoda wyciągająca (fetch) wszystkie zapisane rekordy

        Iterable<SelectedAction> selectedColors = selectedActionDao.findAll();//pobiera wszystkie elementy z bazy danych
        int counter = 0;
        for (SelectedAction selectedAction : selectedColors){
            counter++;
        }
        assertTrue(counter >= 2);

    }
    @Test
    public void testFindByColor (){

        List<SelectedAction> selectedActions = selectedActionDao.findByColor(COLOR1);
        assertEquals(COLOR1, selectedActions.get(0).getSearch());

    }

}
*/
