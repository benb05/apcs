# HEADER
ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz \
APCS pd6 \
HW91 -- Deque the Halls \
2022-04-13 \
time spent: 1 hrs \

## ORIGINAL PLAN!!!
* int 	size() \
  Returns the number of elements in this deque.
* boolean   isEmpty() \
  Returns true if this collection contains no elements.
* void 	addFirst​(E e) \
  Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* void 	addLast​(E e) \
  Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* E 	removeFirst() \
  Retrieves and removes the first element of this deque.
* E 	removeLast() \
  Retrieves and removes the last element of this deque.
* E 	peekFirst() \
  Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
* E 	peekLast() \
  Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
* boolean 	remove​(Object o)  SEEMS ANNOYING	\
  Removes the first occurrence of the specified element from this deque.
* boolean 	contains​(Object o)  SEEMS HARDish \
  Returns true if this deque contains the specified element.
* Iterator<E> 	iterator() SEEMS HARDish \
  Returns an iterator over the elements in this deque in proper sequence.
* boolean 	addAll​(Collection<? extends E> c) SEEMS HARDish \
  Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
* Iterator<E> 	descendingIterator() SEEMS HARD \
  Returns an iterator over the elements in this deque in reverse sequential order.
* boolean 	removeLastOccurrence​(Object o)  SEEMS HARD \
  Removes the last occurrence of the specified element from this deque.

## REVISED PLAN
* We hold these Truths to be self-evident, that all Methods are created equal. Everything is pass-through, so there isn't really a difficulty level.

## DESIGN DECISIONS
### EXCLUSION
* boolean 	add​(E e) \
  Made obsolete by addFirst and addLast
* E 	element() 	
  Made obsolete by peekFirst and peekLast
* E 	getFirst() 	
  Made obsolete by peekFirst and peekLast
* E 	getLast() 	
  Made obsolete by peekFirst and peekLast
* boolean 	offer​(E e) 	
  Made obsolete by addFirst and addLast
* boolean 	offerFirst​(E e) 	
  Made obsolete by addFirst and addLast
* boolean 	offerLast​(E e) 	
  Made obsolete by addFirst and addLast
* E 	peek() 	
  Made obsolete by peekFirst and peekLast
* E 	poll() 	
  Made obsolete by removeFirst and removeLast
* E 	pollFirst() 	
  Made obsolete by removeFirst and removeLast
* E 	pollLast() 	
  Made obsolete by removeFirst and removeLast
* E 	pop() 	
  Made obsolete by removeFirst and removeLast
* void 	push​(E e) 	
  Made obsolete by addFirst() and addLast()
* E 	remove() 	
  Made obsolete by removeFirst and removeLast

### INCLUSION
* We wanted methods that could check size, emptyness, and also mutators and accessors.
* We also wanted methods to preserve iterability
* Additional niche-er functions that seemed useful like contains, addAll, etc.

### LINKEDLIST???
* We chose LinkedList because of the epic pass through functionality that occured.
