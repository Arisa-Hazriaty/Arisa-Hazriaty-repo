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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('btn-buy-now'))

WebUI.click(findTestObject('btn-checkout'))

WebUI.switchToFrame(findTestObject('iframe'), 5)

WebUI.click(findTestObject('btn-continue'))

WebUI.click(findTestObject('btn-creditcard'))

WebUI.setText(findTestObject('txt-cardnumber'), GlobalVariable.cardnumber)

WebUI.setText(findTestObject('txt-expiry-date'), GlobalVariable.ccinvalid)

WebUI.setText(findTestObject('txt-cvv'), GlobalVariable.cvv)

WebUI.click(findTestObject('btn-pay-now'))

WebUI.verifyElementText(findTestObject('txt-expiry-date-warning'), 'Expiry date')

