package com.life.pojo.envelope;

public interface Envelope<H,B> {
	public H getHeader();
	public B getBody();
}
