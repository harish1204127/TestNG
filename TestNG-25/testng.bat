set projectLocation=F:\Selenium\workspace2\TestNG-25
F:
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml