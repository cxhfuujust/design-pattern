package com.chenx.example.observer;

public interface Subject {
	void registerObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
}
