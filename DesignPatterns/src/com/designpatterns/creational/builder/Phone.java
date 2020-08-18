package com.designpatterns.creational.builder;

public class Phone {
	public static class PhoneBuilder{
		private String os;
		private String osVersion;
		private String ram;
		private String camera;
		private String space;
		
		public PhoneBuilder buildOS(String os) {
			this.os = os;
			return this;
		}
		
		public PhoneBuilder buildOSVersion(String osVersion) {
			this.osVersion = osVersion;
			return this;
		}
		
		public PhoneBuilder buildRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		public PhoneBuilder buildCamera(String camera) {
			this.camera = camera;
			return this;
		}
		
		public PhoneBuilder buildSpace(String space) {
			this.space = space;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}
	}
	
	
	private String os;
	private String osVersion;
	private String ram;
	private String camera;
	private String space;
	
	private Phone(PhoneBuilder builder) {
		this.os = builder.os;
		this.osVersion = builder.osVersion;
		this.ram = builder.ram;
		this.camera = builder.camera;
		this.space = builder.space;
	}
	
	public String getOs() {
		return os;
	}
	
	public String getOsVersion() {
		return osVersion;
	}
	
	public String getRam() {
		return ram;
	}
	
	public String getCamera() {
		return camera;
	}
	
	public String getSpace() {
		return space;
	}
}
