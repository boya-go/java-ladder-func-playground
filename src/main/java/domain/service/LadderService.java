package domain.service;

import domain.Ladder;
import domain.LadderGenerator;
import domain.Line;
import domain.Size;
import java.util.List;

public class LadderService {
    private final LadderGenerator generator;

    public LadderService() {
        this.generator = new LadderGenerator();
    }

    public Ladder createLadder() {
        int height = Size.getHeight();
        int width = Size.getWidth();
        List<Line> lines = generator.generateLadder(height, width);

        return new Ladder(lines, width);
    }
}
