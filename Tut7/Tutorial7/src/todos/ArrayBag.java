package todos;import java.util.ArrayList;import java.util.List;import java.util.Scanner;import sun.security.util.ArrayUtil;/** * A class of bags whose entries are stored in a fixed-size array. */public final class ArrayBag<T> implements BagInterface<T> {	// STEP 1: DETERMINES THE DATA FIELDS	/**	 * TO-DO: Declares the necessary attributes bag: T[] numberOfEntries: int	 * DEFAULT_CAPACITY: int (30) MAX_CAPACITY: int (3000)	 */	private T[] bag;	private int numberOfEntries;	private static final int DEFAULT_CAPACITY = 30;	private int MAX_CAPACITY = 3000;	// STEP 2: IMPLEMENTS THE CONSTRUCTORS	/**	 * TO-DO: Creates an empty bag with default capacity	 */	public ArrayBag() {		this(DEFAULT_CAPACITY);	}	/**	 * TO-DO: Creates an empty bag having a given capacity.	 *	 * @param desiredCapacity The integer capacity desired.	 */	public ArrayBag(int desiredCapacity) {		desiredCapacity = MAX_CAPACITY;	}	// STEP 3: IMPLEMENTS THE FUNCTIONS	/**	 * TO-DO: Adds a new entry to this bag.	 *	 * @param newEntry The object to be added as a new entry.	 * @return True if the addition is successful, or false if not.	 */	public boolean add(T newEntry) {		for (int i = 0; i < bag.length; i++) {			if (bag[i] != null) {				bag[i] = newEntry;			}		}		return true;	}	/**	 * TO-DO: Retrieves all entries that are in this bag.	 *	 * @return A newly allocated array of all the entries in this bag.	 */	public T[] toArray() {		for (int i = 0; i < bag.length; i++) {			if (bag[i] != null) {				System.out.println(bag[i]);			}		}		return bag;	}	/**	 * TO-DO: Sees whether this bag is empty.	 *	 * @return True if this bag is empty, or false if not.	 */	public boolean isEmpty() {		for (int i = 0; i < bag.length; i++) {			if (bag[i] == null) {				return false;			}		}		return true;	}	/**	 * TO-DO: Gets the current number of entries in this bag.	 *	 * @return The integer number of entries currently in this bag.	 */	public int getCurrentSize() {		return bag.length;	}	/**	 * TO-DO: Counts the number of times a given entry appears in this bag.	 *	 * @param anEntry The entry to be counted.	 * @return The number of times anEntry appears in this bag.	 */	public int getFrequencyOf(T anEntry) {		int count = 0;		for (int i = 0; i < bag.length; i++) {			if (bag[i] == anEntry) {				count++;			}		}		return count;	}	/**	 * TO-DO: Tests whether this bag contains a given entry.	 *	 * @param anEntry The entry to locate.	 * @return True if this bag contains anEntry, or false otherwise.	 */	public boolean contains(T anEntry) {		for (int i = 0; i < bag.length; i++) {			if(bag[i] == anEntry) {				return  true;			}		}		return false;	}	/**	 * TO-DO: Removes all entries from this bag.	 */	public void clear() {		for (int i = 0; i < bag.length; i++) {			bag[i] = null;		}	}	/**	 * TO-DO: Removes one unspecified entry from this bag, if possible.	 *	 * @return Either the removed entry, if the removal was successful, or null.	 */	public T remove() {				for (int i = 0; i < bag.length; i++) {			if(bag[2] == bag[i]) {				bag[2] = bag[i+1];			}		}		return null;	}	/**	 * TO-DO: Removes one occurrence of a given entry from this bag.	 *	 * @param anEntry The entry to be removed.	 * @return True if the removal was successful, or false if not.	 */	public boolean remove(T anEntry) {		for (int i = 0; i < bag.length; i++) {			if(bag[i] == anEntry) {				bag[i] = bag[i+1];			}		}		return false;	}	// TO-DO: Returns true if the array bag is full, or false if not.	private boolean isArrayFull() {		for (int i = 0; i < bag.length; i++) {			if(bag[i] != null) {				return false;			}		}		return true;	}	// TO-DO: Locates a given entry within the array bag.	// Returns the index of the entry, if located,	// or -1 otherwise.	// Precondition: checkInitialization has been called.	private int getIndexOf(T anEntry) {		for (int i = 0; i < bag.length; i++) {			if(bag[i] == anEntry) {				return i;			}		}		return 0;			}	// TO-DO: Removes and returns the entry at a given index within the array.	// If no such entry exists, returns null.	// Precondition: 0 <= givenIndex < numberOfEntries.	// Precondition: checkInitialization has been called.	private T removeEntry(int givenIndex) {		for (int i = 0; i < bag.length; i++) {			if(i == givenIndex) {				bag[i] = bag[i+1];				return (T) bag;			}		}		return null;	}}