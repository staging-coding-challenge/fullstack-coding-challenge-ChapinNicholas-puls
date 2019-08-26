# coding-challenge-requirements

Build a mini fullstack maven project Due at 3:00 pm  
Total Points: 100  
Grocery List  
Build a project that will allow for the creating of grocery lists  
Technologies
* React
* Spring
* Postgres or OracleDB RDS  
## Part 1 Implement your DB: 15 Points
Make 2 tables in your db, one for grocery list information, and one for grocery items  
* have a foreign key in grocery items that points to the primary key for grocery list
* grocery items need a type, such as food, electronics, clothing, etc. This can be done with the type directly in the grocery item or you can create a relation to a seperate table for tracking different types
* Add some dummy data
## Part 2 Implement your Model *In Spring*: 10 Points
Create a GroceryList and GroceryItem JAVABEAN that is mapped to your db tables
## Part 3 Implement your API: 20 Points
Make/implement 
* GET /grocery-lists  to find all grocery lists  
* POST /grocery-lists  to create a new grocery list
* POST /grocery-lists/items   to add a new item to a grocery list
* DELETE /grocery-lists/items/{itemId}   to remove an item from a grocery list
* DELETE /grocery-lists to delete a grocery list
* If you need to create additional enpoints you are welcome to
## Part 4 Implement your Presentation Layer *React*: 35 Points  
Create a grocery list component with a table that contains all items in the grocery list with a form for adding a new item, there should also be an option next to each item that allows you to remove items. (20 of the poitns).  

Create a grocery lists component with a table that contains all grocery lists, when you click a grocery list it should take you to the component that displays that individual grocery list. (15 of the points)
        
## Part 5 Style your view: 10 Points  
Use CSS or Bootstrap or another Styling Library to make your html pages pretty

## Part 6 Pagination: 5 points 
Paginate the endpoint for finding all grocery lists so that they do not load all at once.
## Part 7 Filtering: 5 points
Be able to filter the showing grocery lists based off of a 
## Finally:
Fully review your project code, and be able to explain it