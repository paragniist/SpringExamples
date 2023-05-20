package com.gofit.launcher;

import com.gofit.packages.PackageManager;
public class GofitApplication {
	public static void main(String[] args) {
		PackageManager packageManager = new PackageManager();
		packageManager.showPackages();
	}
}