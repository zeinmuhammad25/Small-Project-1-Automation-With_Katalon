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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Home/button_buyNow'))

WebUI.setText(findTestObject('shopping_cart/input_name'), GlobalVariable.nama)

WebUI.setText(findTestObject('shopping_cart/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('shopping_cart/input_phoneNumber'), GlobalVariable.phonenumber)

WebUI.setText(findTestObject('shopping_cart/input_city'), GlobalVariable.city)

WebUI.setText(findTestObject('shopping_cart/input_address'), GlobalVariable.addres)

WebUI.setText(findTestObject('shopping_cart/input_postalCode'), GlobalVariable.postalCode)

WebUI.click(findTestObject('shopping_cart/button_checkout'))

WebUI.click(findTestObject('order_sumarry/shippingDetail'))

WebUI.closeBrowser()

