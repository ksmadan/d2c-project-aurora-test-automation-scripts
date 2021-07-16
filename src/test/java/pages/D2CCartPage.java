package pages;

import base.GenericWrappers;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class D2CCartPage extends GenericWrappers {

    public D2CCartPage() {
        PageFactory.initElements(driver, this);
    }

    //sidecart
    @FindBy(how = How.XPATH, using = "//*//div//h2[text()='Your cart']")
    public static WebElement cartTitle;
    @FindBy(how = How.XPATH, using = "//p[contains (text(),'The clean air you deserve.')]")
    public static WebElement cartmktngmesgtitle;
    @FindBy(how = How.XPATH, using = "//*[text()='Your cart']/..//button")
    public static WebElement cartclosebtn;
    @FindBy(how = How.XPATH, using = "//span/label/input")
    public static WebElement cartradiobtn;
    @FindBy(how = How.XPATH, using = "//span[text() = 'This is a gift']")
    public static WebElement cartgifttext;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='gift_name']/img")
    public static WebElement cartgifticon;
    @FindBy(how = How.XPATH, using = "//div[@class='flex justify-between relative']/h4")
    public static WebElement cartaddedproduct;
    @FindBy(how = How.XPATH, using = "//div/p[@class='text-sm leading-5 mt-2 font-primary-font-light sc-includes']")
    public static WebElement cartadditionalprdctinfo;
    @FindBy(how = How.XPATH, using = "//div[@class='justify-start flex items-center mt-1']")
    public static WebElement cartlabelwithcndtninfoicon;
    @FindBy(how = How.XPATH, using = "//div[@class='flex flex-col absolute right-0 top-0']")
    public static WebElement cartproductprice;
    @FindBy(how = How.XPATH, using = "//div//p[contains(text(), 'Discount')]/..")
    public static WebElement cartdscnt;
    @FindBy(how = How.XPATH, using = "//h4[text()='Molekule Air Purifier']/../..//*[@aria-label='Close']")
    public static WebElement cartprdctclosebtn;
    @FindBy(how = How.XPATH, using = "//*//div//button[@aria-label='side_cart_qty Decrease quantity by one']")
    public static WebElement cartnegtvbtn;
    @FindBy(how = How.XPATH, using = "//*//div//button[@aria-label='side_cart_qty Increase quantity by one']")
    public static WebElement cartincrsbtn;
    @FindBy(how = How.XPATH, using = "//h4[text()='Molekule Air Pro']/../..//*[@name='product_quantity']")
    public static WebElement cartprdctqtyinptfld;
    @FindBy(how = How.XPATH, using = "//*[@alt='Clyde logo']/../../button")
    public static WebElement cartclydprtcn;
    @FindBy(how = How.XPATH, using = "//div//p[contains(text(), 'Total')]")
    public static WebElement carttotalsctn;
    @FindBy(how = How.XPATH, using = "//div//span[contains(text(), 'Checkout')]")
    public static WebElement cartchkout;
    @FindBy(how = How.XPATH, using = "//div//p[contains(text(), 'Taxes and shipping calculated at checkout.')]")
    public static WebElement cartshpngmesgeatsidecart;
    @FindBy(how = How.XPATH, using = "//*//p[text()='Starting at 0% APR at $45/mo with ']")
    public static WebElement cartaffirmmessageinsidecart;
    @FindBy(how = How.XPATH, using = "//div/p[text()='Taxes and shipping calculated at checkout.']")
    public static WebElement cartshippingcosttextonsidecart;


    //empty shooping cart
