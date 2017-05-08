package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void queueCreationIsEmpty() {
		Queue myQueue = new Queue(5);

		assertTrue(myQueue.isQueueEmpty());

	}

	@Test
	public void queueAdd() {
		Queue myQueue = new Queue(5);

		myQueue.insert(2);

		assertTrue(!myQueue.isQueueEmpty());
		assertTrue(myQueue.peek() == 2);
	}
	
	@Test
	public void queuePeek() {
		Queue myQueue = new Queue(5);

		myQueue.insert(1);
		myQueue.insert(4);
		myQueue.insert(3);
		myQueue.insert(2);


		assertTrue(!myQueue.isQueueEmpty());
		assertTrue(myQueue.peek() == 1);
	}
	
	@Test
	public void queueSize() {
		Queue myQueue = new Queue(5);

		myQueue.insert(1);
		myQueue.insert(4);
		myQueue.insert(3);

		assertTrue(!myQueue.isQueueEmpty());
		assertTrue(myQueue.size() == 3);
	}
	
	@Test
	public void queueRemove() {
		Queue myQueue = new Queue(5);

		myQueue.insert(1);
		myQueue.insert(4);
		myQueue.insert(3);

		assertTrue(!myQueue.isQueueEmpty());
		assertTrue(myQueue.size() == 3);
		assertTrue(myQueue.peek() == 1);

		myQueue.remove();
		
		assertTrue(!myQueue.isQueueEmpty());
		assertTrue(myQueue.size() == 2);
		assertTrue(myQueue.peek() == 4);
	}

}
