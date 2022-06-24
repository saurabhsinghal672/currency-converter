This file contains the project description and steps to run 

Project Title - CurrencyConverter

Project Description - 

I have created a TestNG project for Currency Conversion in which:

1. Src contains different packages with first being Currency converter test package which contains the class file for currency conversion which is homepage.java in which I have created a test case for conversion of currency where it takes different currency data from dataprovider and gives use the output in a text file.

2. Other package in src is currencyconverter_PO which contains the class file currencyconverter.java which contains all the webelement used in the homepage.java file

3. Other package in src folder is userdefinedlibraries which contains two class file first one is DriverSetup.java file which initiate the driver and other file is Screenshot.java file which takes the screenshot after every currency conversion.

4. Other package is outputData package which contains the data.txt which where our final currency are stored.

5. We have Web-drivers folder which contains the web driver for running the project 

6. We have screenshot folder where screenshot are captured after every conversion.

7. We have testing.xml file which controls the execution of test cases and also helpful in generating the test-output folder which contains all the test files

8. We have a pdf file of all the screenshot of code structure and outputs


Steps to run project :

1. Open the project in any IDE(I used Eclipse)
2. First add all the jar files of selenium
3. Add testNG library
4. run the testing.xml file 
5. After running the test output will be stored in data.txt file which is present in src folder output data package


