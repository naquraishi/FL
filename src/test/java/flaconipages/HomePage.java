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

    @FindBy(xpath="(//span[@class='ico-close-medium'])[2]")
    private FluentWebElement cookiesDialogCancelButton;


    public void cookiesDialogCancel(){
        cookiesDialogCancelButton.click();
    }

    public void parfumPageSelection() {
        parfumButton.click();
    }


}


