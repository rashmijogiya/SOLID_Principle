package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRelated {
    WebDriver driver;

    public AccountRelated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#nav-logo-sprites")
    WebElement amazonHomeLogo;

    @FindBy(css = "#nav-link-accountList>.nav-line-2")
    WebElement accountLink;

    @FindBy(css = "#ap_email")
    WebElement emailId;

    @FindBy(css = "#ap_password")
    WebElement password;

    @FindBy(css = ".a-button-inner>#continue")
    WebElement continueButton;

    @FindBy(css = "#signInSubmit")
    WebElement signInButton;

    @FindBy(css = "body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container:nth-child(30) div.a-section.ya-personalized div.ya-card-row:nth-child(2) div.ya-card-cell:nth-child(1) > a.ya-card__whole-card-link")
    WebElement yourAccountCards;

    @FindBy(css = "#a-autoid-1")
    WebElement orderPlacedDropDown;

    @FindBy(partialLinkText = "2021")
    WebElement dropDownOfYear;

    @FindBy(css = "body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container:nth-child(30) div.a-section.ya-personalized div.ya-card-row:nth-child(3) div.ya-card-cell:nth-child(2) a.ya-card__whole-card-link > div.a-box.ya-card--rich")
    WebElement addPaymentCard;

    @FindBy(css = "#address-ui-widgets-enterAddressFullName")
    WebElement addressFullName;

    @FindBy(css = "#address-ui-widgets-enterAddressPhoneNumber")
    WebElement addressPhoneNo;

    @FindBy(css = "#address-ui-widgets-enterAddressPostalCode")
    WebElement addressPinCode;

    @FindBy(css = "#address-ui-widgets-enterAddressLine1")
    WebElement addressLine1;

    @FindBy(css = "#address-ui-widgets-enterAddressLine2")
    WebElement addressLine2;

    @FindBy(css = "#address-ui-widgets-landmark")
    WebElement addressLandmark;

    @FindBy(css = "#address-ui-widgets-enterAddressCity")
    WebElement addressCity;

    @FindBy(css = ".a-button-input")
    WebElement addressSaveButton;

    @FindBy(css = "#a-autoid-2 > .a-button-inner > .a-button-input")
    WebElement addressConfirmButton;

    @FindBy(xpath = "//*[@id=\"cpefront-mpo-widget\"]/div/form/div/div/div[2]/div[4]/div/a")
    WebElement cardDetails;

    @FindBy(css = "body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container:nth-child(30) div.a-section.ya-personalized div.ya-card-row:nth-child(3) div.ya-card-cell:nth-child(1) a.ya-card__whole-card-link div.a-box.ya-card--rich > div.a-box-inner")
    WebElement addAddressCard;

    @FindBy(xpath = "//*[@id=\"ya-myab-address-add-link\"]/div")
    WebElement addNewAddress;

    @FindBy(xpath = "//*[@id=\"ya-myab-display-address-block-3\"]")
    WebElement completeAddress;

    public WebElement getAmazonHomeLogo() {
        return amazonHomeLogo;
    }

    public WebElement getAccountLink() {
        return accountLink;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getYourAccountCards() {
        return yourAccountCards;
    }

    public WebElement getOrderPlacedDropDown() {
        return orderPlacedDropDown;
    }

    public WebElement getDropDownOfYear() {
        return dropDownOfYear;
    }

    public WebElement getAddPaymentCard() {
        return addPaymentCard;
    }

    public WebElement getAddressFullName() {
        return addressFullName;
    }

    public WebElement getAddressPhoneNo() {
        return addressPhoneNo;
    }

    public WebElement getAddressPinCode() {
        return addressPinCode;
    }

    public WebElement getAddressLine1() {
        return addressLine1;
    }

    public WebElement getAddressLine2() {
        return addressLine2;
    }

    public WebElement getAddressCity() {
        return addressCity;
    }

    public WebElement getAddressLandmark() {
        return addressLandmark;
    }

    public WebElement getAddressSaveButton() {
        return addressSaveButton;
    }

    public WebElement getAddressConfirmButton() {
        return addressConfirmButton;
    }

    public WebElement getCardDetails() {
        return cardDetails;
    }

    public WebElement getAddAddressCard() {
        return addAddressCard;
    }

    public WebElement getAddNewAddress() {
        return addNewAddress;
    }

    public WebElement getCompleteAddress() {
        return completeAddress;
    }
}