//    @FindBy(how = How.XPATH, using = "//*//span[text()='Get Molekule Air Pro']")
//    public static WebElement cartaddproduct;
    @FindBy(how = How.XPATH, using = "//*//p[text()='Your cart is empty']")
    public static WebElement cartempty;
    @FindBy(how = How.XPATH, using = "//*//img[@alt='cart_icon']")
    public static WebElement carticon;
    @FindBy(how = How.XPATH, using = "//*//span[text()='Continue shopping']")
    public static WebElement cartcntnshpngbtn;
    @FindBy(how = How.XPATH, using = "//*//button[@title='cart bag']")
    public static WebElement cartshopingcartbagbtn;


    //clyde integration
    @FindBy(how = How.XPATH, using = "//*[@alt='Clyde logo']/../../button")
    public static WebElement cartclydeinprdctsectn;
    @FindBy(how = How.XPATH, using = "//*//a[@id='clyde-logo-link']")
    public static WebElement cartclydelogoiniframe;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]")
    public static WebElement cartaddedclydeprctnincart;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]/..//button[@aria-label='decrease quantity by one']")
    public static WebElement cartclydedecrmntcbtn;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]/..//button[@aria-label='increase quantity by one']")
    public static WebElement cartclydeincrmntbtn;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]/..//input[@aria-label='null dropdown']")
    public static WebElement cartclydeqtyinptfld;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]")
    public static WebElement cartaddedclydeprctninckt;



    //strike though pricing
    @FindBy(how = How.XPATH, using = "//h4[text()='Molekule Air Pro']/..//span[@class='mk-strike relative']")
    public static WebElement cartstrikethroghprce;
    @FindBy(how = How.XPATH, using = "//h4[text()='Molekule Air Pro']/..//span[@class='mk-strike relative']/../..//div[@class='flex justify-end text-base font-primary-font-regular']")
    public static WebElement cartaftrstrkthrghprcdscnt;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]")
    public static WebElement cartaddedclydeprotctnincart;


    //MVP PDP
    @FindBy(how = How.XPATH, using = "//*//main//h2[contains (text(), 'Molekule')]")
    public static WebElement cartindvidulprdct;
    @FindBy(how = How.XPATH, using = "//*//main//h2[contains (text(), 'Molekule')]")
    public static WebElement cartpartaccesrs;


    //ordersummary fullcartpage
    @FindBy(how = How.XPATH, using = "//*//h2[text()='Order summary']/..//p[text()='Edit cart']")
    public static WebElement ckteditcartinordersummary;
    @FindBy(how = How.XPATH, using = "//*//h1[text()='Cart']")
    public static WebElement cktcart;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Subtotal')]")
    public static WebElement cktSubtotalTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Shipping']")
    public static WebElement cktShippingTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Tax']")
    public static WebElement cktTaxTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Discount']")
    public static WebElement cktDiscountTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Order total']")
    public static WebElement cktOrderTotalTxt;
    @FindBy(how = How.XPATH, using = "//*//p[text()='Molekule Air Pro']/../../..//span[@class='mk-strike relative']")
    public static WebElement cktstrikethroghprce;
    @FindBy(how = How.XPATH, using = "//*//p[text()='Molekule Air Pro']/../../..//button[@aria-label='Close']")
    public static WebElement cktprdcrremvbtn;
    @FindBy(how = How.XPATH, using = "//*//h2[text()='Order summary']")
    public static WebElement cktordrsumarytxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Promo code']")
    public static WebElement cktPromoCodeTxt;
    @FindBy(how = How.XPATH, using = "//*//span[@id='addpromo']")
    public static WebElement cktaddpromoplusbtn;
    @FindBy(how = How.XPATH, using = "//*//span[text() = 'Remove']/..")
    public static WebElement cktremovepromobtn;
    @FindBy(how = How.XPATH, using = "//*//p[text()='This is a gift']/..")
    public static WebElement cktgiftmsgtxt;
    @FindBy(how = How.XPATH, using = "//*//span[text()='Proceed to checkout']/..")
    public static WebElement cktproceedckt;
    @FindBy(how = How.XPATH, using = "//*//span[@id = 'promo_code_minus']")
    public static WebElement cktpromominusbtn;
    @FindBy(how = How.XPATH, using = "//*//span[@id = 'promo_code_close']")
    public static WebElement cktpromoclosebtn;
    @FindBy(how = How.XPATH, using = "//*//div[@class='flex justify-between w-full mb-4']/p[2]")
    public static WebElement cktordertotalcost;


    //UI add order summary section
    @FindBy(how = How.XPATH, using = "//*/div[text()='Item']")
    public static WebElement cktprdctsectn;
    @FindBy(how = How.XPATH, using = "//*//input[@id='promocode_input']")
    public static WebElement cktpromoinputfield;
    @FindBy(how = How.XPATH, using = "//*//span[text() = 'Apply']/..")
    public static WebElement cktpromoapplybtn;
    @FindBy(how = How.XPATH, using = "//*//p[@aria-role='alert']")
    public static WebElement cktsucesfulpromomsg;


    //clyde in fullcart
    @FindBy(how = How.XPATH, using = "//*[@alt='Clyde logo']/../../button")
    public static WebElement cktclydeinprdctsectn;
    @FindBy(how = How.XPATH, using = "//*//div//img[@alt='Clyde logo']")
    public static WebElement cktclydelogoinfullcart;
    @FindBy(how = How.XPATH, using = "//*//div[@class='plandata-tab__bullets']/..//button[text()='Add protection plan']")
    public static WebElement cktaddclydeprctnplnbtn;
    @FindBy(how = How.XPATH, using = "//*//button[@id='close-btn']")
    public static WebElement cktclydeframeclosebtn;
    @FindBy(how = How.XPATH, using = "//*//p[contains (text(), 'HOU')]")
    public static WebElement cktclydeincarttxt;
    @FindBy(how = How.XPATH, using = "//*//div/button[@aria-label='clyde_desktop_qty Decrease quantity by one']")
    public static WebElement cktclydedecrmntcbtn;
    @FindBy(how = How.XPATH, using = "//*//div/button[@aria-label='clyde_desktop_qty Increase quantity by one']")
    public static WebElement cktclydeincrmntbtn;
    @FindBy(how = How.XPATH, using = "//*//input[@name='clyde_desktop_qty']")
    public static WebElement cktclydeqtyinptfld;
    @FindBy(how = How.XPATH, using = "//*//input[@name='Molekule Air Pro']")
    public static WebElement cktaddedproduct;
    @FindBy(how = How.XPATH, using = "//*//div[@id='options']//h3[text()='1 Year']")
    public static WebElement cktclydeyearplan;
    @FindBy(how = How.XPATH, using = "//*//div[@id='options']//h3[text()='2 Year']")
    public static WebElement cktclydeyearplan2;
    @FindBy(how = How.XPATH, using = "//div/div[2]/div/div/div[2]/div[2]/div/button")
    public static WebElement cktclydeyearplanclose;
