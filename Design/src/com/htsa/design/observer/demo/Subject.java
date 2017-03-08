package com.htsa.design.observer.demo;

public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
