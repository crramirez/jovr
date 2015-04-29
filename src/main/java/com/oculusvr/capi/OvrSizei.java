package com.oculusvr.capi;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OvrSizei extends Structure {
	public int w;
	public int h;
	public OvrSizei() {
		super();
	}
	@Override
  protected List<? > getFieldOrder() {
		return Arrays.asList("w", "h");
	}
	public OvrSizei(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	public OvrSizei(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OvrSizei implements Structure.ByReference {
		
	};
	public static class ByValue extends OvrSizei implements Structure.ByValue {
		public ByValue(OvrSizei o) {
		  super(o.w, o.h);
		}
	};
}
