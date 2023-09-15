package PROJECT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

@Test
public class HTML {
    public static  WebDriver driver ;


@BeforeClass
    public  void main () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        Thread.sleep(1000);
    }
@Test(priority = 1)
    public void set_Up() throws InterruptedException {

        WebElement display = driver.findElement(By.xpath("/html/body/div/h1"));

        Assert.assertTrue(display.isDisplayed());

        Thread.sleep(2000);
    }
    @Test(priority = 2)

    public void set_Up2() throws InterruptedException {


        WebElement element = driver.findElement(By.cssSelector("input[name=\"username\"]"));
        element.click();
        element.sendKeys("Selen");
        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        element2.sendKeys("012345+");
        element2.click();
        Thread.sleep(1000);

        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea"));
        element3.click();
        element3.sendKeys("Selen is on the text area...");
        Thread.sleep(1000);
    }

   /* public void choose_File() throws InterruptedException {

    WebElement file1 = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[4]/td/input[1]"));
        file1.click();
        Thread.sleep(1000);


    }*/

    @Test(priority = 3)
    public void checkbox() throws InterruptedException {
        List<WebElement> boxes = driver.findElements(By.cssSelector("input[name=\"checkboxes[]\""));
        for(int i=0 ; i<boxes.size() ; i++){



        }
        System.out.println("Boxes size : " + boxes.size());
        int actual = 3 ;
        int expected = boxes.size();

    Assert.assertEquals(expected,actual);
        Thread.sleep(1000);
//input[value="cb1"]
    }

    @Test(priority = 4)

    public void Sel(){

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        System.out.println("Second box is selected!");
    }

    @Test(priority = 5)

    public void MultiSel(){
        List<WebElement> selc = driver.findElements(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option"));
        for(int i=0 ; i<selc.size();i++){}
        System.out.println("Multi Select Size : " + selc.size());
        int expected = 4 ;
        int actual = selc.size();

        Assert.assertEquals(expected,actual);

    }
   @Test(priority = 6)

    public void Selection4() throws InterruptedException {
       WebElement multiple = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"));
       Select sel4 = new Select(multiple);
       sel4.selectByIndex(3);
       Thread.sleep(2000);

       WebElement dort = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[4]"));

       Assert.assertTrue(dort.isSelected());
   }

    @Test(priority = 7)

    public void dropdown() throws InterruptedException {
      List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select/option"));
      for(int i =0 ; i<dropdown.size() ; i++){}
      System.out.println("Dropdown size : " + dropdown.size());

      int actual = 6 ;
      int expected = dropdown.size();
      Assert.assertEquals(expected,actual);
      System.out.println("Basarili !");
      Thread.sleep(2000);

    }
    @Test(priority = 8)

    public void Selections() throws InterruptedException {

        WebElement selection = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select"));
        Select sel= new Select(selection);
        sel.selectByIndex(2);
        WebElement sel3 = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select/option[3]"));


        Thread.sleep(1000);

        Assert.assertTrue(sel3.isSelected());

        System.out.println("Secildi 3.");



    }





   }






