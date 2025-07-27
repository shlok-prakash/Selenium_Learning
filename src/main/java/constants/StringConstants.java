package constants;

public class StringConstants {

    public static String locatorsUrl = ("https://rahulshettyacademy.com/locatorspractice/");
    public static String orangeHrmLoginUrl = ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    public static String JqueryUrl = ("https://jqueryui.com/");
    public static String fileUploadUrl = ("https://demo.automationtesting.in/FileUpload.html");
    public static String AutomationPracticeRahulShetty = ("https://rahulshettyacademy.com/AutomationPractice/");
    public static String flightBookingDropDowns = ("https://rahulshettyacademy.com/dropdownsPractise/");
    public static String PractisePageRahulShetty = ("https://rahulshettyacademy.com/AutomationPractice/");
    public static String PractiseAngularPageRahulShetty = ("https://rahulshettyacademy.com/angularpractice/");
    public static String greenKartRahulShetty = ("https://rahulshettyacademy.com/seleniumPractise/#/");
    public static String loginPracticeRahulShetty = ("https://rahulshettyacademy.com/loginpagePractise/");
    public static String herokuappUrl = ("https://the-internet.herokuapp.com/");
    public static String Amazon = ("https://www.amazon.in/");






    public static String xPath(String value, String Startergy){
        if(Startergy.equals("xPath")) {
            String xPath = "//input[@placeholder='REPLACE']";
            return xPath.replace("REPLACE",value);
        }else if (Startergy.equals("byText")){
            String byText = "//*[text()= 'REPLACE']";
            return byText.replace("REPLACE",value);
        }
        return "Not Found";
    }
}
