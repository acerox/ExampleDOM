package me.acerox.domsax;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleDOM {

    public Node getChild(Node node, int child) {
        return node.getChildNodes().item(child);
    }

    public void saveDOMToFile(Document document, String name) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(name));
        OutputFormat outputFormat = new OutputFormat(document, "UTF-8", true);

        XMLSerializer xmlSerializer = new XMLSerializer(fileOutputStream, outputFormat);
        xmlSerializer.serialize(document);
    }

    public static void main(String[] args) {
        // Tests
    }
}
