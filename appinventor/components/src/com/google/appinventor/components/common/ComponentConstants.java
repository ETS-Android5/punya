// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.components.common;

/**
 * Contains constants related to the persistent format of Simple components.
 *
 */
public class ComponentConstants {
  private ComponentConstants() {
    // nothing
  }

  /**
   * Layout constants.
   */
  public static final int LAYOUT_ORIENTATION_HORIZONTAL = 0;
  public static final int LAYOUT_ORIENTATION_VERTICAL = 1;

  public static final int DEFAULT_ROW_COLUMN = -1;

  public static final int EMPTY_HV_ARRANGEMENT_WIDTH = 100;
  public static final int EMPTY_HV_ARRANGEMENT_HEIGHT = 100;

  /**
   * Canvas component.
   */
  public static final int CANVAS_PREFERRED_WIDTH = 32;
  public static final int CANVAS_PREFERRED_HEIGHT = 48;

  /**
   * VideoPlayer component.
   * This is the size generated by iMovie for small videos
   */
  public static final int VIDEOPLAYER_PREFERRED_WIDTH = 176;
  public static final int VIDEOPLAYER_PREFERRED_HEIGHT = 144;

  /**
   * TextBox, PasswordTextBox, and EmailPicker components.
   */
  public static final int TEXTBOX_PREFERRED_WIDTH = 160;

   /**
   * HorizontalArrangement, VerticalArrangement, and Screen
   */
  public static final int GRAVITY_LEFT = 1;
  public static final int GRAVITY_RIGHT = 2;
  public static final int GRAVITY_CENTER_HORIZONTAL = 3;

  public static final int GRAVITY_TOP = 1;
  public static final int GRAVITY_CENTER_VERTICAL = 2;
  public static final int GRAVITY_BOTTOM = 3;

  public static final int HORIZONTAL_ALIGNMENT_DEFAULT = GRAVITY_LEFT;
  public static final int VERTICAL_ALIGNMENT_DEFAULT = GRAVITY_TOP;

  public static final int TEXT_RECEIVING_OFF = 1;
  public static final int TEXT_RECEIVING_FOREGROUND = 2;
  public static final int TEXT_RECEIVING_ALWAYS = 3;
  
  /*
   * Designer setting for Survey
   */
  
  public static final int SURVEY_STYLE_TEXTBOX = 1;
  public static final int SURVEY_STYLE_TEXTAREA = 2;
  public static final int SURVEY_STYLE_MULTIPLECHOICE = 3;
  public static final int SURVEY_STYLE_CHOOSELIST = 4;
  public static final int SURVEY_STYLE_CHECKBOX = 5;
  public static final int SURVEY_STYLE_SCALE = 6;
  public static final int SURVEY_STYLE_YESNO = 7;
    
}
