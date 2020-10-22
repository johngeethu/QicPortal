package com.maximus.qicportaltestautomation.qic_app_manager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;



/**
 * This class contains common Selenium methods to handle different operations on the UI
 */
public class Utils {
    private static final By BLOCK_UI_AREA_BUSY_LOCATOR = By.xpath("//body[@aria-busy='true']");
    private static final By OVERLAY_LOCATOR = By.xpath ("//div[@class='block-ui-overlay']");


    protected static WebDriver wd;


    public Utils(WebDriver wd) {
        this.wd = wd;
    }


    /**
     * This is boolean info about an element (by locator), if it's present
     *
     * @param locator The locator of an element
     * @return True - if the element is present after 100 milliseconds if waiting, otherwise - False
     */
    public boolean isElementPresent(By locator) {
        try {
            wd.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
    
    public boolean isElementVisble(By locator) {
        try {
          if( wd.findElement(locator).isDisplayed())
            return true;
          else 
        	  return false;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /**
     * This waits for an element (by locator) to be clickable
     *
     * @param locator The locator of an element
     */
    public void waitUntilClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(wd, 1);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    /**
     * This waits an element (by locator) to be present
     *
     * @param locator The locator of an element
     */
    public void waitUntilPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(wd, 1);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    /**
     * This is to wait until an element disappears
     *
     * @param locator The locator of an element
     */
    public void waitElementDisappears(By locator) {
        do {
            wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }
        while (isElementPresent(locator));
    }


    /**
     * This is to wait until Block UI disappears and Selenium can see elements on the page
     */
    public void waitBlockUiDisappears() {
        waitElementDisappears(BLOCK_UI_AREA_BUSY_LOCATOR);
    }
    public void waitBlockUiOverlayDisappears() {
        waitElementDisappears(BLOCK_UI_AREA_BUSY_LOCATOR);
    }

    /**
     * This clicks on an element by its locator
     *
     * @param locator The locator of an element
     */
    protected void click(By locator) {
        wd.findElement(locator).click();
    }


    /**
     * This is to handle yes/no radio buttons by locator
     *
     * @param answerValue
     * @param yesLocator
     * @param noLocator
     */
    public void answerYesOrNo(String answerValue, By yesLocator, By noLocator) {
        if (answerValue.equalsIgnoreCase("y") || answerValue.equalsIgnoreCase("yes")) {
            clickIfPresent(yesLocator);
        } else if (answerValue.equalsIgnoreCase("n") || answerValue.equalsIgnoreCase("no")) {
            clickIfPresent(noLocator);
        } else {
            System.out.println("Incorrect value for the answer");
        }
    }


    /**
     * This is to handle yes/no radio buttons by elements
     *
     * @param answerValue
     * @param yesElement
     * @param noElement
     */
    public void answerYesOrNo(String answerValue, WebElement yesElement, WebElement noElement) {
        if (answerValue.equalsIgnoreCase("y") || answerValue.equalsIgnoreCase("yes")) {
            yesElement.click();
        } else if (answerValue.equalsIgnoreCase("n") || answerValue.equalsIgnoreCase("no")) {
            noElement.click();
        } else {
            System.out.println("Incorrect value for the answer");
        }
    }

    /**
     * This is used to Submit or Cancel Memorandum to RO by DMHC user
     *
     * @param answerValue
     * @param submitLocator
     * @param cancelLocator
     */
    public void submitOrCancelButton(String answerValue, By submitLocator, By cancelLocator) {
        if (answerValue.equalsIgnoreCase("submit") || answerValue.equalsIgnoreCase("yes")) {
            clickIfPresent(submitLocator);
        } else if (answerValue.equalsIgnoreCase("cancel") || answerValue.equalsIgnoreCase("no")) {
            clickIfPresent(cancelLocator);
        } else {
            System.out.println("Incorrect value for the answer");
        }
    }


    /**
     * This checks if an element is present (not blocked) and clicks on it. A special locator, which handles "readonly" is needed
     *
     * @param locator The locator of an element
     */
    protected void clickIfNotBlocked(By locator) {
        if (isElementPresent(locator)) {
            click(locator);
        }
    }


    /**
     * This clicks on an element by its locator, if it's present on the page
     *
     * @param locator The locator of an element
     */
    public void clickIfPresent(By locator) {
        if (isElementPresent(locator)) {
            click(locator);
        }
    }


    /**
     * This clicks on an element directly, when it is clickable
     *
     * @param element The locator of an element
     */
    public void clickIfClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(wd, 1);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }


    /**
     * This scrolls to an element and clicks on it by its locator
     *
     * @param locator
     * @param wd
     */
    public void scrollToElement(By locator, WebDriver wd) {
        WebElement element = wd.findElement(locator);
        Actions actions = new Actions(wd);
        actions.moveToElement(element).build().perform();
        waitBlockUiDisappears();
    }

    /**
     * This scrolls to an element and clicks on it by its locator
     *
     * @param locator
     * @param wd
     */
    public void scrollToElementAndClick(By locator, WebDriver wd) {
        WebElement element = wd.findElement(locator);
        Actions actions = new Actions(wd);
        actions.moveToElement(element).click().build().perform();
        waitBlockUiDisappears();
    }




    /**
     * This scrolls to an element and clicks on it by its locator
     *
     * @param locator The locator of an element
     * @param wd Instanse if a WebDriver
     */
    public void scrollToElementAndClickJSE(By locator, WebDriver wd) {
        WebElement element = wd.findElement(locator);
        scrollToElementWithJS(element, wd);
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(locator);
      }


    /**
     * This method scrolls to an element, using the locator, and gets its text
     *
     * @param locator The locator of an element
     * @param wd A driver which we are going to use to execute/perform some actions
     */
    public String scrollToElementAndGetText(By locator, WebDriver wd) {
        waitUntilVisible(locator);
        WebElement element = wd.findElement(locator);
        scrollToElementWithJS(element, wd);
        return getText(locator);
    }


    /**
     * This scrolls to an element
     *
     * @param element
     * @param wd
     */
    public static void scrollToElementWithJS(WebElement element, WebDriver wd) {
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    /**
     * This method uses Java Script to click on the element by its locator
     * @param locator The locator (xpath, css or other) of the element to be clicked
     * @param wd Selenium WebDriver object to perform actions on the page
     */
    public static void clickJS(By locator, WebDriver wd) {
        WebElement element = wd.findElement(locator);
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("arguments[0].click();", element);
    }


    /**
     * This types in a text field
     *
     * @param locator
     * @param text
     */
    protected void type(By locator, String text) {
        wd.findElement(locator).sendKeys(text);
    }


    /**
     * This types in a text field if it's ready
     *
     * @param locator
     * @param text
     */
    protected void clearAndType(By locator, String text) {
//        WebDriverWait wait = new WebDriverWait(wd, 1);
//        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        waitUntilClickable(locator);
        click(locator);
        wd.findElement(locator).clear();
        type(locator, text);
    }


    /**
     * This types in a text field if it's present
     *
     * @param locator
     * @param text
     */
    protected void typeIfPresent(By locator, String text) {
        if (isElementPresent(locator)) {
            wd.findElement(locator).sendKeys(text);
        }
    }

    /**
     * This is to get text from a selected option in a drop-down
     *
     * @param locator
     * @return
     */
    public String getTextFromDropdown(By locator) {
        WebElement element = wd.findElement(locator);
        Select dropDown = new Select(element);
        String selectedText = dropDown.getFirstSelectedOption().getText();
        return selectedText;
    }


    /**
     * This picks an element from a drop-down by text
     *
     * @param text
     * @param element
     * @throws InterruptedException
     */
    public void selectFromDropdown(String text, WebElement element) throws InterruptedException {
        Select parties = new Select(element);
        parties.selectByVisibleText(text);
        wd.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }


    /**
     * This provides a list of options from drop-down if it is "select" element
     *
     * @param locator
     * @return
     */
    public List<String> getListOfSelectDropdownOptions(By locator) {
        List<String> options = new ArrayList<String>();
        for (WebElement option : new Select(wd.findElement(locator)).getOptions()) {
            // String txt = option.getText();
            if (option.getAttribute("value") != "")
                options.add(option.getText().trim());
        }
        return options;
    }

    /**
     * This provides a list of options from drop-down if it is NOT "select" element
     *
     * @param locator
     * @return
     */
    public List<String> getListOfDropdownValues(By locator) {
        List<String> values = new ArrayList<String>();
        List<WebElement> elements = wd.findElements(locator);
        for (WebElement element : elements) {
            values.add(element.getText());
        }
        return values;
    }


    /**
     * This selects a random value from the list of values for any dropdown
     *
     * @param locator
     */
    public void selectRandomOption(By locator) {
        if (isElementPresent(locator)) {
            List<WebElement> itemsInDropdown = wd.findElements(locator);
            itemsInDropdown.get(new Random().nextInt(itemsInDropdown.size())).click();
        }
        wd.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
    }
    
    public void selectByIndex (By drpdownlocator,int numberInDropdown) {
    	Select objSel = new Select(wd.findElement(drpdownlocator));
    	objSel.selectByIndex(numberInDropdown);
    }


    /**
     * This picks an element from the list of elements by its index
     *
     * @param locator
     * @param optionNumber
     **/

    public void selectOptionFromDropDownByIndex(By locator, int optionNumber) {
        List<WebElement> itemsInDropdown = wd.findElements(locator);
        itemsInDropdown.get(optionNumber).click();
        wd.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }


    /**
     * This picks an element from the list of elements by its text
     *
     * @param locator
     * @param text
     */
    public void selectOptionFromDropDownByText(By locator, String text) {
        Select values = new Select(wd.findElement(locator));
        values.selectByVisibleText(text);
        wd.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }


    /**
     * This is to get a part of a text by locator of an element, which was divided some way
     *
     * @param locator
     * @param regex
     * @param rowNumber
     * @return
     */
    public String getTextByRow(By locator, String regex, int rowNumber) {
        String someText = getText(locator);
        String textRows[] = someText.split(regex);
        String row = textRows[rowNumber].trim();
        return row;
    }


    /**
     * This is to get a part of a text extracted from an element, which was divided some way
     *
     * @param initialText
     * @param regex
     * @param rowNumber
     * @return
     */
    public String getTextFromRegex(String initialText, String regex, int rowNumber) {
        String row = null;
        String textRows[] = initialText.split(regex);
        if (textRows.length > rowNumber) {
            row = textRows[rowNumber].trim();
        } else {
            row = "";
        }
        return row;
    }


    /**
     * This gets a regular text by a locator
     */
    public String getText(By locator) {
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return wd.findElement(locator).getText();
    }


    /**
     * This gets a value of an element
     *
     * @param locator
     * @return
     */
    public String getValue(By locator) {
        return wd.findElement(locator).getAttribute("value");
    }


    /**
     * This gets a hidden in HTML text by an element's value
     *
     * @param locator
     * @return
     */
    public String getProjectValue(By locator) {
        WebElement element = wd.findElement(locator);
        String textFromValue = element.getAttribute("value");
        textFromValue = (!textFromValue.isEmpty() && textFromValue.lastIndexOf("-")!=-1)? textFromValue.substring(textFromValue.lastIndexOf("-")+1) : textFromValue;
        return textFromValue;
    }



    /**
     * This gets a hidden in HTML text by an element's value
     *
     * @param locator
     * @return
     */
    public String getTextFromValue(By locator) {
        WebElement element = wd.findElement(locator);
        String textFromValue = element.getAttribute("value");
        return textFromValue;
    }


    /**
     * This gets a hidden in HTML text by an element's value or returns N/A if the field is empty
     *
     * @param locator
     * @return
     */
    public String getTextFromValueOrNa(By locator) {
        WebElement element = wd.findElement(locator);
        String  textFromValue = element.getAttribute("value");
        if (!textFromValue.isEmpty()) {
            return textFromValue;
        } else {
            String emptyField  = "N/A";
            return emptyField;
        }
    }



    /**
     * This gets a hidden in HTML text by an element's value with help of JavascriptExecutor
     *
     * @param locator
     * @param wd
     * @return
     */
    public static String getTextByJavaScript(By locator, WebDriver wd) {
        WebElement element = wd.findElement(locator);
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        String text = String.valueOf(jse.executeScript("return arguments[0].value;", element));
        return text;
    }


    /**
     * This attaches file to an element (by locator)
     *
     * @param locator
     * @param file
     */
    protected void attach(By locator, File file) {
        if (file != null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }


    /**
     * This waits an element (by locator) to be visible
     *
     * @param locator
     */
    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(wd, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public void waitUntilVisibleLong(By locator) {
        WebDriverWait wait = new WebDriverWait(wd,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    /**
     * This creates a string of the current date and time
     *
     * @return
     */
    public String timeStampDateHour() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String string = dateFormat.format(new Date());
        return string;
    }

    /**
     * This creates a string of the current date
     *
     * @return
     */
    public String timeStampDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
        String string = dateFormat.format(new Date());
        return string;
    }


    /**
     * This handles pop-up window with positive answer
     */
    public void popUpYes() {
        Alert alertYes = wd.switchTo().alert();
        alertYes.accept();
    }


    public static void getAshotScreenshotAndSave(By locator, String filename) throws IOException {
        WebElement element = wd.findElement(locator);
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(wd, element);
        File actualFile = new File("src/test/resources/" + filename + ".png");
        ImageIO.write(screenshot.getImage(), "png", actualFile);
    }

    public static void highlightElementTakeScreenshotAndSave(By locator, String filename) throws IOException {
        WebElement element = wd.findElement(locator);
        //highlight element by red color
        ((JavascriptExecutor) wd).executeScript("arguments[0].style.border='3px solid red'", element);
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(wd, element);
        File actualFile = new File("src/test/resources/" + filename + ".png");
        ImageIO.write(screenshot.getImage(), "png", actualFile);
    }


    /**
     * This method downloads a case PDF by the given locator and saves it to the test-resources of the project with the Temp Id number
     *
     * @param locator
     * @param party
     * @param caseNumber
     * @throws IOException
     */
    public void downloadFromUrl(By locator, String party, String caseNumber) {
        try {
            String hrefUrl = wd.findElement(locator).getAttribute("href");
            URL url = new URL(hrefUrl + "?email=" + party);
            File file = new File("src/test/resources/pdf" + caseNumber + ".pdf");
            FileUtils.copyURLToFile(url, file);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("There is an error during the file downloading/saving");
        }
    }


    /**
     * This returns a case number for almost all the cases
     *
     * @return
     */
    public String anyTextFromUiByLocator(By locator) {
        String caseNumber = getText(locator);
        return caseNumber;
    }


    /**
     * This generates a string with the given amount of digits
     *
     * @param length
     * @return
     */
    public static String randomStringDigitsOnly(int length) {
        boolean useLetters = false;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedString;
    }


    /**
     * This generates a string with the given amount of digits and letters
     *
     * @param length
     * @return
     */
    public static String randomStringLettersDigits(int length) {
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedString;
    }



    public static void waitWhenOverlayInvisible(){
        WebDriverWait wait = new WebDriverWait(wd, 3);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(OVERLAY_LOCATOR));
    }
    
    //uploading file using javascript key event functionality
    
    public static void uploadFile(File file) {
        try {
        	//Setting clipboard with file location
        	String fileLocation= file.getAbsolutePath();
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
    
    public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}


}
