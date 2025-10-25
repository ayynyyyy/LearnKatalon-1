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
WebUI.navigateToUrl('https://www.demoblaze.com/index.html')
WebUI.click(findTestObject('Object Repository/Register/Page_STORE/a_Cart_signin2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Register/Page_STORE/input_Username_sign-username'), 5)
WebUI.setText(findTestObject('Object Repository/Register/Page_STORE/input_Username_sign-username'), '')
WebUI.setText(findTestObject('Object Repository/Register/Page_STORE/input_Password_sign-password'), '')
WebUI.delay(2)
WebUI.click(findTestObject('Register/Page_STORE/button-signup'))
// ================== VERIFIKASI ALERT ==================
WebUI.verifyAlertPresent(5) // tunggu alert muncul
def alertText = WebUI.getAlertText()
println("Alert muncul dengan teks: " + alertText)
WebUI.verifyMatch(alertText, 'Please fill out Username and Password.', false)
WebUI.acceptAlert()
WebUI.closeBrowser()
