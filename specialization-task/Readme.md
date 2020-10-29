# Syberry-Academy-Technical-Interview-Specialization-Java

## Project setup
### Lombok annotations
1. Go to Settings (Ctrl + Alt + S) > Plugins
2. Click Marketplace
3. Search for "Lombok"
4. Choose Lombok Plugin
5. Install
6. Restart IntelliJ
7. Go to Settings (Ctrl + Alt + S) > Other settings
8. Select Lombok plugin
9. Click on 'Enable Lombok plugin for this project' checkbox

### Application properties
1. Go to Project Structure (Ctrl + Alt + Shift + S)
2. Set `Project SDK` to 11
3. Set `Project language level` to `11 - Local variable syntax for lambda parameters`

### Maven 
1. Go to top navigation bar, select `View` > `Tools` > `Maven`
2. Press `Refresh` button to upload all dependencies
![RefreshButton](https://i.imgur.com/WBHFw6t.png)



## Task
1. Implement `firstCustomer` function from `com.syberry.demo.controller.CustomerController`
to create and save a customer. 
2. Use `findFirst` method from `com.syberry.demo.repository.CustomerRepository`.
3. Create a signature for method that needed to connect Repository and Controller`com.syberry.demo.service.CustomerService`
4. Implement method created previously in `com.syberry.demo.service.CustomerServiceImpl`, you can take `findAll` method as an example.
5. Run your code by sending `Get Request` via your browser of choice or `Postman` to `localhost:8080/customer` to see the data of needed `Customer`
6. Implement `createCustomer` function from `com.syberry.demo.controller.CustomerController`
to create and save a customer. 
7. Use `save` method from `com.syberry.demo.repository.CustomerRepository`.
8. Create a signature for method that needed to connect Repository and Controller`com.syberry.demo.service.CustomerService`
9. Implement method created previously in `com.syberry.demo.service.CustomerServiceImpl`, you can take `save` method as an example.
10. Run your code by sending `Post` via your browser of choice or `Postman` to `localhost:8080/customer/{name}` and confirm no errors in console or browser.

Note : `com.syberry.demo.repository.CustomerRepository` and `com.syberry.demo.DemoApplication` classes should not be changed
