package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCheckbox {

    WebDriver driver;

    public SelectCheckbox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container:nth-child(30) div.a-row.apb-browse-two-col-center-pad:nth-child(2) div.a-column.a-span12.apb-browse-left-nav.apb-browse-col-pad-right.a-span-last:nth-child(2) div.a-row div.a-section.a-spacing-none.apb-browse-refinements div.a-section.a-spacing-none:nth-child(4) ul.a-unordered-list.a-nostyle.a-vertical.a-spacing-medium li.a-spacing-micro span.a-list-item a.a-link-normal div.a-checkbox.a-checkbox-fancy.aok-float-left.apb-browse-refinements-checkbox label:nth-child(1) > i.a-icon.a-icon-checkbox:nth-child(2)")
    WebElement getEligibleForFreeDelivery;

    public WebElement getGetEligibleForFreeDelivery() {
        return getEligibleForFreeDelivery;
    }
}
