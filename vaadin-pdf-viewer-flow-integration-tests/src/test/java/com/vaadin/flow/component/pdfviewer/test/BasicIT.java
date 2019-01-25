package com.vaadin.flow.component.pdfviewer.test;

import com.vaadin.flow.component.pdfviewer.testbench.PdfViewerElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicIT extends AbstractParallelTest {

    @Before
    public void init() {
        getDriver().get(getBaseURL());
    }

    @Test
    public void clickAround() {
        PdfViewerElement pdf = $(PdfViewerElement.class).waitForFirst();
        pdf.nextPage();
        pdf.nextPage();
        pdf.previousPage();
    }
}
