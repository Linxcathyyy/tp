package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

/**
 * Panel containing the help messages and statistics.
 */
public class MoreInfoPanel extends UiPart<Region> {
    private static final String FXML = "MoreInfoPanel.fxml";

    private static final String HELP_MESSAGE =
            "Love not me for comely grace,\n" +
                    "For my pleasing eye or face,\n" +
                    "Nor for any outward part,\n" +
                    "No, nor for my constant heart,\n" +
                    "For these may fail, or turn to ill.\n" +
                    "So thou and I must sever.\n" +
                    "Keep therefore a true woman’s eye,\n" +
                    "And love me still, but know not why,\n" +
                    "So hast thou the same reason still\n" +
                    "To doat upon me ever.";

    @FXML
    private HBox cardPane;
    @FXML
    private TextArea moreInfoDisplay;

    /**
     * Creates a {@code MoreInfoPanel}.
     */
    public MoreInfoPanel() {
        super(FXML);
        moreInfoDisplay.setText(HELP_MESSAGE);
        moreInfoDisplay.setWrapText(true);
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof MoreInfoPanel)) {
            return false;
        }

        return false;

    }
}
