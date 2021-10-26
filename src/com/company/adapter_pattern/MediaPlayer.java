package com.company.adapter_pattern;

/**
 * 为媒体播放器和更高级的媒体播放器创建接口。
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 14:52
 */
public interface MediaPlayer {
	void play(String audioType, String fileName);
}
