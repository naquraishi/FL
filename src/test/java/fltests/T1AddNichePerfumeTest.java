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


    /*
    Test implements customer journey:
    1. User goes to Flaconi homepage
    2. User selects Herrenparfum
    3. User selects Nischenduefte
    4. User sorts the available products by price in ascending order
    5. User adds the least price product to the cart
     */
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
        assertTrue(warenkorbPage.checkIftheItemAddedExists(itemDetails));
    }

}
