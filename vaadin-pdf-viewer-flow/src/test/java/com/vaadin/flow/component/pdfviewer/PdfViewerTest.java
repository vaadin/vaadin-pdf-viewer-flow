package com.vaadin.flow.component.pdfviewer;

import com.vaadin.flow.component.AttachEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class PdfViewerTest {

    private PdfViewer pdf;

    @Before
    public void setUp() {
        pdf = new PdfViewer();
    }

    @Test
    public void checkSrcNull() {
        assertNull("Src should be empty",
                pdf.getSrc());
    }

    @Test
    public void testSrcProperty() {
        pdf.setSrc("mypdf.pdf");
        Assert.assertEquals("mypdf.pdf", pdf.getSrc());
    }
}
