package com.sha.algos.cache;

import java.util.HashMap;

public class LRCCache {
	private DoubleLinkedListNode head;
	private DoubleLinkedListNode end;
	private int capacity;
	private int length;
	private HashMap<Integer, DoubleLinkedListNode> internalCache;
	
	public LRCCache(int capacity) {
		this.capacity = capacity;
		this.length = 0;
	}
	
	public Object get(Integer key) {
		if (internalCache.containsKey(key)) {
			DoubleLinkedListNode node = this.internalCache.get(key);
			removeNode(node);
			setHead(node);
			return node.getVal();
		}
		return null;
	}
	
	private void setHead(DoubleLinkedListNode node) {
		node.setNext(this.head);
		node.setPre(null);
		if (this.head != null) {
			this.head.setPre(node);
		}
	}

	public void removeNode(DoubleLinkedListNode node) {
		DoubleLinkedListNode cur = node;
		DoubleLinkedListNode pre = cur.getPre();
		DoubleLinkedListNode next = cur.getNext();
		
		if (pre != null) {
			pre.setNext(next);
		} else {
			this.head = next;
		}
		
		if (next != null) {
			next.setPre(pre);
		} else {
			this.end = pre;
		}
	}
}
