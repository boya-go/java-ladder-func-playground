package controller;

import domain.Ladder;
import domain.service.LadderService;
import view.OutputView;

public class LadderController {

    private final LadderService ladderService = new LadderService();
    private final OutputView outputView = new OutputView();

    public void runLadder() {
        Ladder ladder = ladderService.createLadder();
        outputView.printLadder(ladder);
    }
}
