package com.rx.service;

import org.springframework.stereotype.Service;

import io.reactivex.Observable;

@Service
public class LauncherService {
	
	public void nameService() {
		Observable<String> myStrings=Observable.just("Alpha", "beta", "gamma");
		myStrings.subscribe(ele->System.out.println(ele));
	}
}
