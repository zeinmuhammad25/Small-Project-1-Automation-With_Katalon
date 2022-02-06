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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Home/button_buyNow'))

WebUI.setText(findTestObject('shopping_cart/input_name'), 'zein')

nama1 = WebUI.getAttribute(findTestObject('shopping_cart/input_name'), 'value')

WebUI.setText(findTestObject('shopping_cart/input_email'), GlobalVariable.email)

email1 = WebUI.getAttribute(findTestObject('shopping_cart/input_email'), 'value')

WebUI.setText(findTestObject('shopping_cart/input_phoneNumber'), '082272622766')

phoneNumber1 = WebUI.getAttribute(findTestObject('shopping_cart/input_phoneNumber'), 'value')

if (phoneNumber1.substring(0, 1) == '0') {
    //hapus 0 didepan
    phoneNumber1 = phoneNumber1.substring(1)

    //menambahkan +62 didepan
    phoneNumber1 = ('+62' + phoneNumber1)

    System.out.println(phoneNumber1)
}

WebUI.setText(findTestObject('shopping_cart/input_city'), GlobalVariable.city)

city1 = WebUI.getAttribute(findTestObject('shopping_cart/input_city'), 'value')

WebUI.setText(findTestObject('shopping_cart/input_address'), GlobalVariable.addres)

address1 = WebUI.getAttribute(findTestObject('shopping_cart/input_address'), 'value')

WebUI.setText(findTestObject('shopping_cart/input_postalCode'), GlobalVariable.postalCode)

postalCode1 = WebUI.getAttribute(findTestObject('shopping_cart/input_postalCode'), 'value')

allAddress = ((((address1 + ' ') + city1) + ' ') + postalCode1)

WebUI.click(findTestObject('shopping_cart/button_checkout'))

WebUI.click(findTestObject('order_sumarry/shippingDetail'))

nama2 = WebUI.getText(findTestObject('order_sumarry/nama_shippingDetail'))

email2 = WebUI.getText(findTestObject('order_sumarry/email_shippingDetail'))

phoneNumber2 = WebUI.getText(findTestObject('order_sumarry/phoneNumber_shippingDetail'))

address2 = WebUI.getText(findTestObject('order_sumarry/address_shippingDetail'))

System.out.println(nama1)

System.out.println(email1)

System.out.println(phoneNumber1)

System.out.println(allAddress)

System.out.println(nama2)

System.out.println(email2)

System.out.println(phoneNumber2)

System.out.println(address2)

assert(nama1 == nama2)

WebUI.closeBrowser()

