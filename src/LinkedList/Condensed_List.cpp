/*

QUESTION:
Given a list of integers, remove any nodes that have values that have previously occurred in the list and return a 
reference to the head of the list. For example, the following list has a recurrence of the value 3 
initially: Linked List 3 4 3 6 head tail Redundant nodes are colored with the same color 3 4 6 head tail 
Redundant nodes are removed after calling condense Remove the node at position 2 in the list above, O based indexing.

he function must return a reference to a LinkedListNode, the first node of a list that contains only the unique value 
nodes from the original list, in order. condense has the following parameter(s): head: the head of a singly-linked list of integers, 
a LinkedListNode
*/


SinglyLinkedListNode* condense(SinglyLinkedListNode* head) {
	struct SinglyLinkedListNode *p;
	unordered_set<int> s;
	p=head;
	s.insert(head->data);
	while(p!=NULL && p->next!=NULL)
	{
    	if(s.find(p->next->data)==s.end())
    	{
        	s.insert(p->next->data);
        	p=p->next;
    	}
    	else {
        	p->next=p->next->next;
    	}
   	 
	}
	for (auto it = s.begin(); it !=s.end(); ++it)
    	cout << ' ' << *it;
	return head;
}
