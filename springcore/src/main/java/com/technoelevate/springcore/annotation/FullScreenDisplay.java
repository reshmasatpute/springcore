package com.technoelevate.springcore.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class FullScreenDisplay implements Display{

	@Override
	public String getDisplay() {
		return "24hz";
		
	}

	@Override
	public String toString() {
		return "FullScreenDisplay []";
	}

}
