import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1. Login/1.1 Login Successfully'), [:], FailureHandling.STOP_ON_FAILURE)

Backpack = findTestObject('YourCartRepository/Backpack')

Tshirt = findTestObject('YourCartRepository/Tshirt')

Cart = findTestObject('YourCartRepository/Cart')

BackpackInCart = findTestObject('YourCartRepository/BackpackCart')

TshirtInCart = findTestObject('YourCartRepository/TshirtCart')

ButtonCheckout = findTestObject('YourCartRepository/Checkout')

ExpectBackpackInCart = 'Sauce Labs Backpack'

ExpectTshirtInCart = 'Sauce Labs Bolt T-Shirt'

ExpectUrl = 'https://www.saucedemo.com/cart.html'

WebUI.click(Backpack)

WebUI.click(Tshirt)

WebUI.click(Cart)

GetUrl = WebUI.getUrl()

ActualBackpackCart = WebUI.getText(BackpackInCart)

ActualThisrtCart = WebUI.getText(TshirtInCart)

WebUI.verifyMatch(GetUrl, ExpectUrl, true)

WebUI.verifyMatch(ActualBackpackCart, ExpectBackpackInCart, true)

WebUI.verifyMatch(ActualThisrtCart, ExpectTshirtInCart, true)

WebUI.verifyElementClickable(ButtonCheckout)

