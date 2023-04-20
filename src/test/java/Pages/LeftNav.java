package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResourcesLeftNav;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupAtHumanResources;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategoriesAtHR;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "(//*[text()='Grade Levels'])[1]")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupInSubjectCat;

    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "bankAccounts":
                return bankAccounts;
            case "discounts":
                return discounts;
            case "education":
                return education;
            case "subjectCategories":
                return subjectCategories;
            case "setupInSubjectCat":
                return setupInSubjectCat;
            case "gradeLevels":
                return gradeLevels;
            case "humanResourcesLeftNav":
                return humanResourcesLeftNav;
            case "SetupAtHumanResources":
                return SetupAtHumanResources;
            case "positionCategoriesAtHR":
                return positionCategoriesAtHR;

        }
        return null;
    }

}
