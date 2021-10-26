package com.company.adapter_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 14:54
 */
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		//什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
