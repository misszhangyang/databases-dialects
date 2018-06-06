package main.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.ssh.dao.RegionPointDao;
import main.ssh.dao.impl.RegionPointDaoImpl;
import main.ssh.entity.RegionPoint;
import main.ssh.service.RegionPointService;

/*
 * 用户接口层实现类
 */
@Service
public class RegionPointServiceImpl implements RegionPointService {

	//注入用户的mapper
	@Autowired
	/*private UserMapper userMapper;*/
	@Override
	public void addRegionPiont(RegionPoint regionPoint) {
		RegionPointDao regionPointDao = new RegionPointDaoImpl();
		regionPointDao.addRegionPoint(regionPoint);
	}

	@Override
	public List<RegionPoint> findAllReginon(int id) {
        RegionPointDao regionPointDao = new RegionPointDaoImpl();
        return regionPointDao.findAllRegion(id);
	}
}
