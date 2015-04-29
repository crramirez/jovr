package com.oculusvr.capi;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GLConfig extends Union {
	/** < General device settings. */
	public RenderAPIConfig Config;
	/** < OpenGL-specific settings. */
	public GLConfigData OGL;
	public GLConfig() {
		super();
              this.setTypedValue(OGL);
              setType(GLConfigData.class);
	}
	public GLConfig(GLConfigData OGL) {
		super();
		this.OGL = OGL;
		this.setTypedValue(OGL);
		setType(GLConfigData.class);
	}
	public GLConfig(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends GLConfig implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends GLConfig implements com.sun.jna.Structure.ByValue {
		
	};
}