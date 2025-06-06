package domain;

import java.util.List;

public class Ladder {
    private final List<Line> lines;
    private final int width;

    public Ladder(List<Line> lines, int width) {
        this.lines = lines;
        this.width = width;
    }

    public List<Line> getLines() {
        return lines;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return lines.size();
    }
}
