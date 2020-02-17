# Market

There is a class called Card.java. This class contains variabales that store information for the card's owner, its turnover and its discount rate.
At the same time there are two methods, which take care of calculating the discount and the total, given a purchase value.

There are three classes called Bronze_card.java, Silver_card.java and Gold_card.java. Each of them has a constructor which depending on 
the turnover value calculates the discount rate.

There is a class called PayDesk.java. This class contains only static methods, which take care of different functionalities, like using
different types of discount cards, printing all the data of a certain purchase using one of the cards and runnig an option menu to make use 
of the functionalities.

In the Main.java class there is an instance for every type of discount card, and the method which starts the menu is called.
