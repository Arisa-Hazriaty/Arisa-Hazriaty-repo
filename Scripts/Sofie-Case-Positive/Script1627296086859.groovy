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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

def data = findTestData('midtrans-sofie/midtransSofie')

//1 itu kita ngambil data dari baris pertama
//row login lebih kecil atau sama dengan data (excel)
for (def rowlogin = 1; rowlogin <= data.getRowNumbers(); rowlogin++) {
	
    WebUI.click(findTestObject('btn-buy-now'))

    WebUI.clearText(findTestObject('txt-amount'))

    WebUI.clearText(findTestObject('txt-name'))

    WebUI.clearText(findTestObject('txt-email'))

    WebUI.clearText(findTestObject('txt-phone'))

    WebUI.clearText(findTestObject('txt-city'))

    WebUI.clearText(findTestObject('txt-address'))

    WebUI.clearText(findTestObject('txt-postal-code'))

    WebUI.setText(findTestObject('txt-amount'), data.getValue('amount', rowlogin))

    WebUI.setText(findTestObject('txt-amount'), data.getValue('amount', rowlogin))

    WebUI.setText(findTestObject('txt-name'), data.getValue('name', rowlogin))

    WebUI.setText(findTestObject('txt-email'), data.getValue('email', rowlogin))

    WebUI.setText(findTestObject('txt-phone'), data.getValue('phone', rowlogin))

    WebUI.setText(findTestObject('txt-city'), data.getValue('city', rowlogin))

    WebUI.setText(findTestObject('txt-address'), data.getValue('address', rowlogin))

    WebUI.setText(findTestObject('txt-postal-code'), data.getValue('postal', rowlogin))

    WebUI.click(findTestObject('btn-checkout'))

    WebUI.switchToFrame(findTestObject('iframe'), 15)

    WebUI.click(findTestObject('Tab-ShippingDetails'))

    WebUI.click(findTestObject('lbl-order-details'))

    WebUI.click(findTestObject('btn-continue'))

    WebUI.click(findTestObject('btn-creditcard'))

    WebUI.setText(findTestObject('txt-cardnumber'), data.getValue('card_number', rowlogin))

    WebUI.setText(findTestObject('txt-expiry-date'), data.getValue('expiry_date', rowlogin))

    WebUI.setText(findTestObject('txt-cvv'), data.getValue('cvv', rowlogin))

    WebUI.verifyElementClickable(findTestObject('chx-pot-10-persen'))

    if (data.getValue('promo', rowlogin) == 'A') {
        WebUI.check(findTestObject('chx-pot-10-rupiah'))
    } else if (data.getValue('promo', rowlogin) == 'B') {
        WebUI.check(findTestObject('chx-pot-10-persen'))
    }
    
    WebUI.click(findTestObject('btn-pay-now'))

    WebUI.switchToFrame(findTestObject('iframe - IssuingBank'), 3)

    WebUI.setText(findTestObject('txt-password-issuingBank'), data.getValue('password', rowlogin))

    WebUI.click(findTestObject('btn-ok-issuingBank'))
	WebUI.verifyElementPresent(findTestObject('div_Transaction successful'), 0)
	
	WebUI.verifyElementVisible(findTestObject('lbl-status-transaction'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.enableSmartWait()
    WebUI.switchToDefaultContent()

    //	membandingkan aktual & expect
    WebUI.verifyMatch(popup_success_transaction, data.getValue('expected_result', rowlogin), false)
}

