# Amazon Automation Portfolio Project

This is a complete test automation project developed for portfolio purposes using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.  
It performs UI automation testing on [Amazon.ca](https://www.amazon.ca) to simulate real-world e-commerce testing scenarios.

---

## ✅ Features

- Product search and result verification
- Product detail inspection
- Add to cart functionality
- Cart verification
- Basic UI checks (homepage title, logo, etc.)
- Utility functions for reusability
- TestNG XML suite execution

---

## 🧪 Tech Stack

- **Java 19**
- **Selenium WebDriver 4.20**
- **TestNG 7.9**
- **Maven** (for build and dependency management)
- **ChromeDriver** for browser automation
- **Page Object Model** design pattern
- **Java Streams & List usage** for product list validations

---

AmazonProject/
├── src/test/java/
│   ├── pages/
│   │   ├── HomePage.java  
│   │   ├── SearchResultsPage.java  
│   │   ├── ProductPage.java  
│   │   ├── CartPage.java  
│   │   └── BasePage.java  
│   ├── tests/
│   │   ├── HomePageTest.java  
│   │   ├── SearchProductTest.java  
│   │   ├── ProductDetailsTest.java  
│   │   └── AddToCartTest.java  
│   └── utils/
│       ├── DriverFactory.java  
│       └── ConfigReader.java  
├── config.properties  
├── pom.xml  
├── testng.xml  
└── README.md


---

## ⚙️ How to Run

1. Clone the repo  
   `git clone https://github.com/iamenesaydogdu/amazon-automation-project.git`

2. Open in IntelliJ IDEA or any Java IDE

3. Run using TestNG:  
   - Right-click `testng.xml` > Run

4. Make sure ChromeDriver version matches your Chrome browser.

---

## ⚠️ Important Note

> **Amazon.ca actively uses CAPTCHA and bot detection mechanisms.**  
> This may block or interrupt automated test execution during runtime.  
> The tests are written based on expected user flows and are for showcasing automation skills — **not for full production-level testing** on Amazon.

---

## 📌 Disclaimer

This project is intended strictly for learning and portfolio demonstration.  
No commercial or real-world data scraping is involved.

---

## 🧑‍💻 Author

**Enes Aydogdu**  
[GitHub Profile](https://github.com/iamenesaydogdu)
