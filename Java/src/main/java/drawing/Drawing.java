package drawing;

import drawing.formatting.Formatter;
import drawing.formatting.JPEGFormatter;
import drawing.formatting.PNGFormatter;
import drawing.shapes.Line;
import drawing.shapes.Shape;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Drawing {

    public List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void draw(String format, String filename) {
        String outName = filename + "." +  format;
        if (format.equals("jpeg")) {
            this.write(new JPEGWriter(outName), new JPEGFormatter());
        } else if (format.equals("png")) {
            this.write(new PNGWriter(outName), new PNGFormatter());
        } else {
            throw new IllegalArgumentException("Format not recognized: " + format);
        }
    }

    private void write(Writer writer, Formatter formatter) {
        try {
            for (Shape shape : shapes) {
                shape.draw(writer, formatter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

