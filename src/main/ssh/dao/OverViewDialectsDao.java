package main.ssh.dao;

import main.ssh.entity.OverviewDialects;
import main.ssh.entity.RegionPoint;
import main.ssh.entity.RegionSpread;

public interface OverViewDialectsDao {

	// 添加方言概述
	public void addViewDialects(OverviewDialects overviewdialects);

	// 查询方言概述
	public OverviewDialects queryViewDialects();

	//查询地区分布
	public RegionSpread queryRegionSpread();
}
