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

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/Login/Page_STORE/a_Cart_login2'))

WebUI.click(findTestObject('Object Repository/Login/Page_STORE/input_Username_loginusername'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_STORE/input_Password_loginpassword'), '47DYSB9zq5U=')

WebUI.click(findTestObject('Object Repository/Login/Page_STORE/button_Close_btn btn-primary'))

WebUI.verifyAlertPresent(5)

def alertText = WebUI.getAlertText()

println('Isi alert: ' + alertText)

WebUI.verifyMatch(alertText, 'Please fill out Username and Password.', false)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Login/Page_STORE/input_Username_loginusername'), 'testingdemo95')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_STORE/input_Password_loginpassword'), '47DYSB9zq5U=')

WebUI.click(findTestObject('Object Repository/Login/Page_STORE/div_Sign up_logInModal'))

WebUI.click(findTestObject('add-to-cart/Page_STORE/a_Cart_login2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_STORE/input_Password_loginpassword'), '47DYSB9zq5U=')

WebUI.click(findTestObject('Object Repository/Login/Page_STORE/button_Close_btn btn-primary'))

WebUI.verifyAlertPresent(5)

alertText = WebUI.getAlertText()

println('Isi alert: ' + alertText)

WebUI.verifyMatch(alertText, 'Wrong password.', false)

WebUI.acceptAlert()

WebUI.closeBrowser()

