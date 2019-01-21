package com.vaadin.flow.component.pdfviewer;

import com.vaadin.flow.component.AttachEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PdfViewerTest {

    private PdfViewer systemUnderTest;

    @Before
    public void setUp() {
        systemUnderTest = new PdfViewer();
    }

    @Test
    public void onAttach_init() {
        systemUnderTest.addAttachListener(e -> new AttachEvent(systemUnderTest, true));

        Assert.assertTrue(true);
    }
}
