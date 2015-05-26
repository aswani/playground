package creational.factory;

public class ConnectionFactory {

	public Connection creatConnection(ConnectionType type) {
		switch (type) {
		case REMOTE:
			return new RemoteConnection();
		case LOCAl:
			return new LocalConnection();

		default:
			return null;
		}
	}
}

enum ConnectionType {
	REMOTE, LOCAl;
}

abstract class Connection {
	public abstract String connect();
}

class RemoteConnection extends Connection {

	@Override
	public String connect() {
		// TODO Auto-generated method stub
		return "Remote Connection";
	}

}

class LocalConnection extends Connection {

	@Override
	public String connect() {
		// TODO Auto-generated method stub
		return "Local connection";
	}

}