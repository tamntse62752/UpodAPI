import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('Get Agency by AgencyID'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'ObjReturn.agency_id', '3')

WS.verifyElementPropertyValue(response, 'ObjReturn.agency_name', 'Passio 47 TCV')

WS.verifyElementPropertyValue(response, 'ObjReturn.agency_address', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(response, 'ObjReturn.agency_phone', '058238756')

WS.verifyElementPropertyValue(response, 'ObjReturn.company_name', 'Passio')

WS.verifyElementPropertyValue(response, 'ObjReturn.agency_username', 'lehongan')

WS.verifyElementPropertyValue(response, 'ObjReturn.is_delete', false)

