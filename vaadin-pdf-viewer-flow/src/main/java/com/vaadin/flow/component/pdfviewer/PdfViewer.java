package com.vaadin.flow.component.pdfviewer;

/*
 * #%L
 * Vaadin PdfViewer for Vaadin 10
 * %%
 * Copyright (C) 2017 - 2018 Vaadin Ltd
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

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.H1;

@Tag("div")
//@Tag("vaadin-pdf-viewer")
//@HtmlImport("frontend://bower_components/vaadin-pdf-viewer/src/vaadin-pdf-viewer.html")
public class PdfViewer extends Component {

    /**
     * Initializes a new PdfViewer.
     */
    public PdfViewer() {
        getElement().appendChild(new H1("Hello World!").getElement());
    }
}
