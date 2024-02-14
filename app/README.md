
## Link to forked repo: https://github.com/tomgrbz/cs4520-assignment1-starter-code


## Project Overview

This project involves basic app implementation for an android app featuring a login screen and a products listing page. Rules for how to interact the rule have been made within the `nav_graph.xml` file. There is only one action made which is the direction following a successful login with username: `admin` and password: `admin`.  If the credentials do not match, the user is prompted with a toast message stating such.

Following successful login, the user can then see a list of products, with each featuring an image, name, expiry date (if applicable), and price. Food products have a yellow background while tools have a red background, to distinguish between the two.

To get back to the login page, the user can swipe to the right, from the left side of the screen. Performing this action again, the user will then close the app.

To run this app in android studio, it has been tested on Pixel 3A on API level 34, and the generic medium sized Android at the same level. 
## Architecture

There is not much to go into detail here. There is a single main activity which sets the navigation graph for child fragments. The navigation graph has most of the movement logic in regards to navigating the app, namely that the user is prompted with the login fragment which just holds logic for checking the admin credentials are correct, to which it then uses the nav graph to emit the action to move to the Product List page. At this page the user interacts with a list of products using the Recycler view pattern, with an adapter made for creating the views of each product. 

 
