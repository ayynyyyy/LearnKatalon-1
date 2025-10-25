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

WebUI.callTestCase(findTestCase('TC-Login/Positif-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add-to-cart/Page_STORE/a_360_hrefch'))

WebUI.verifyElementText(findTestObject('Object Repository/add-to-cart/Page_STORE/h2_Cart_name'), 'Nokia lumia 1520')

WebUI.click(findTestObject('Object Repository/add-to-cart/Page_STORE/a_Product description_btn btn-success btn-lg'))

WebUI.verifyAlertPresent(5)

def alertText = WebUI.getAlertText()
println("Alert muncul dengan isi: " + alertText)

WebUI.verifyMatch(alertText, 'Product added.', false)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/add-to-cart/Page_STORE/a_(current)_cartur'))

WebUI.click(findTestObject('Object Repository/add-to-cart/Page_STORE/td'))

WebUI.verifyElementText(findTestObject('Object Repository/add-to-cart/Page_STORE/td'), 'Nokia lumia 1520')

