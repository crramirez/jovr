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
public class OvrRecti extends Structure {
	public OvrVector2i Pos;
	public OvrSizei Size;
	public OvrRecti() {
		super();
	}
	@Override
  protected List<? > getFieldOrder() {
		return Arrays.asList("Pos", "Size");
	}
	public OvrRecti(OvrVector2i Pos, OvrSizei Size) {
		super();
		this.Pos = Pos;
		this.Size = Size;
	}
	public OvrRecti(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OvrRecti implements Structure.ByReference {
		
	};
	public static class ByValue extends OvrRecti implements Structure.ByValue {
              public ByValue(OvrRecti o) {
                super(o.Pos, o.Size);
         }
	};
}
