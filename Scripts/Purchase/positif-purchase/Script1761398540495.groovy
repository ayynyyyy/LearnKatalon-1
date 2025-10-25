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

WebUI.callTestCase(findTestCase('TC-Add-to-cart/opsitif-addtocart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Purchase/Page_STORE/a_(current)_nav-link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase/Page_STORE/button_Total_btn btn-success'), 0)

WebUI.click(findTestObject('Object Repository/Purchase/Page_STORE/button_Total_btn btn-success'))

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_Name_name'), 'siti aminah')

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_Country_country'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_City_city'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_Credit card_card'), '0878654321')

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_Month_month'), '12')

WebUI.setText(findTestObject('Object Repository/Purchase/Page_STORE/input_Year_year'), '2024')

WebUI.click(findTestObject('Object Repository/Purchase/Page_STORE/button_Close_btn btn-primary_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Purchase/Page_STORE/h2'), 'Thank you for your purchase!')

WebUI.click(findTestObject('Object Repository/Purchase/Page_STORE/button_Cancel_confirm btn btn-lg btn-primary'))

