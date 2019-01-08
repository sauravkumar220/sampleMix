package saurabh.ds.pogram.HashMapImplementation;

import java.util.Iterator;
import java.util.LinkedList;

public class Hash<K, V> implements Iterable<K> {

	public Hash(int tableSize) {
		this.tableSize = tableSize;
		// we dont want null at each index so we r inialiatizing every index with new
		// linked linked list
		this.harray = (LinkedList<HashElements<K, V>>[]) new LinkedList[tableSize];
		for (int i = 0; i < harray.length; i++) {
			harray[i] = new LinkedList<HashElements<K, V>>();
		}
		numElement = 0;
		maxLoadFactor = 0.75;// how often we want to create a new array to resize
		// num of element divided by size of table
		// to do this we simply cant copy every element to the new bigger array
		// we have to take out each elemnet and after hashing only they will be
		// allocated to a new index in bigger array
		// by using load factor and size we decide
		// wisely how often we want a new array and how uniformely the element are
		// distributed accross the array

	}

	class HashElements<K, V> implements Comparable<HashElements<K, V>> {
		K key;
		V value;

		public HashElements(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public int compareTo(HashElements<K, V> o) {

			return ((Comparable<HashElements<K, V>>) this.key).compareTo((HashElements<K, V>) o.key);
		}

	}

	int numElement, tableSize;
	double maxLoadFactor;
	LinkedList<HashElements<K, V>>[] harray;

	// it is up to u wheather want to return boolean or the previous elemnt (like in
	// real HashMap)
	// i just tried to keep it simple
	public void put(K key, V value) {
		if (tableSize == numElement) {
			resize(tableSize * 2);
		}

		HashElements<K, V> he = new HashElements<K, V>(key, value);
		int hashValue = key.hashCode();
		hashValue = hashValue & 0x7FFFFFFF;
		// no matter what it will give some + integer usually bigger in size
		// and we do mode of tablesize to get fit in our array
		hashValue = hashValue % tableSize;
		// As we have already initialized every index with linked list we can add
		// directly
		harray[hashValue].add(he);
		numElement++;

	}

	// we usually dont shrink the table if we remove anything ,however can be done
	// easily but calling the same resize method
	public void remove(K key, V value) {
		HashElements<K, V> he = new HashElements<K, V>(key, value);
		int hashValue = key.hashCode();
		hashValue = hashValue & 0x7FFFFFFF;
		hashValue = hashValue % tableSize;

		harray[hashValue].remove(he);// check it
		numElement--;

	}

	public V get(K key) {
		// HashElements<K, V> he = new HashElements<K, V>(key, value);
		// need to use comparable else will only work for strings
		int hashValue = key.hashCode();
		hashValue = hashValue & 0x7FFFFFFF;
		hashValue = hashValue % tableSize;
		for (int i = 0; i < harray[hashValue].size(); i++) {
			HashElements<K, V> he = (HashElements<K, V>) harray[hashValue].get(i);
			if ((he.key).equals(key))// y in tutorial they have used comparable need to find out
			{
				return he.value;
			}
		}

		return null;

	}

	// keep everything in biggger based on new hashing (we did this in arrayList)
	private void resize(int newSize) {
		// need to implement
		// TODO Auto-generated method stub
		LinkedList<HashElements<K, V>>[] tmp = (LinkedList<HashElements<K, V>>[]) new LinkedList[newSize];

		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = new LinkedList<HashElements<K, V>>();
		}

		for (int j = 0; j < harray.length; j++) {
			LinkedList<HashElements<K, V>> ll = harray[j];
			for (int k = 0; k < ll.size(); k++) {
				HashElements<K, V> he = ll.get(k);

				int hashValue = he.key.hashCode();
				hashValue = hashValue & 0x7FFFFFFF;
				hashValue = hashValue % newSize;

				tmp[hashValue].add(he);

			}
		}
		harray = tmp;
		tableSize = newSize;

	}

	public int getSize() {
		return tableSize;
	}

	// implement properly
	private int loadFactor() {
		return numElement;
	}

	@Override
	public Iterator<K> iterator() {
		//this iterator hash to store the keys all over again as resizing will rearranged to different index
		return new IteratorHelper<>();
	/*	we can use this iterator in code as :--
	 * donot uncoment it the implementation is not completed yet
		Hash<K, V> h = new Hash<K,V>();
		Iterator itr =h.iterator();
		while(itr.hasNext()) {
			h.get(itr.next());
		}*/
	}

	class IteratorHelper<K> implements Iterator<K> {
		K[] key;
		int position;

		
		public IteratorHelper() {
			/**
			 * loop throught array then loop throuh linked list add keys to K[] and
			 * increment use position to inrement K[index] once done set position back to 0
			 * use the same position var to control hashnext method counter
			 */
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public K next() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
