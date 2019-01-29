package org.apache.dubbo.demo.model;

/**
 * @author zmx ON 2019-01-29
 */
public class UserInfoDO {
    private int id;
    private LocationDO locationDO;
    private DepartmentDO departmentDO;

    @Override
    public String toString() {
        return "UserInfoDO{" +
                "id=" + id +
                ", locationDO=" + locationDO.toString() +
                ", departmentDO=" + departmentDO.toString() +
                '}';
    }
}
