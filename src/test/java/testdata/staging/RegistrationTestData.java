package testdata.staging;

public class RegistrationTestData {

    //valid Registration test data (Every time need to change once used)
    public String valid_CompanyName        = "molekule";
    public String valid_First_Name         = "Photon";
    public String valid_Last_Name          = "TestLastName";
    public String valid_email              = "testPhoton@gmail.com";
    public String valid_Street_Address1    = "1 Apple Park Way";
    public String valid_Street_Address2    = "Alexandria";
    public String valid_City               = "Cupertino";
    public String valid_State              = "CA";
    public String valid_Postal_Code        = "95014";
    public String valid_Country            = "US";
    public String valid_PhoneNumber        = "12099134729";


    //invalid Registration test data
    public String invalid_State_Address1   = "qwerty";
    public String invalid_PhoneNumber   	= "2321";
    public String invalid_PostalCode   	= "123##";


    //valid quick register
    public String quick_First_Name         = "FirstName";
    public String quick_Last_Name          = "TestSample";
    public String quick_email              = "testPhoton@gmail.com";
    public String quick_Pass               = "Qwerty@123";
    public String quick_ConfirmPass        = "Qwerty@123";
    public String quick_CompanyName        = "molekule";
    public String quick_Category           = "dental";
    public String quick_PhoneNumber        = "12077920952";
    public String duplicate_Email        = "testPhoton@gmail.com";

    //billing address
    public String valid_StateBilling        = "CA";

    //credit card details
    public String valid_CardNumber  	= "4111111111111111";
    public String valid_MMYY       	= "12/23";
    public String valid_CCV  	        = "234";

    //credit card details
    public String inValid_CardNumber  	= "1234567898766789";
    public String inValid_MMYY       	= "23/34";
    public String inValid_CCV  	    = "000";
    public String inValid_Card_Less 	= "1234567898";
    public String inValid_MMYY_Less    = "12/3";
    public String inValid_CCV_Less  	= "12";


    public String invalid_First_Name	= "123##";
    public String invalid_Last_Name	= "123@@";
    public String invalid_Email	= "invalid";

    public String valid_Account_Email = "saranya.arumugam+52@Molekule.com";
    public String valid_Account_Password = "Test@1234";


}
