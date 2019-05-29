package SeleliumBacis;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindAllLinks{
	public <WebDriver> void main(String args[]) {
	 
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vasanthi\\Downloads\\chromedriver_win32.exe");

driver.get("https://www.html.am/templates/downloads/bryantsmith/greencreative/");
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
List<WebElement> links=driver.findElements(By.xpath("//a"));
//System.out.println(links);
int j=links.size();
for(int i=0;i<j;i++)
{
	System.out.println(links.get(i).getText());
	
	//System.out.println("test");
}//System.out.println("count" + links);


//System.out.println();
	
}


}