package creational.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testRemoteConnectionCreated() {
		Connection remoteConnection = new ConnectionFactory().creatConnection(ConnectionType.REMOTE);
		assertEquals("Remote Connection", remoteConnection.connect());
		assertNotEquals("Local connection", remoteConnection.connect());
	}

}
