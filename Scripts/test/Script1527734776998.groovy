import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ultimateqa.com/filling-out-forms/')

WebUI.setText(findTestObject('input_et_pb_contact_name_1'), 'Alan Chan')

WebUI.setText(findTestObject('textarea_et_pb_contact_message'), 'Hello World ')

WebUI.click(findTestObject('button_Submit'))

WebUI.verifyElementPresent(findTestObject('p_Form filled out successfully'), 5)

WebUI.setText(findTestObject('input_et_pb_contact_name_1'), 'Alan 2')

WebUI.setText(findTestObject('textarea_et_pb_contact_message'), 'Hello World 2')

def captcha = WebUI.getText(findTestObject('Object Repository/equation'))

def result = Eval.me(captcha)

result = result.toString()

WebUI.setText(findTestObject('Object Repository/input_et_pb_contact_captcha_1'), result)

WebUI.click(findTestObject('button_Submit'))

WebUI.verifyElementPresent(findTestObject('p_Success'), 5)

