package externalizeInterface;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Externalizable, Serializable{

	//public Employee() {}

	String name;
	int age;

	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 name = (String)arg0.readObject();
	      age = arg0.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		arg0.writeObject(name);
		arg0.writeInt(age);

	}

}
