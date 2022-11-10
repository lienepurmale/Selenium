package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramePage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String lefFrameArea = "frame-left";
    private String bottomFrameArea = "frame-bottom";
    private By wholeFrameArea = By.tagName("body");
;
    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextLeftFrame() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(lefFrameArea);
        String text = getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getText(){
        return driver.findElement(wholeFrameArea).getText();
    }

    public String getTextBottomFrame(){
        driver.switchTo().frame(bottomFrameArea);
        String text = getText();
        driver.switchTo().parentFrame();
        return text;
    }


}
