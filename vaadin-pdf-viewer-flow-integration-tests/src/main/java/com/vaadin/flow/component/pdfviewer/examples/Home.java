package com.vaadin.flow.component.pdfviewer.examples;

import com.vaadin.flow.component.pdfviewer.PdfViewer;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class Home extends Div {

    public Home() {
        PdfViewer pdf = new PdfViewer();
        pdf.setSrc("frontend/bitcoin.pdf");
        pdf.setZoom("page-fit");
        add(pdf);
    }
}
