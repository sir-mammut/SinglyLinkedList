# Singly Linked List
**Description**
 A Linked list is a data structure used for storing collections of data. it comprises the following methods.

* `setData()` :
* `getData()` :
* `setNext()` :
* `getNext()` :

## LengthOfTheList()

**Description**
Takes the head of the linked list as input and count the of nodes in the list.

**Parameter**
* Nodes head

**Return**
* Integer equivalent to the length of the linked list.

## getHead()

**Description**
 For getting the head of the linked list.

**Return**
* `head` : a given head

## insertAtBegin(Nodes node)

**Description**
Insert new node at the begining of the linked list

**Parameter**
* `node` : a given node

**Return**
* `void`


## insertAtEnd(Nodes node)

**Description**
Insert new node at the end of the linked list.

**Parameters**
* `node` : a given node.

**Return**
* `void`

## insertNodeToGivenPosition()

**Description**
Adding the new node to the list in a given position and all the values that position move to the end to make a room.

**Parameters**
* `int data` : Data to insert.
* `int position` : The position to store the data.

**Return**
* `void`

## removeFromBegin()

**Description**
 It remove and return the node at the beginning of the inked list

**Return**
* `Nodes node` : The node to be remove

## removeFromEnd()

**Description**
Remove and return a node ata the end of the linked list.

**Return**
* `Nodes node` : node to be remove.

## removeMatched()

**Description**
Remove node matching the the specified node from the list.
**Parameters**
*  `Nodes node` : node to compare with other nodes.

**Return**
* `void`

## removeAt()

**Description**
Remove the value at the given position

**Parameters**
* `int position` : position of the node that will be removed.

**Return**
* `void`

## toString()

**Description**
 Return the string representation of the collection in the form of `["str1","str2",..,"strN"]`
 
**Return**
* `String`

## getPosition()

**Description**
Find the Position of the first value that is equal to the given value.

**Parameters**
* `int data`

**Return**
* Integer value equivalent to position of the given data in the list.
* or Some large value

## clearList()

**Description**
 Remove everything from the linked list.

**Return**
* `head = null`
* `length = 0` 


