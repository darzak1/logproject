/*
package pl.edu.wszib.logproject.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.wszib.logproject.domain.Form;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class FormDaoTest {

    public static final String DATE1 = "21/05/2019";
    public static final String DATE2 = "22/05/2019";

    @Autowired
    FormDao formDao;

    @Before
    public void setUp() throws Exception {
        Form form1 = new Form(DATE1, new Date());
        Form form2 = new Form(DATE2, new Date());


        assertNull(form1.getId());
        assertNull(form2.getId());

        formDao.save(form1);
        formDao.save(form2);

        assertNotNull(form1.getId());
        assertNotNull(form2.getId());
    }

    @Test
    public void testFetchAllData() {
        Iterable<Form> forms = formDao.findAll();
        int counter = 0;
        for (Form form : forms) {
            counter++;
        }
        assertTrue(counter >= 2);
    }

    @Test
    public void testForm() {
        List<Form> forms = formDao.findByEntryDate(DATE1);
        assertEquals(DATE1, forms.get(0).getEntryDate());
    }


}*/
