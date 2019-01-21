# Vaadin PdfViewer for Flow

Vaadin PdfViewer for Flow is a UI component add-on for Vaadin.

## License & Author

This Add-on is distributed under [Commercial Vaadin Add-on License version 3](http://vaadin.com/license/cval-3) (CVALv3). For license terms, see LICENSE.txt.

Vaadin PdfViewer is written by Vaadin Ltd.

To purchase a license, visit http://vaadin.com/pricing

### Installing
Add PdfViewer to your project
```xml
<dependencies>
  <dependency>
    <groupId>com.vaadin</groupId>
    <artifactId>vaadin-pdf-viewer-flow</artifactId>
    <version>${vaadin.pdfviewer.version}</version>
  </dependency>
</dependencies>
```

### Using Vaadin PdfViewer

[<img src="https://raw.githubusercontent.com/vaadin/vaadin-pdf-viewer/master/screenshot.png" width="700" alt="Screenshot of vaadin-pdf-viewer">](https://vaadin.com/components/vaadin-pdf-viewer)

#### Basic use
```java
PdfViewer pdfViewer = new PdfViewer();
```

## Setting up for development

Clone the project in GitHub (or fork it if you plan on contributing)

```
git clone git@github.com:vaadin/vaadin-pdf-viewer-flow.git
```

To build and install the project into the local repository run

```mvn install -DskipITs```

in the root directory. `-DskipITs` will skip the integration tests, which require a TestBench license. If you want to run all tests as part of the build, run

```mvn install```

To compile and run demos locally execute

```
mvn compile
mvn -pl vaadin-pdf-viewer-flow-demo -Pwar jetty:run
```
