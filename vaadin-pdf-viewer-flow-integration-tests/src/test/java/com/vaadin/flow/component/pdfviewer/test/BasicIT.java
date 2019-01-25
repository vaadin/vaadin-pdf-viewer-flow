package com.vaadin.flow.component.pdfviewer.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicIT extends AbstractParallelTest {

    @Before
    public void init() {
        getDriver().get(getBaseURL());
    }

    @Test
    public void pass() {
    }
}
