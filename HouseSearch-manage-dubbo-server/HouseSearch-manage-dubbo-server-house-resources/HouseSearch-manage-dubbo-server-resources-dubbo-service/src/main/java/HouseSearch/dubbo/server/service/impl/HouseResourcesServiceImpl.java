package HouseSearch.dubbo.server.service.impl;

import HouseSearch.dubbo.server.pojo.HouseResources;
import HouseSearch.dubbo.server.service.HouseResourcesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HouseResourcesService {

    /**
     * @param houseResources
     * @return -1:输入的参数不符合要求，0:数据插入数据库失败，1:成功
     */
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        
        return super.save(houseResources);


    }
}
