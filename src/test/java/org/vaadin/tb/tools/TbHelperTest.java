/*
 * Copyright 2014 Matti Tahvonen <matti@vaadin.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.tb.tools;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Matti Tahvonen <matti@vaadin.com>
 */
public class TbHelperTest {
    
    public TbHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIdentifiers() {
        PhoneBookEntryForm phoneBookEntryForm = new PhoneBookEntryForm();
        // ensure save/reset buttons etc are created
        phoneBookEntryForm.createContent();
        
        TbHelper.assignIndentifiers(phoneBookEntryForm);

        Assert.assertEquals("saveButton", phoneBookEntryForm.getSaveButton().getId());
        Assert.assertEquals("resetButton", phoneBookEntryForm.getResetButton().getId());
        Assert.assertEquals("name", phoneBookEntryForm.name.getId());
        Assert.assertEquals("birthDate", phoneBookEntryForm.birthDate.getId());
        Assert.assertEquals("number", phoneBookEntryForm.number.getId());
        Assert.assertEquals("email", phoneBookEntryForm.email.getId());
        
    }
}
