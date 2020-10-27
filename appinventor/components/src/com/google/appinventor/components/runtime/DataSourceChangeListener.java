// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2019-2020 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.components.runtime;

/**
 * Interface for observing Data Source value changes.
 */
public interface DataSourceChangeListener {
  /**
   * Event called when the value of the observed DataSource component changes.
   *
   * @param component component that triggered the event
   * @param key       key of the value that changed
   * @param newValue  the new value of the observed value
   */
  void onDataSourceValueChange(DataSource component, String key, Object newValue);
}
