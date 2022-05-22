package HouseSearch.dubbo.server.service;

import HouseSearch.dubbo.server.pojo.HouseResources;

public interface HouseResourcesService  {

    /** *
    * @param houseResources
    *
    * @return -1:输入的参数不符合要求，0:数据插入数据库失败，1:成功 */
    int saveHouseResources(HouseResources houseResources);
}