package org.apache.dubbo.demo.model;

import java.io.Serializable;

/**
 * Created by kezhenxu94 at 2019/1/23 17:18.
 *
 * @author kezhenxu94 (kezhenxu94 at 163 dot com)
 */
public class User implements Serializable {
  private Long id;
  private String username;

  public User() {
  }

  public User(final Long id, final String username) {
    this.id = id;
    this.username = username;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(final String username) {
    this.username = username;
  }
}
