package br.edu.bribeiro;

import java.util.NoSuchElementException;

public class Queue {

	private int front, rear, queueSize, currentSize;
	private int queueArray[];

	public Queue(int queueSize) {
		this.queueSize = queueSize;
		queueArray = new int[this.queueSize];

		this.front = -1;
		this.rear = -1;
		this.currentSize = 0;
	}

	// checking if the queue is full
	public boolean isQueueFull() {
		return (currentSize == queueArray.length);
	}

	// checking if the queue is empty
	public boolean isQueueEmpty() {
		return (currentSize == 0);
	}

	// checking the queue size
	public int size() {
		return currentSize;
	}

	// checking the front queue
	public int peek() {
		if (isQueueEmpty()) {
			throw new NoSuchElementException("Empty Queue");
		}
		return queueArray[front];
	}

	// adding in the queue
	public void insert(int i) {
		if (isQueueEmpty()) {
			front = 0;
			rear = 0;
			queueArray[rear] = i;
		} else {
			if (isQueueFull()) {
				throw new IndexOutOfBoundsException("Full Queue");
			} else {
				rear++;
				queueArray[rear] = i;
			}
		}
		currentSize++;
	}

	// removing from the queue
	public int remove() {
		int element = queueArray[front];

		if (isQueueEmpty()) {
			throw new NoSuchElementException("empty Queue");
		} else {
			currentSize--;
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}
		return element;
	}

}
