package com.sha.algos.cache;

public class DoubleLinkedListNode {
	private Object val;
	private Integer key;
	private DoubleLinkedListNode pre;
	private DoubleLinkedListNode next;
	
	public DoubleLinkedListNode(Integer key, Object value) {
		this.val = value;
		this.key = key;
	}

	/**
	 * @return the val
	 */
	public Object getVal() {
		return val;
	}

	/**
	 * @param val the val to set
	 */
	public void setVal(Object val) {
		this.val = val;
	}

	/**
	 * @return the key
	 */
	public Integer getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(Integer key) {
		this.key = key;
	}

	/**
	 * @return the pre
	 */
	public DoubleLinkedListNode getPre() {
		return pre;
	}

	/**
	 * @param pre the pre to set
	 */
	public void setPre(DoubleLinkedListNode pre) {
		this.pre = pre;
	}

	/**
	 * @return the next
	 */
	public DoubleLinkedListNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleLinkedListNode next) {
		this.next = next;
	}
}
