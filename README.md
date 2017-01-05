# SeleniumBrowserConfigurator [![Release](https://jitpack.io/v/kahyalar/SeleniumBrowserConfigurator.svg)]
Configure easily your browsers for Selenium WebDriver

# Installation
It's so easy to install, just go to your pom.xml file and add these lines.

```java
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	<dependency>
	    <groupId>com.github.kahyalar</groupId>
	    <artifactId>SeleniumBrowserConfigurator</artifactId>
	    <version>v1.1</version>
	</dependency>
```  

# Usage
It's very simple to use.

Just create an object for screenshot:
```java
..
...
   WebDriver driver = new ChromeDriver();
   SeleniumBrowserConfigurator configurator = new SeleniumBrowserConfigurator(driver);
```
or you can static import to your current code!

Than use the preset methods for your own PC:
```java
maximizeBrowserForMBP13();
maximizeBrowserForMBP15();
maximizeBrowserForiMac5K();
maximizeBrowserForiMac4K();
maximizeBrowserForiMac();
maximizeBrowserForWindows();
```

For beginning i have only these methods. It can be implement a lot of like this.
```java
//Use this:
configurator.maximizeBrowserForMBP13();
//or
SeleniumBrowserConfigurator.maximizeBrowserForMBP13();
//Instead of this:
driver.manage().window().setSize(new Dimension(1280, 800));
driver.manage().window().setPosition(new Point(0, 0));
```


# Contribution

Feel free to share your ideas with me. Any new features or bug issues just let me know. 
Open source rocks!

#
