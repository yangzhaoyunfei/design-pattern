package com.company.proxy_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 11:04
 */
public class ProxyImage implements Image {

	private final String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
