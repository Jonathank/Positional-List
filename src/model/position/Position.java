package model.position;

public interface Position <E>{
	/*
	 * returns element at specified position
	 * 
	 * throws an IllegalStateException if the position is invalid
	 */
	
	E getElement() throws IllegalStateException;

}
