package model.doublylinkedlist;

import model.position.Position;
import model.positionalList.PositionalList;

public class LinkedPositionalList <E> implements PositionalList<E> {

	private static class Node<E> implements Position<E>{
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
	
		
	}//end Node class
	
	
	private int size = 0;
	private Node<E>header;
	private Node<E>tailer;
	
	
	//constructs empty list
	public LinkedPositionalList() {
		header = new Node<>(null,null,null);
		tailer = new Node<>(null,header,null);
		header.setNext(tailer);
	}
	
	/** Validates the position and returns it as a node. */
	private Node<E> validate(Position<E>p) throws IllegalArgumentException{
		if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
		Node<E> node = (Node<E>)p;
		if(node.getNext() == null)
			throw new IllegalArgumentException("p is nolonger in the list");
		return node;
	}
	
	//returns the given node as aposition or null if its asentinel
	private Position<E>position(Node<E> node){
		if(node == header || node == tailer)
			return null;
		return  node;
	}
	
	
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
		
		return position(header);
	}

	@Override
	public Position<E> last() {
		
		return position(tailer);
	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalStateException {
		Node<E>node = validate(p);
		
		return position(node.getPrev());
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalStateException {
		Node<E>node = validate(p);
		
		return position(node.getNext());
	}

	//adds elememnt e to the linked list between the given nodes
	private Position<E>addBetween(E e,Node<E>prev,Node<E>nex){
		Node<E> newnode = new Node<>(e,prev,nex);
		prev.setNext(newnode);
		nex.setPrev(newnode);
		size++;
		return  newnode;
	}
	@Override
	public Position<E> addFirst(E e) {
		
		return addBetween(e,header,header.getNext());
	}

	@Override
	public Position<E> addLast(E e) {
		
		return addBetween(e,tailer.getPrev(),tailer);
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalStateException {
	
		Node<E>node = validate(p);
		return addBetween(e,node.getPrev(),node);
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalStateException {
		Node<E>node = validate(p);
		return addBetween(e,node,node.getNext());
	}

	@Override
	public E set(Position<E> p, E e) throws IllegalStateException {
	
		Node<E> node = validate(p);
		E ans = node.getElement();
		node.setElement(e);
		
		return ans;
	}

	@Override
	public E remove(Position<E> p) throws IllegalStateException {
		Node<E> node = validate(p);
		Node<E>prev = node.getPrev();
		Node<E>nex = node.getNext();
		prev.setNext(nex);
		nex.setPrev(prev);
		size--;
		E ans = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		
		return ans;
	}

}
