package main.ssh.service.impl;

import main.ssh.dao.OverViewDialectsDao;
import main.ssh.dao.impl.OverViewDialectsImpl;
import main.ssh.entity.OverviewDialects;
import main.ssh.entity.RegionSpread;
import main.ssh.service.OverViewDialectsService;

public class OverViewDIalectsServiceImpl implements OverViewDialectsService{

	private OverViewDialectsDao ovdd = new OverViewDialectsImpl();
	
	@Override
	public OverviewDialects queryViewDialects() {
		return ovdd.queryViewDialects();
	}

	@Override
	public RegionSpread queryRegionSpread() {
		return ovdd.queryRegionSpread();
	}

}
