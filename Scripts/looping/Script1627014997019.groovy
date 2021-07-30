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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('btn-buy-now'))

def data = findTestData('midtrans/New Test Data')

for (def rowlogin = 1; rowlogin <= data.getRowNumbers(); rowlogin++) {
    WebUI.setText(findTestObject('txt-amount'), data.getValue('amount', rowlogin))

    WebUI.setText(findTestObject('txt-name'), data.getValue('name', rowlogin))

    WebUI.setText(findTestObject('txt-email'), data.getValue('email', rowlogin))

    WebUI.setText(findTestObject('txt-phone'), data.getValue('phone', rowlogin))

    WebUI.setText(findTestObject('txt-city'), data.getValue('city', rowlogin))

    WebUI.setText(findTestObject('txt-Address'), data.getValue('address', rowlogin))

    WebUI.setText(findTestObject('txt-postal-code'), data.getValue('postal', rowlogin))

    WebUI.click(findTestObject('btn-checkout'))
	
	if (data.getValue('type', rowlogin) == 'negative') 
	
	{
		def actual = WebUI.click(findTestObject('btn-checkout'))
		
		WebUI.verifyMatch(actual, data.getValue('expected result', rowlogin), false)
	} else 
	{
		
	}


}

