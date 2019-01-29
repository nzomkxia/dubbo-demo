package org.apache.dubbo.demo.model;

/**
 * @author zmx ON 2019-01-29
 */
public class DepartmentDO {

    private String departName;
    private LocationDO departLocation;

    @Override
    public String toString() {
        return "DepartmentDO{" +
                "departName='" + departName + '\'' +
                ", departLocation=" + departLocation.toString() +
                '}';
    }
}
