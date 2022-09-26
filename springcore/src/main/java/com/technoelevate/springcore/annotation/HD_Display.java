package com.technoelevate.springcore.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HD_Display implements Display {

	@Override
	public String getDisplay() {
		return "12hz";
		
	}

	@Override
	public String toString() {
		return "HD_Display []";
	}
	

}
