package featureLibrary;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pages.D2CCartPage;

import java.util.List;

public class D2CCartLibrary extends D2CCartPage {
    List<WebElement> elements; List<WebElement>addProtection;
    public void clickProduct(String arg0){
        setProductName(arg0);
        clickElementAction(getProductName());
        waitFor(1000);
    }
    public void clickcheckout(){
        waitFor(7000);
        clickElementAction(cartchkout);

    }
    public void clickeditcart() {

        clickElementAction(ckteditcartinordersummary);
    }
    public void cartTitletext() {

        Assert.assertEquals("Cart", cktcart.getText().trim());
    }
    public void ordersummarytext() {

        Assert.assertEquals("order summary", cktordrsumarytxt.getText().trim());
    }
    public void subtotaltext() {

        Assert.assertEquals("Total", cktSubtotalTxt.getText().trim());
    }
    public void ShippingText() {

        Assert.assertEquals("Shipping", cktShippingTxt.getText().trim());
    }
    public void clickplusiconpromo() {

        clickElementAction(cktaddpromoplusbtn);
    }
    public void promoinputfieldclickapply(String value) {

        clearValue(cktpromoinputfield);
        enterText(cktpromoinputfield, value);
        clickElementAction(cktpromoapplybtn);
    }
    public void promoplusverifyandreflected() {

        Assert.assertEquals("Your coupon was successfully applied", cktsucesfulpromomsg.getText().trim());

    }
    public void promocoderemovalandreflects() {

        String promoapplied=cktordertotalcost.getText().trim();
        String[] dollarsplit= promoapplied.split("$");
        int totalvalueafterpromoapplied = Integer.parseInt(dollarsplit[1]);

        clickElementAction(cktpromoclosebtn);
        Assert.assertEquals("Your coupon was successfully removed", cktsucesfulpromomsg.getText().trim());

        String ordertotal=cktordertotalcost.getText().trim();
        String[] splitteddollar= ordertotal.split("$");
        int totalvalue = Integer.parseInt(splitteddollar[1]);
        boolean flag=false;
        if(totalvalue<totalvalueafterpromoapplied){
            flag=true;
        }
        Assert.assertEquals(true,flag);
    }

    public void clickproceedcheckout() {

        clickElementAction(cktproceedckt);
    }
    public void clydeiconinproducttext() {

        waitFor(1000);
        Assert.assertEquals("Add product protection".trim(), cktclydeinprdctsectn.getText());

    }
    public void productwithclyde() {

        Assert.assertEquals("Add product protection", cktclydeinfullcart.getText().trim());
        clickElementAction(cktclydeinfullcart);
    }
    public void clydeplanavilable() {

        waitFor(2000);
        Assert.assertEquals("1 Year", cktclydeyearplan.getText().trim());
    }
    public void clydeframeclose() {

        clickElementAction(cktclydeframeclosebtn);
    }
    public void fullcartnavigation() {

        Assert.assertEquals("Cart".trim(), cktcart.getText());
    }
    public void clydeplaninframe() {

        clickElementAction(cktclydeinprdctsectn);
        Assert.assertEquals("", cktclydeyearplan.getText().trim());
    }
    public void addproductionplan() {
        waitFor(5000);
        driver.switchTo().frame("clyde-widget-modal-frame");
        clickElementAction(cktaddclydeprctnplnbtn);
        driver.switchTo().defaultContent();
    }
    public void selectedclydeplan() {
waitFor(2000);
        clickElementAction(cktclydeyearplan);

    }

    public void fullcartpagenavigation() {

        waitFor(2000);
        Assert.assertEquals("Cart".trim(), cktcart.getText());
    }
    public void clydereflectionfullcart() {

        Assert.assertEquals("Air Pro 1yr protection", cktselectedclydereflectsinfullcart.getText().trim());
    }
    public void clydeicon() {
        cktclydelogoinfullcart.isDisplayed();

    }
    public void quantityofclyde() {

        String clydequantity=cktclydeqtyinptfld.getAttribute("aria-label");
        String addedproductquantity=cktaddedproduct.getAttribute("aria-label");
        Assert.assertEquals(clydequantity,addedproductquantity);

    }
    public void unabletoaddmoreclyde() {
        cktclydeincrmntbtn.isDisplayed();

    }
    public void selectlessqtyclyde() {
        clickElementAction(cktclydedecrmntcbtn);

    }
    public void extendwarrantyprice() {
        Assert.assertEquals("$89.99", cktclydeprice.getText().trim());

    }
    public void clydeincheckout() {
        Assert.assertEquals("cart", cktclydeinckt.getText().trim());

    }
    public void clydeqtyincheckout() {
        Assert.assertEquals("qty", cktclydeqty.getText().trim());

    }
    public void clickplaceorder() {
        clickElementAction(cktplaceorderbtn);

    }
    public void sidecarttitletext() {
        Assert.assertEquals("Your cart", cartTitle.getText().trim());

    }
    public void visibleelementvalidationinsidecart() {
        Assert.assertEquals("The clean air you deserve", cartmktngmesgtitle.getText().trim());
        Assert.assertEquals("Total", carttotalsctn.getText().trim());
        Assert.assertEquals("Starting at 0% APR at $45/mo with", cartaffirmmessageinsidecart.getText().trim());
        Assert.assertEquals("Taxes and shipping calculated at checkout", cartshippingcosttextonsidecart.getText().trim());

    }
    public void qtyincreasedecreaseforaddedproduct() {
        clickElementAction(cartnegtvbtn);
        clickElementAction(cartincrsbtn);

    }

