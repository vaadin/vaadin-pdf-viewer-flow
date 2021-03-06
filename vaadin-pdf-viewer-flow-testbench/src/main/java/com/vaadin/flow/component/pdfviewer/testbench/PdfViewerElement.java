package com.vaadin.flow.component.pdfviewer.testbench;

/*
 * #%L
 * Vaadin PdfViewer Testbench API
 * %%
 * Copyright (C) 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file license.html distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element("vaadin-pdf-viewer")
public class PdfViewerElement extends TestBenchElement {

    public String getTitle() {
        return $("#title").first().getText();
    }

    public void nextPage() {
        $("#nextPage").first().click();
    }

    public void previousPage() {
        $("#previousPage").first().click();
    }
}
