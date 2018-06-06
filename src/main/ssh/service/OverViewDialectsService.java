package main.ssh.service;

import main.ssh.entity.OverviewDialects;
import main.ssh.entity.RegionPoint;
import main.ssh.entity.RegionSpread;

public interface OverViewDialectsService {

	//查询方言概述
	public OverviewDialects queryViewDialects();
	
	//查询区域方言概述
	public RegionSpread queryRegionSpread();
}
