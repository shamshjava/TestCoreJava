package com.sa.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import javax.naming.Referenceable;

public class TestReferencesTypes {

	public static void main(String[] args) {
		employee emp = new employee("shamsh", 30);
		//strongRef();
		//weakRef();
		//softRef();
		phantomRef();

	}

	private static void phantomRef() {
		employee emp = new employee("shamsh", 30);
		ReferenceQueue<employee> referenceQueue = new ReferenceQueue<>();
		PhantomReference<employee> phantomReference = new PhantomReference<employee>(emp, referenceQueue);
		System.out.println(phantomReference.get());
		
	}

	private static void softRef() {
		employee emp = new employee("shamsh", 30);
		SoftReference<employee> softReference = new SoftReference<>(emp);
		System.out.println(softReference.get());
		emp = null;
		System.gc();
		System.out.println(softReference.get());
		
	}

	private static void weakRef() {
		employee emp = new employee("shamsh", 30);
		WeakReference<employee> weakReference = new WeakReference<>(emp);
		System.out.println(weakReference.get());
		emp = null;
		System.gc();
		System.out.println(weakReference.get());
		
	}

	private static void strongRef() {
		employee emp = new employee("shamsh", 30);
		System.out.println(emp);
		emp = null;
		//System.gc();
		System.out.println(emp);
		
	}

}
class employee{
	@Override
	public String toString() {
		return "employee [name=" + name + ", age=" + age + "]";
	}
	public employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
