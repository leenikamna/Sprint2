#Author: Leena Nikam
@Asainpaint
#for Comment
Feature: Asaianpaint


#01 Scenario
@Successful_open_Asianpaint_web_page
Scenario: Successful open Asianpaint web page
Given User is on Asaianpaint webpage
When user wants to buy product from shop asianpaint webpage
Then navigate to welcome page and display all products 

#02 Scenario
 @Check_Shop_functionality
Scenario: Check the Shop functionality on Asainpaint webpage
Given User is on Asianpaint webpage
When user hover on Shop for explore new functions
Then navigate to all option under Shop

 #03Scenario
 @Mask&PPE
Scenario: Click on Mask and PPE kit
Given  is on Asianpaint webpage         
When click on Mask and PPE
Then navigate to next window

#04 Scenario
 @Mask&PPE_Kit_filters
Scenario: Select filter option 
Given Asainpaint website is opened
When user click on filters to select desire product
Then display all filters available for Mask and PPE kit

#05 Scenario
 @Colour_Selection_Tool
Scenario: Click on Colour Selection Tool on Shop Webpage
Given User is on Asianpaint_shop webpage
When choose different colour selection tool
Then select product from colour selection Tool on Shop function
 
#06 Scenario
 @Colour_Selection_Tool
Scenario: Click on Colour Selection Tool on Shop Webpage
Given User is on Asianpaint_shop webpage
When choose different colour selection tool
Then select product from colour selection Tool on Shop function

#07 Scenario
 @Customer_Policy&FAQ
Scenario: Click on Customer Policy & FAQ on Asianpaint webpage
Given User is on Asianpaint webpage_Shop
When user wants to solve queries regarding product details
Then cilck on Customer policy and FAQ 
Then display options for custmore's queries

#08 Scenario
@Peel_and_Stick
Scenario: Click on Peel & Stick
Given User is on Asianpaint webpage_Shop functionality
When user select peel and stick 
Then all available product on  webpage should  display
Then select filter option from Product_Colour_Price



 