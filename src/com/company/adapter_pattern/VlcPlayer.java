package com.company.adapter_pattern;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 14:53
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//什么也不做
	}
}