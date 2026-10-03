import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.callTestCase(findTestCase('Login flow'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('CURA Healthcare Service')

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_radio_program_medicaid'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/div_input-group-addon'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), 'no comment')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_btn-book-appointment'))

WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

