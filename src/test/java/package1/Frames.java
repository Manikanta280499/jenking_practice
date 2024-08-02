package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Frames {
	
	@Test
	public void framesPractice() {
		WebDriver w = new ChromeDriver();
		w.get("https://the-internet.herokuapp.com/nested_frames");
		w.switchTo().frame(1);
		System.out.println(w.findElement(By.cssSelector("body")).getText());
		w.switchTo().defaultContent();
		w.switchTo().frame(w.findElement(By.cssSelector("[name='frame-top']"))).switchTo().frame(2);
		System.out.println(w.findElement(By.cssSelector("body")).getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(false);
		w.quit();
	}
	
	

}
