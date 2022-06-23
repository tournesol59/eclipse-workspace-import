fred: in the original configuration there were  up to 5 files

model\Customer.java  the encapsulated object (bean)

service\CustomerService.java  an interface containing Customer as public and
msearch empty methods

form\CustomerForm.java empty for the moment, returned by controller

login\Login.java
login\LoginService.java contains only an interface with create method, depends
on login

controller\LoginController.java  attempt to use a very basic Spring MVC (only
ModelAndView creation with GET method)

