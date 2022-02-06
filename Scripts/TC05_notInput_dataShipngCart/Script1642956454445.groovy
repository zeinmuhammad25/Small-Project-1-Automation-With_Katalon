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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Home/button_buyNow'))

WebUI.clearText(findTestObject('shopping_cart/input_name'))

WebUI.setText(findTestObject('shopping_cart/input_name'), ' ')

WebUI.clearText(findTestObject('shopping_cart/input_email'))

WebUI.setText(findTestObject('shopping_cart/input_email'), ' ')

WebUI.clearText(findTestObject('shopping_cart/input_phoneNumber'))

WebUI.setText(findTestObject('shopping_cart/input_phoneNumber'), ' ')

WebUI.clearText(findTestObject('shopping_cart/input_city'))

WebUI.setText(findTestObject('shopping_cart/input_city'), ' ')

WebUI.clearText(findTestObject('shopping_cart/input_address'))

WebUI.setText(findTestObject('shopping_cart/input_address'), ' ')

WebUI.clearText(findTestObject('shopping_cart/input_postalCode'))

WebUI.setText(findTestObject('shopping_cart/input_postalCode'), ' ')

WebUI.click(findTestObject('shopping_cart/button_checkout'))

WebUI.verifyElementPresent(findTestObject('Home/notification_failed'), 0)

WebUI.closeBrowser()

