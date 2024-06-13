package model.doublylinkedlist;

import model.position.Position;
import model.positionalList.PositionalList;

public class LinkedPositionalList <E> implements PositionalList<E> {

	private static class Node<E>{
	private E element;
	private Node<E> next;
	private Node<E> prev;
	
	public Node(E e, Node<E>p,Node<E>n) {
		this.setElement(e);
		this.next = n;
		this.setPrev(p);
	}

	/**
	 * @return the element
	 */
	public E getElement() throws IllegalStateException{
		if(next == null)
			throw new IllegalStateException("position nolonger valid");
		return element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(E element) {
		this.element = element;
	}

	/**
	 * @return the prev
	 */
	public Node<E> getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	
		
	}
	
	
	private int size = 0;
	private Node<E>head;
	private Node<E>tail;
	
	//constructs empty 
	
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public Position<E> first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addFirst(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addLast(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(Position<E> p, E e) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(Position<E> p) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

}
