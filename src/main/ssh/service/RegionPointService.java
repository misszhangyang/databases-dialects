package main.ssh.service;

import java.util.List;

import main.ssh.entity.RegionPoint;



public interface RegionPointService {

	// 添加区域特点
	void addRegionPiont(RegionPoint regionPoint);

	// 查看区域特点
	List<RegionPoint> findAllReginon(int id);
}
