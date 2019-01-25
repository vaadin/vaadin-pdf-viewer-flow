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
import com.vaadin.flow.server.AbstractStreamResource;

@Tag("vaadin-pdf-viewer")
@HtmlImport("frontend://bower_components/vaadin-pdf-viewer/src/vaadin-pdf-viewer.html")
public class PdfViewer extends Component {

    /**
     * Initializes a new PdfViewer.
     */
    public PdfViewer() {

    }

    /**
     * @return url to source file
     */
    public String getSrc() {
        return getElement().getAttribute("src");
    }


    /**
     * You can set a pdf file that you want to render with src. Note that regular cross
     * site scripting (XSS) rules apply. This means that the file should be on the same
     * server as where the component is run, or that the server where the file is on should
     * be configured to allow loading files from other sites.
     *
     * @param src url to file
     */
    public void setSrc(String src) {
        getElement().setAttribute("src", src);
    }

    /**
     * Use this method to give in a pdf file as a StreamResource. This is handy when you
     * for example want to load a PDF from a database or have it freshly generated with a library
     *
     * How to use:
     * {@code StreamResource resource = new StreamResource("mypdf.pdf", ()
     *      -&gt; getPdfInputStream("mypdf.pdf");}
     *
     * @param src stream to file
     */
    public void setSrc(AbstractStreamResource src) {
        getElement().setAttribute("src", src);
    }
    /**
     * @return current zoom level
     */
    public String getZoom() {
        return getElement().getProperty("zoom");
    }

    /**
     * The level of zoom on the document.
     * Allowed values are
     *  - Number, for zoom percentage. Eg. 1.5 means 150% zoom
     *  - 'auto', default value
     *  - 'page-fit', fit a full page into component
     *
     * @param zoom zoom level
     */
    public void setZoom(String zoom) {
        getElement().setProperty("zoom", zoom);
    }


    /**
     *
     * @return url to the worker js file
     */
    public String getWorker() {
        return getElement().getProperty("worker");
    }

    /**
     * The component needs pdf.worker.js sometimes, depending on the PDF being loaded. It is
     * loaded lazily by telling the component where it is and it takes care of loading the file
     *  if needed. By default, it is loaded from a CDN,
     * '//cdnjs.cloudflare.com/ajax/libs/pdf.js/2.0.943/pdf.worker.min.js'. If you don't have
     * internet access or don't want to rely on a server, you can download the file and deploy
     * it within your app. When you have it available on runtime, update `worker` to point to
     * the url for the file.
     *
     * @param worker url to the worker js file
     */
    public void setWorker(String worker) {
        getElement().setProperty("worker", worker);
    }


}
