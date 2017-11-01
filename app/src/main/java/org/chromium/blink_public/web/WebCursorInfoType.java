
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/WebKit/public/platform/WebCursorInfo.h

package org.chromium.blink_public.web;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebCursorInfoType.TYPE_POINTER, WebCursorInfoType.TYPE_CROSS, WebCursorInfoType.TYPE_HAND,
    WebCursorInfoType.TYPE_I_BEAM, WebCursorInfoType.TYPE_WAIT, WebCursorInfoType.TYPE_HELP,
    WebCursorInfoType.TYPE_EAST_RESIZE, WebCursorInfoType.TYPE_NORTH_RESIZE,
    WebCursorInfoType.TYPE_NORTH_EAST_RESIZE, WebCursorInfoType.TYPE_NORTH_WEST_RESIZE,
    WebCursorInfoType.TYPE_SOUTH_RESIZE, WebCursorInfoType.TYPE_SOUTH_EAST_RESIZE,
    WebCursorInfoType.TYPE_SOUTH_WEST_RESIZE, WebCursorInfoType.TYPE_WEST_RESIZE,
    WebCursorInfoType.TYPE_NORTH_SOUTH_RESIZE, WebCursorInfoType.TYPE_EAST_WEST_RESIZE,
    WebCursorInfoType.TYPE_NORTH_EAST_SOUTH_WEST_RESIZE,
    WebCursorInfoType.TYPE_NORTH_WEST_SOUTH_EAST_RESIZE, WebCursorInfoType.TYPE_COLUMN_RESIZE,
    WebCursorInfoType.TYPE_ROW_RESIZE, WebCursorInfoType.TYPE_MIDDLE_PANNING,
    WebCursorInfoType.TYPE_EAST_PANNING, WebCursorInfoType.TYPE_NORTH_PANNING,
    WebCursorInfoType.TYPE_NORTH_EAST_PANNING, WebCursorInfoType.TYPE_NORTH_WEST_PANNING,
    WebCursorInfoType.TYPE_SOUTH_PANNING, WebCursorInfoType.TYPE_SOUTH_EAST_PANNING,
    WebCursorInfoType.TYPE_SOUTH_WEST_PANNING, WebCursorInfoType.TYPE_WEST_PANNING,
    WebCursorInfoType.TYPE_MOVE, WebCursorInfoType.TYPE_VERTICAL_TEXT, WebCursorInfoType.TYPE_CELL,
    WebCursorInfoType.TYPE_CONTEXT_MENU, WebCursorInfoType.TYPE_ALIAS,
    WebCursorInfoType.TYPE_PROGRESS, WebCursorInfoType.TYPE_NO_DROP, WebCursorInfoType.TYPE_COPY,
    WebCursorInfoType.TYPE_NONE, WebCursorInfoType.TYPE_NOT_ALLOWED, WebCursorInfoType.TYPE_ZOOM_IN,
    WebCursorInfoType.TYPE_ZOOM_OUT, WebCursorInfoType.TYPE_GRAB, WebCursorInfoType.TYPE_GRABBING,
    WebCursorInfoType.TYPE_CUSTOM
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebCursorInfoType {
  int TYPE_POINTER = 0;
  int TYPE_CROSS = 1;
  int TYPE_HAND = 2;
  int TYPE_I_BEAM = 3;
  int TYPE_WAIT = 4;
  int TYPE_HELP = 5;
  int TYPE_EAST_RESIZE = 6;
  int TYPE_NORTH_RESIZE = 7;
  int TYPE_NORTH_EAST_RESIZE = 8;
  int TYPE_NORTH_WEST_RESIZE = 9;
  int TYPE_SOUTH_RESIZE = 10;
  int TYPE_SOUTH_EAST_RESIZE = 11;
  int TYPE_SOUTH_WEST_RESIZE = 12;
  int TYPE_WEST_RESIZE = 13;
  int TYPE_NORTH_SOUTH_RESIZE = 14;
  int TYPE_EAST_WEST_RESIZE = 15;
  int TYPE_NORTH_EAST_SOUTH_WEST_RESIZE = 16;
  int TYPE_NORTH_WEST_SOUTH_EAST_RESIZE = 17;
  int TYPE_COLUMN_RESIZE = 18;
  int TYPE_ROW_RESIZE = 19;
  int TYPE_MIDDLE_PANNING = 20;
  int TYPE_EAST_PANNING = 21;
  int TYPE_NORTH_PANNING = 22;
  int TYPE_NORTH_EAST_PANNING = 23;
  int TYPE_NORTH_WEST_PANNING = 24;
  int TYPE_SOUTH_PANNING = 25;
  int TYPE_SOUTH_EAST_PANNING = 26;
  int TYPE_SOUTH_WEST_PANNING = 27;
  int TYPE_WEST_PANNING = 28;
  int TYPE_MOVE = 29;
  int TYPE_VERTICAL_TEXT = 30;
  int TYPE_CELL = 31;
  int TYPE_CONTEXT_MENU = 32;
  int TYPE_ALIAS = 33;
  int TYPE_PROGRESS = 34;
  int TYPE_NO_DROP = 35;
  int TYPE_COPY = 36;
  int TYPE_NONE = 37;
  int TYPE_NOT_ALLOWED = 38;
  int TYPE_ZOOM_IN = 39;
  int TYPE_ZOOM_OUT = 40;
  int TYPE_GRAB = 41;
  int TYPE_GRABBING = 42;
  int TYPE_CUSTOM = 43;
}