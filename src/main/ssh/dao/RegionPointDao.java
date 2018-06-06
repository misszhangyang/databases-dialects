package main.ssh.dao;

import java.util.List;

import main.ssh.entity.RegionPoint;


public interface RegionPointDao {

	public void addRegionPoint(RegionPoint regionPoint);

	public List<RegionPoint> findAllRegion(int id);

}