//    @FindBy(how = How.XPATH, using = "//*//div[@aria-label='Molekule Air Pro']/img")
//    public static WebElement cktclydelogoinfullcart;
    @FindBy(how = How.XPATH, using = "//*//div//span[@class='md:font-bold'][text()='$89.99']")
    public static WebElement cktclydeprice;
    @FindBy(how = How.XPATH, using = "//*//div[@class='flex mt-0 md:mt-6']//p[@class='font-secondary-font-regular lg:text-xl leading-6']")
    public static WebElement cktclydeinckt;
    @FindBy(how = How.XPATH, using = "//*//div[@class='flex mt-0 md:mt-6']//p/span[@aria-label='quantity']")
    public static WebElement cktclydeqty;
    @FindBy(how = How.XPATH, using = "//*//div//button/span[text()='Place order']")
    public static WebElement cktplaceorderbtn;
    @FindBy(how = How.XPATH, using = "//*//div[@class='mt-6']//button")
    public static WebElement cktclydeinfullcart;
    @FindBy(how = How.XPATH, using = "//*//div//p[text()='Air Pro 1yr protection']")
    public static WebElement cktselectedclydereflectsinfullcart;
    @FindBy(how = How.XPATH, using = "//*[text() = 'Air Pro 1yr protection']")
    public static WebElement cktAirproProtectionTxt;
    @FindBy(how = How.XPATH, using = "//*[text() = 'Air Pro 2yr protection']")
    public static WebElement cktAirproProtectionplan2Txt;
    @FindBy(how = How.XPATH, using = "//*[@aria-label='clyde_mobile_qty Increase quantity by one']")
    public static WebElement cktAirproProtectionquantityincreasebtn;
    @FindBy(how = How.XPATH, using = "//*//span[text()='']")
    private static  WebElement cartaddproduct;
    @FindBy(how = How.XPATH, using = "//button/span[contains(text(), 'Get Molekule Air Pro')]")
    public static WebElement cktMolekuleAirProBtn;

//    public WebElement setProductName(String productName){
//        return driver.findElement(By.xpath("//*//span[text()='"+productName+"']"));
//    }

    public WebElement getProductName(){
        return cartaddproduct;
    }

    public void setProductName(String arg0){
        this.cartaddproduct=driver.findElement(By.xpath("//*//span[text()='"+arg0+"']"));
    }
//    public WebElement getclydeplan(){
//        return cktclydeyearplan;
//    }
//
//    public void setclydeplan(String arg0){
//        this.cktclydeyearplan=driver.findElement(By.xpath("//*//div[@id='options']//h3[text()='"+arg0+"']"));
//    }

}