    public void emptyshoppingcartwithlabel() {
        clickElementAction(cartshopingcartbagbtn);
        Assert.assertEquals("Your cart is empty", cartempty.getText().trim());
        carticon.isDisplayed();

    }
    public void sidecartclose() {
        clickElementAction(cartcntnshpngbtn);

    }
    public void clickclydeprotectioninsidecart() {
        waitFor(5000);
        clickElementAction(cartclydprtcn);

    }
    public void removeAllProductsInCart(){
        waitFor(5000);
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='flex w-full flex-col']//button[@aria-label = 'Close']"));
            for (int i = 1; i <= elements.size() - 1; i++) {
                clickElementAction(elements.get(i));
                waitFor(3000);
            }
        }catch(Exception e){
        }
    }
    public void chkExpectedProductshaveWanrrenty(){
        waitFor(5000);
        elements = driver.findElements(By.xpath("//button[@aria-label = 'add the product to cart']"));
        clickElementAction(elements.get(0));
        waitFor(4000);
       addProtection=driver.findElements(By.xpath("//*[@alt='Clyde logo']/../../button"));
        Assert.assertTrue("Add Protection is not showing for when add first product",addProtection.size()==1);
        removeAllProductsInCart();
        waitFor(5000);
        clickElementAction(elements.get(1));
        waitFor(4000);
        addProtection=driver.findElements(By.xpath("//*[@alt='Clyde logo']/../../button"));
        Assert.assertTrue("Add Protection is not showing for when add two products",addProtection.size()==1);

//        List<WebElement> elements = driver.findElements(By.xpath("//button[@aria-label = 'add the product to cart']"));
//        System.out.println(elements.size());
//        for (int i=0; i<elements.size();i++){
//            if(i==1||i==2) {
//                clickElementAction(elements.get(i));
//                waitFor(6000);
//                List<WebElement>addProtection=driver.findElements(By.xpath("//*[@alt='Clyde logo']/../../button"));
//               // Assert.assertTrue("Add Protection is not showing for two products",addProtection.size()==2);
//
//            }else{
//                waitFor(6000);
//                removeAllProductsInCart();
//                clickElementAction(elements.get(i));
//                waitFor(6000);
//                List<WebElement>addProtection=driver.findElements(By.xpath("//*[@alt='Clyde logo']/../../button"));
//                Assert.assertTrue("Add Protection is  showing for unexpected products",addProtection.size()==0);
//                removeAllProductsInCart();
//            }
//            waitFor(3000);
//        }

    }
public void chkclydeprotectionplans(){
    waitFor(3000);
    clickElementAction(cktclydeyearplan);
waitFor(3000);
}
    public void selectedclydeplan2() {
        waitFor(2000);
        clickElementAction(cktclydeyearplan2);

    }
    public void chkProductProtectionAdded(){
        waitFor(6000);
       Assert.assertTrue(cktAirproProtectionTxt.isDisplayed());
        waitFor(10000);
    }
    public void chkProductProtection2Added(){
        waitFor(6000);
        Assert.assertTrue(cktAirproProtectionplan2Txt.isDisplayed());
        waitFor(3000);
    }
    public void chkProductProtectionincreaseDisabled(){
        waitFor(6000);
        Assert.assertFalse(cktAirproProtectionquantityincreasebtn.isEnabled());
        waitFor(3000);
    }
    public void chkProductProtectionincreaseEnabled(){
        waitFor(6000);
        Assert.assertTrue(cktAirproProtectionquantityincreasebtn.isEnabled());
        waitFor(3000);
    }
    public void clickOnAirProProduct(){
        clickElementAction(cktMolekuleAirProBtn);
    }

    public void verifyClyderbuttoninFullcartandSelecttionofPlan(){
       waitFor(3000);
       Assert.assertTrue(cartclydprtcn.isDisplayed());
        cartclydprtcn.click();
        waitFor(3000);


    }

}

