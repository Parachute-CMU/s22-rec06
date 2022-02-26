package drawing.shapes;

import drawing.formatting.Formatter;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;

public interface Shape {

    Line[] toLines();

    default void draw(Writer writer, Formatter formatter) throws IOException {
        Line[] lines = this.toLines();
        for (Line line: lines) {
            writer.write(formatter.format(line));
        }
    }
}
