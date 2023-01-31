package com.HRManet.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
WebDriver ldriver;


public AdminPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}

@FindBy(xpath="//a[@class='oxd-main-menu-item active']//span[1]")
WebElement ClickonAdmin;

@FindBy(xpath="//button[normalize-space()='Add']")
WebElement ClickAddBtn;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
WebElement SelectUserRole;








}
