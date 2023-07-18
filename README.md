# AutomationAssessment

# Prerequisities

1.Download and install java version java version "20.0.1" 2023-04-18

2.Download and install Eclipse IDE 

3.Download selenium version version latest and extract a targeted directory.

4.Create a maven project in IDE

5.Addeed maven dependency like(testng,selenium,apace poi,commons.io,)in pom.xml.

5.Start writting the code.

6.Convert project into Testng.

6.Update Testng.xml file

# Set up the Prpject

1.To download the repository do the following command
git clone
 
 https://github.com/Sadiaam/AutomationAssessment.git

2.Import selenium all jar and related file to the project module

3.Chrome driver should be ensured in the src/main file.

4.Sometimes advertisements appear in the project.To block them,you need to use the Ad blocker .crx file in the chrome driver option.

# Automation Test Flow

1.open url in chrome browser

2.Verify Home page is displayed

3.View product

3.Add to cart product

4.Verify cart page is displayed

5.Proceed to checkout

5.Register

6.Login 

7.Review address detail

8.place order

9.payment 

10.Confirm order

## Run Project
Project must be run from testng.xml from src/test/resources and follow the test flow that was mentioned in the previous section.

## Improvement
There is a problem with my script. I attempted to add a product to the cart, an advertisement popup appeared. I have tried every solution I could find online, but the pop-up has always appeared. Perhaps while executing my script individually or in the testing suite, they were successful since I personally closed the pop-up ad right away.
