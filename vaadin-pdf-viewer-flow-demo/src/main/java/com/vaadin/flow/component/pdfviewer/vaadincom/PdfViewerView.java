package com.vaadin.flow.component.pdfviewer.vaadincom;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.pdfviewer.PdfViewer;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinService;

import java.io.InputStream;

@HtmlImport("frontend://shared-styles.html")
@Route("vaadin-pdf-viewer")
public class PdfViewerView extends DemoView {

    @Override
    protected void initView() {
        singePagePdf();
        readFromSource();
        multiPagePdf();
        noFile();
        adjustZoom();
        ownWorker();
    }


    private void readFromSource() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        StreamResource resource = new StreamResource("mypdf.pdf", () -> getPdfInputStream("mypdf.pdf"));
        component.setSrc(resource);
        // end-source-example
        Text description = new Text("Use this method to give in a pdf file as a StreamResource. This is handy when " +
                "you for example want to load a PDF from a database or have it freshly generated with a library." +
                "getPdfInputStream returns the file in for of an InputStream. Ib this case it loads from the source " +
                "folders with getClass().getResourceAsStream(\"/example-invoice.pdf\");");

        addCard("Loading PDF from a stream", description, component);
    }

    private InputStream getPdfInputStream(String s) {
        return getClass().getResourceAsStream("/example-invoice.pdf");
    }

    private void singePagePdf() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        component.setSrc("frontend/example-invoice.pdf");
        component.setHeight("600px");
        // end-source-example

        addCard("Showing a Single Page PDF Inline from File System", component);
    }

    private void multiPagePdf() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        component.setSrc("frontend/bitcoin.pdf");
        // end-source-example

        addCard("Showing a Multipage PDF Inline from File System", component);
    }


    private void noFile() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        // end-source-example

        addCard("No File Specified", component);
    }

    private void adjustZoom() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        component.setSrc("frontend/example-invoice.pdf");
        component.setZoom("page-fit");
        // end-source-example
        Text description = new Text("There are controls for the user to set a zoom level, but you can also defined programmatically what the level should be, so that you have a good default. For example, in many cases you want a one-pager to be fully visible on the screen. For that zoom=\"page-fit\" is an excellent choice.");
        addCard("Adjust the zoom level", description, component);
    }

    private void ownWorker() {
        // begin-source-example
        // source-example-heading: Basic Demo
        PdfViewer component = new PdfViewer();
        component.setSrc("frontend/example-invoice.pdf");
        component.setWorker("frontend/pdf.worker.min.js");
        // end-source-example
        Text description = new Text("The component needs pdf.worker.js sometimes, depending on the PDF being loaded. It is" +
                " loaded lazily by telling the component where it is and it takes care of loading the file" +
                " if needed. By default, it is loaded from a CDN," +
                " '//cdnjs.cloudflare.com/ajax/libs/pdf.js/2.0.943/pdf.worker.min.js'. If you don't have" +
                " internet access or don't want to rely on a server, you can download the file and deploy" +
                " it within your app. When you have it available on runtime, update `worker` to point to" +
                " the url for the file.");
        addCard("Self-deployed worker", description, component);
    }
}
