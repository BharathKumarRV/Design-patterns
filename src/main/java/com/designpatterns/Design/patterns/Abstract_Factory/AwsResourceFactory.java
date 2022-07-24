package com.designpatterns.Design.patterns.Abstract_Factory;
import com.designpatterns.Design.patterns.Abstract_Factory.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
