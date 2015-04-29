package com.oculusvr.capi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TextureHeader extends Structure {
	/** < The graphics API in use. */
	public int API;
	/** < The size of the texture. */
	public OvrSizei TextureSize;
	/** < Pixel viewport in texture that holds eye image. */
	public OvrRecti RenderViewport;
	public TextureHeader() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("API", "TextureSize", "RenderViewport");
	}
	public TextureHeader(int API, OvrSizei TextureSize, OvrRecti RenderViewport) {
		super();
		this.API = API;
		this.TextureSize = TextureSize;
		this.RenderViewport = RenderViewport;
	}
	public TextureHeader(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TextureHeader implements Structure.ByReference {
		
	};
	public static class ByValue extends TextureHeader implements Structure.ByValue {
		
	};
}
