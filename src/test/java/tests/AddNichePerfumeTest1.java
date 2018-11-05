package tests;
import flaconipages.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import utils.FluentLeniumTest;

import static junit.framework.TestCase.assertTrue;


public class AddNichePerfumeTest1 extends FluentLeniumTest {

    @Page
    private HomePage homePage;

    @Page
    private ParfumPage parfumPage;

    @Page
    private HerrenParfumPage herrenParfumPage;

    @Page

    private NischenDueftePage nischenDueftePage;

    @Page
    private AddToKartPage addToKartPage;

    @Page
    private WarenkorbPage warenkorbPage;

    @Test
    public void test1() {
        homePage.go();
        homePage.parfumPageSelection();
        parfumPage.herrenParfumSelection();
        herrenParfumPage.nischenDüfteSelection();
        nischenDueftePage.niedrigsterOptionSelection();
        String itemDetails =  nischenDueftePage.addItemName();
        nischenDueftePage.niedrigsterParfumSelection();
        addToKartPage.addToCartClick();
        addToKartPage.viewCartClick();
        assertTrue(warenkorbPage.checkIftheItemAddedExists(itemDetails));
    }

    @Test
    public void test2() {
        nischenDueftePage.go();
        nischenDueftePage.niedrigsterOptionSelection();
        String itemDetails =  nischenDueftePage.addItemName();
        nischenDueftePage.niedrigsterParfumSelection();
        addToKartPage.addToCartClick();
        addToKartPage.viewCartClick();
        assertTrue(warenkorbPage.checkIftheItemAddedExists(itemDetails));
    }

}
