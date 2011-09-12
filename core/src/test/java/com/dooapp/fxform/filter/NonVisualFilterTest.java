package com.dooapp.fxform.filter;

import com.dooapp.fxform.TestUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * User: antoine
 * Date: 12/09/11
 * Time: 16:48
 */
public class NonVisualFilterTest extends AbstractFilterTest {
    @Override
    FieldFilter createFilter() {
        return new NonVisualFilter();
    }

    @Test
    public void testFilter() throws Exception {
        Assert.assertFalse(TestUtils.containsNamedField("integerProperty", filtered));
        Assert.assertTrue(TestUtils.containsNamedField("booleanProperty", filtered));
        Assert.assertTrue(TestUtils.containsNamedField("stringProperty", filtered));
        Assert.assertTrue(TestUtils.containsNamedField("doubleProperty", filtered));
        Assert.assertTrue(TestUtils.containsNamedField("objectProperty", filtered));
    }
}
