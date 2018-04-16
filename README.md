# Design-Pattern-Adapter

- The goal is to convert the String input into an output like a List of Character using adapter design pattern.<br />

- The roles in the adapter design pattern are an adapter, an adaptee, a target interface and a client. <br />
o Class CollectionCharacter is the adapter will convert the String input into a Vector<Character>. <br />
o The String input is the client.   
o The class ArrayList is the adaptee. <br /> 
o The interface Collection<Character> is the target interface. <br /> 
o Both the adapter class and the ArrayList class implements the target interface.  <br /><br />  

![alt text](https://github.com/wangchit/Design-Pattern-Adapter/blob/master/adapterPatternUML.png)


- Note that in this project, the class CollectionCharacter extends class Vector and implements interface Collection. <br />
The Vector has already implemented the methods in the interface Collection, so it is not neccessary to implement the overriden methods in the CollectionCharacter.<br /><br />This also means that the methods from the Vector can be used. For example, the iteration in the main i in the test class uses the interation method from the Vector. <br /><br />  


- If the class CollectionCharater does not extend Vector, the methods in the interfaces will be implemented in the CollectionCharacter. The implementation will possibly start from: <br />
o converting the String input into char array, <br /> 
o converting the String input into ArrayList or  <br />
o using String type  <br />
 

  
