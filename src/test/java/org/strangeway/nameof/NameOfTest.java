package org.strangeway.nameof;

import org.junit.Test;
import org.strangeway.nameof.model.Person;

import static org.junit.Assert.assertEquals;
import static org.strangeway.nameof.LangUtils.$$;

public class NameOfTest {
    @Test
    public void direct() {
        assertEquals("name", $$(Person.class, Person::getName));
    }

    @Test
    public void properties() {
        assertEquals("summary", Person.$(Person::getSummary));
    }
}