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

WebUI.navigateToUrl('https://app.jubelio.com/home/inventory/review')

WebUI.setText(findTestObject('Object Repository/Page_Jubelio/input_Email_email'), 'qa.rakamin.jubelio@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Jubelio/input_Password_password'), 'ES0jYv0n47daknb+JnorMg==')

WebUI.click(findTestObject('Object Repository/Page_Jubelio/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - Selamat Datang/a_Barang'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - Selamat Datang/a_Katalog'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - Selamat Datang/a_In Review'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/button_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Nama_item_group_name'), 'Naruto')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_Pilih kategori'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_Non-varian'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_Harap pilih'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Harap pilih_selectivity-search-input'), '')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_2 Man'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Merek Lainnya_brand_name'), 'Tuman')

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_SKU_item_code'), '0001')

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Barcode_barcode'), '1299')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_Normal_public-DraftStyleDefault-block p_9bef64'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/button_Pilih Gambar'))

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/button_Pilih Gambar'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Harap pilih_selectivity-search-input'), '12000')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/div_Berat Paket (Gram)_col-md-7'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_Harap pilih_selectivity-search-input'), '6')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_Jubelio - In Review/input_In Review_form-control'), 'Naruto')

WebUI.click(findTestObject('Object Repository/Page_Jubelio - In Review/span_In Review_glyphicon glyphicon-search'))

