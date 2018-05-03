
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojo/overlay_transform.mojom
//

package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class OverlayTransform {


    public static final int OVERLAY_TRANSFORM_INVALID = 0;

    public static final int OVERLAY_TRANSFORM_NONE = OVERLAY_TRANSFORM_INVALID + 1;

    public static final int OVERLAY_TRANSFORM_FLIP_HORIZONTAL = OVERLAY_TRANSFORM_NONE + 1;

    public static final int OVERLAY_TRANSFORM_FLIP_VERTICAL = OVERLAY_TRANSFORM_FLIP_HORIZONTAL + 1;

    public static final int OVERLAY_TRANSFORM_ROTATE_90 = OVERLAY_TRANSFORM_FLIP_VERTICAL + 1;

    public static final int OVERLAY_TRANSFORM_ROTATE_180 = OVERLAY_TRANSFORM_ROTATE_90 + 1;

    public static final int OVERLAY_TRANSFORM_ROTATE_270 = OVERLAY_TRANSFORM_ROTATE_180 + 1;

    public static final int OVERLAY_TRANSFORM_LAST = (int) (OverlayTransform.OVERLAY_TRANSFORM_ROTATE_270);


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private OverlayTransform() {}

}