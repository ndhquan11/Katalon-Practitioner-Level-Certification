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

// Khởi chạy trình duyệt và truy cập trang demo CURA Healthcare
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Mở thanh menu và chuyển đến trang đăng nhập
WebUI.click(findTestObject('Page_CURA Healthcare Service/i_fa fa-bars'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Login'))

// Điền username và mật khẩu dạng clear text bằng WebUI.setText để tránh lỗi IllegalBlockSizeException
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_1'), username)

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_1'), password)

// Thực hiện đăng nhập
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_btn-login'))

