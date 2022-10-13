# Iterative Python3 program to search an element in linked list


class Node:

	# Function to initialise the node object
	def __init__(self, data):
		self.data = data # Assign data
		self.next = None # Initialize next as null

# Linked List class


class LinkedList:
	def __init__(self):
		self.head = None # Initialize head as None

	# This function insert a new node at the
	# beginning of the linked list
	def push(self, new_data):

		# Create a new Node
		new_node = Node(new_data)


		new_node.next = self.head

		
		self.head = new_node

	
	def search(self, x):

		
		current = self.head

		
		while current != None:
			if current.data == x:
				return True # data found

			current = current.next

		return False 


# Driver code
if __name__ == '__main__':

	
	llist = LinkedList()
	llist.push(10)
	llist.push(30)
	llist.push(11)
	llist.push(21)
	llist.push(14)

	# Function call
	if llist.search(21):
		print("Yes")
	else:
		print("No")

