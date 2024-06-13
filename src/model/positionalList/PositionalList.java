package model.positionalList;

import model.position.Position;

public interface PositionalList<E> {
//returns number of elements in the list
	int size();
	
	//tests whether the list is empty
	boolean isEmpty();
	
	//returns the first position in the list or null if empty
	Position<E> first();
	
	//returns last position in the list or null if empty
	Position<E> last();
	
	//returns position immediately before Position p or null if p is first
	Position<E> before(Position<E> p) throws IllegalStateException;
	
	//returns position immediately after Position p or null if p is last
	Position<E> after(Position<E> p) throws IllegalStateException;
	
	//inserts element e at the front of list and returns its position
	Position<E> addFirst(E e);
	
	//inserts element e at the back of list and returns its position
	Position<E> addLast(E e);
	
	//inserts element e immediately before Position p and returns its new position
	Position<E> addBefore(Position<E> p, E e) throws IllegalStateException;
	
	//inserts element e immediately after Position p and returns its new position
	Position<E> addAfter(Position<E> p, E e) throws IllegalStateException;
		
	//replaces element stored at position p and returns the replaced element
	E set(Position<E>p, E e) throws IllegalStateException;
	
	//removes element stored at position p and returns it
	E remove(Position<E> p) throws IllegalStateException;
	
	
}
