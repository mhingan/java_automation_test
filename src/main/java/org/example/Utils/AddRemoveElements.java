package org.example.Utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElements {

    String link_test_1 = "https://the-internet.herokuapp.com/add_remove_elements/";

    @FindBy(xpath = "/html/body/div[2]/div/div/button")
    private WebElement add_button;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/button")
    private WebElement delete_buttons;

    @FindBy(xpath = "//*[@id=\"content\"]/h3")
    private WebElement page_title;


    public String getLink(){
        return link_test_1;
    }

    public WebElement getAddBttn(){
        return add_button;
    }

    public WebElement getDeleteBttn(){
        return delete_buttons;
    }

    public WebElement getPage_title(){
        return page_title;
    }
}
