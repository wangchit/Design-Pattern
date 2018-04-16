# Design-Pattern-Adapter

- The goal is to convert the String input into an output like a List of Character using adapter design pattern.<br />

- The roles in the adapter design pattern are an adapter, an adaptee, a target interface and a client. <br />
o Class CollectionCharacter is the adapter will convert the String input into a Vector<Character>. <br />
o The String input is the client.   
o The ArrayList class is the adaptee. <br /> 
o The target interface, Collection<Character>. <br /> 
o Both the adapter class and the ArrayList class implements the target interface.  <br /><br />  
  
- Note that in this project, the class CollectionCharacter extends class Vector and implements interface Collection. <br />
The class Vector has already implemented the methods in the interface Collection, so it is not neccessary to override the method in the class CollectionCharacter.<br /><br />This also means that the methods from the Vector can be used. For example, the iteration in the main class uses the interation method in the Vector class. <br /><br />  


- If the class CollectionCharater does not extend class Vector, the methods in the interfaces will be implemented in the CollectionCharacter. The implementation will possibly start from: <br />
o converting the String input into char array, <br /> 
o converting the String input into ArrayList or  <br />
o using String type  <br />
 

  
