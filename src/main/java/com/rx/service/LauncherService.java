package com.rx.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import io.reactivex.Observable;

@Service
public class LauncherService {
	
	public void nameService() {
		Observable<String> myStrings=Observable.just("Alpha", "beta", "gamma");
		myStrings.subscribe(ele->System.out.println(ele));
		
		myStrings.map(ele->ele.length()).subscribe(len->System.out.println("len="+len));
		
		
		Observable<Long> secondsInterval=Observable.interval(1, TimeUnit.SECONDS);
		secondsInterval.subscribe();
	}
}
