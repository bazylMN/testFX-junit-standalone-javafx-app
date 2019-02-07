package testFXJunitStandaloneApp.junitTests;

import javafx.scene.control.Labeled;
import javafx.scene.input.MouseButton;
import org.junit.jupiter.api.*;
import testFXJunitStandaloneApp.TestFXJUnitAppRunner;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTestFXJUnitTest extends TestFXJUnitAppRunner {

    private final String LABEL_FOR_BUTTON = ".button";
    private final String TEXT_LABEL_BEFORE_CLICK = "click me!";
    private final String TEXT_LABEL_AFTER_CLICK = "clicked!";

    @Test
    @Order(2)
    @DisplayName("should verify text 'click me' before click button and verify text 'clicked' after clicked button")
    public void should_click_button_and_see_clicked_text() {

        Labeled label = lookup(LABEL_FOR_BUTTON).query();

        verifyThat(label, hasText(TEXT_LABEL_BEFORE_CLICK));

        clickOn(label, MouseButton.PRIMARY);

        verifyThat(label, hasText(TEXT_LABEL_AFTER_CLICK));
    }

    @Test
    @Order(1)
    @DisplayName("should verify text 'click me' before click button")
    public void should_verify_text_click_me_before_click() {

        Labeled label = lookup(LABEL_FOR_BUTTON).query();

        verifyThat(label, hasText(TEXT_LABEL_BEFORE_CLICK));
    }
}
