package almosafer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import dev.failsafe.internal.util.Assert;

public class MyTestcase {
	String Url="https://www.almosafer.com/en";
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void myBefore() {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));//    اي اشي ما راح يلاقيه باستخدمها ////للا تحفظها هاي بستخدم عشان الموقع يستنى ثلاث ثاواني قبل ما تجرب يا جهاز عشان يلاقي الخيار الاول  
driver.get(Url);
driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]")).click();
	}
	@Test
	public void checktheLangusge() {
	String LanguageOfWebsite=	driver.findElement(By.tagName("html")).getAttribute("Lang");
    org.testng.Assert.assertEquals(LanguageOfWebsite, "en");

	}
	@Test
	public void currency() {
		String checkcurrency=driver.findElement(By.xpath("//img[@alt='hero-image']")).getText();
		org.testng.Assert.assertEquals(checkcurrency, "SAR");
		
	}
	@AfterTest
	public void myafterTest(){}
	

}
