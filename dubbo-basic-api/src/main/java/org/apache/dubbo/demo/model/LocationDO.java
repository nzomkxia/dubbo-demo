package org.apache.dubbo.demo.model;

/**
 * @author zmx ON 2019-01-29
 */
public class LocationDO {
    private String address;
    private int postNum;

    @Override
    public String toString() {
        return "LocationDO{" +
                "address='" + address + '\'' +
                ", postNum=" + postNum +
                '}';
    }
}
