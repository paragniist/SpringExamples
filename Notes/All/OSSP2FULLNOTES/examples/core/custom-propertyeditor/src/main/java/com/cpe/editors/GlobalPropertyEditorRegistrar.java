package com.cpe.editors;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.GeoLocation;

public class GlobalPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(GeoLocation.class, new GeoLocationPropertyEditor());
	}

}
