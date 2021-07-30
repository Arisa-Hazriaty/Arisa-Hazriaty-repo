package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object actual
     
    /**
     * <p></p>
     */
    public static Object expected
     
    /**
     * <p></p>
     */
    public static Object actualObject
     
    /**
     * <p></p>
     */
    public static Object expectedObject
     
    /**
     * <p></p>
     */
    public static Object cardnumber
     
    /**
     * <p></p>
     */
    public static Object expiry
     
    /**
     * <p></p>
     */
    public static Object cvv
     
    /**
     * <p></p>
     */
    public static Object nama
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object phone
     
    /**
     * <p></p>
     */
    public static Object alamat
     
    /**
     * <p></p>
     */
    public static Object postalcode
     
    /**
     * <p></p>
     */
    public static Object phoneconvert
     
    /**
     * <p></p>
     */
    public static Object PasswordIssuingBank
     
    /**
     * <p></p>
     */
    public static Object ccinvalid
     
    /**
     * <p></p>
     */
    public static Object expiryinvalid
     
    /**
     * <p></p>
     */
    public static Object cvvinvalid
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseURL = selectedVariables['baseURL']
            actual = selectedVariables['actual']
            expected = selectedVariables['expected']
            actualObject = selectedVariables['actualObject']
            expectedObject = selectedVariables['expectedObject']
            cardnumber = selectedVariables['cardnumber']
            expiry = selectedVariables['expiry']
            cvv = selectedVariables['cvv']
            nama = selectedVariables['nama']
            email = selectedVariables['email']
            phone = selectedVariables['phone']
            alamat = selectedVariables['alamat']
            postalcode = selectedVariables['postalcode']
            phoneconvert = selectedVariables['phoneconvert']
            PasswordIssuingBank = selectedVariables['PasswordIssuingBank']
            ccinvalid = selectedVariables['ccinvalid']
            expiryinvalid = selectedVariables['expiryinvalid']
            cvvinvalid = selectedVariables['cvvinvalid']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
