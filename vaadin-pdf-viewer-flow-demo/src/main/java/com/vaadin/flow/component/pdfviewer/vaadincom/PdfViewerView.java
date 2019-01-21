package com.vaadin.flow.component.pdfviewer.vaadincom;

import com.vaadin.flow.component.pdfviewer.PdfViewer;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;

@Route("vaadin-pdf-viewer")
public class PdfViewerView extends DemoView {

    @Override
    protected void initView() {
        basicDemo();
    }

    private void basicDemo() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        // end-source-example

        addCard("Basic Demo", component);
    }
}
