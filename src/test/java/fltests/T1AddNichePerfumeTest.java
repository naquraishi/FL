package fltests;
import flaconipages.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import utils.FluentLeniumTest;
import static org.junit.Assert.*;


public class T1AddNichePerfumeTest extends FluentLeniumTest {

    @Page
    private HomePage homePage;

    @Page
    private ParfumPage parfumPage;

    @Page
    private HerrenParfumPage herrenParfumPage;

    @Page

    private NischenDueftePage nischenDueftePage;

    @Page
    private AddToCartPage addToCartPage;

    @Page
    private WarenkorbPage warenkorbPage;

    @Test
    public void test1(){
        homePage.go();
        homePage.cookiesDialogCancel();
        homePage.parfumPageSelection();
        parfumPage.herrenParfumSelection();
        herrenParfumPage.nischenDuefteSelection();
        nischenDueftePage.niedrigsterOptionSelection();
        String itemDetails =  nischenDueftePage.addItemName();
        nischenDueftePage.niedrigsterParfumSelection();
        addToCartPage.addToCartClick();
        addToCartPage.viewCartClick();
        boolean itemExists = warenkorbPage.checkIftheItemAddedExists(itemDetails);
        warenkorbPage.removeItemFromTheCart();
        assertTrue(itemExists);
    }

}
