/*
package pl.edu.wszib.logproject.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;


import static org.junit.Assert.*;



public class SelectedNew_EntryDaoTest {

    public static final Date DATE1 = new Date();
    public static final Date DATE2 = new Date();

    @Autowired
    SelectedNew_EntryDao selectedNew_entryDao;

    @Before
    public void setUp() throws Exception {
        SelectedAction selectedAction1 = new SelectedAction(DATE1 new Date());
        SelectedAction selectedAction2 = new SelectedAction(DATE2, new Date());

        assertNull(selectedAction1.getEntryDate());
        assertNull(selectedAction2.getEntryDate());

        selectedNew_entryDao.save(selectedAction1);
        selectedNew_entryDao.save(selectedAction2);

        assertNotNull(selectedAction1.getEntryDate());
        assertNotNull(selectedAction2.getEntryDate());
    }

    @Test
    public void testFetchAllData() {
        Iterable<SelectedAction> SelectedActions = selectedNew_entryDao.findAll();
        int counter = 0;
        for (SelectedAction electedAction : SelectedActions) {
            counter++;
        }
        assertTrue(counter >= 2);
    }

    @Test
    public void testFindByColor() {
        List<SelectedAction> selectedActions = selectedNew_entryDao.findAllByEntryDate(DATE1);
        assertEquals(DATE1, selectedActions.get(0).getEntryDate());
    }



}*/
