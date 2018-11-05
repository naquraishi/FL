package flaconipages;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@PageUrl("https://www.flaconi.de")

public class HomePage extends FluentPage{

    @FindBy(xpath = "//nav[@id='main-navigation']/ul/li/a[@title='Parfum']")
    private FluentWebElement parfumButton;

    @FindBy(xpath = "//nav[@id='main-navigation']/ul[@class='nav-main']/li[2]/ul/li[2]/ul//a[@title='Nischendüfte']")
    private FluentWebElement nischenDufteButton;


    public void parfumPageSelection() {
        //FF seems to have issue below mouse hover way of selecting element.
        parfumButton.click();

    }

    public void nischenDueftePageSelection(){
        Actions builder = new Actions(this.getDriver());
        builder.moveToElement(parfumButton.getElement()).build().perform();
        nischenDufteButton.click();
    }

//    @Override
//    public void isAt() {
//        assertThat(window().title()).contains("All User");
//    }

}


