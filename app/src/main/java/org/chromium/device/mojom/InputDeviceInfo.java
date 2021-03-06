
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/input_service.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class InputDeviceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String id;
    public String name;
    public int subsystem;
    public int type;
    public boolean isAccelerometer;
    public boolean isJoystick;
    public boolean isKey;
    public boolean isKeyboard;
    public boolean isMouse;
    public boolean isTablet;
    public boolean isTouchpad;
    public boolean isTouchscreen;

    private InputDeviceInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public InputDeviceInfo() {
        this(0);
    }

    public static InputDeviceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static InputDeviceInfo deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static InputDeviceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        InputDeviceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new InputDeviceInfo(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.id = decoder0.readString(8, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.name = decoder0.readString(16, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.subsystem = decoder0.readInt(24);
                    InputDeviceSubsystem.validate(result.subsystem);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.type = decoder0.readInt(28);
                    InputDeviceType.validate(result.type);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isAccelerometer = decoder0.readBoolean(32, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isJoystick = decoder0.readBoolean(32, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isKey = decoder0.readBoolean(32, 2);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isKeyboard = decoder0.readBoolean(32, 3);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isMouse = decoder0.readBoolean(32, 4);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isTablet = decoder0.readBoolean(32, 5);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isTouchpad = decoder0.readBoolean(32, 6);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.isTouchscreen = decoder0.readBoolean(32, 7);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.id, 8, false);
        
        encoder0.encode(this.name, 16, false);
        
        encoder0.encode(this.subsystem, 24);
        
        encoder0.encode(this.type, 28);
        
        encoder0.encode(this.isAccelerometer, 32, 0);
        
        encoder0.encode(this.isJoystick, 32, 1);
        
        encoder0.encode(this.isKey, 32, 2);
        
        encoder0.encode(this.isKeyboard, 32, 3);
        
        encoder0.encode(this.isMouse, 32, 4);
        
        encoder0.encode(this.isTablet, 32, 5);
        
        encoder0.encode(this.isTouchpad, 32, 6);
        
        encoder0.encode(this.isTouchscreen, 32, 7);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        InputDeviceInfo other = (InputDeviceInfo) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.id, other.id))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.name, other.name))
            return false;
        if (this.subsystem!= other.subsystem)
            return false;
        if (this.type!= other.type)
            return false;
        if (this.isAccelerometer!= other.isAccelerometer)
            return false;
        if (this.isJoystick!= other.isJoystick)
            return false;
        if (this.isKey!= other.isKey)
            return false;
        if (this.isKeyboard!= other.isKeyboard)
            return false;
        if (this.isMouse!= other.isMouse)
            return false;
        if (this.isTablet!= other.isTablet)
            return false;
        if (this.isTouchpad!= other.isTouchpad)
            return false;
        if (this.isTouchscreen!= other.isTouchscreen)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.id);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.name);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.subsystem);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.type);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isAccelerometer);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isJoystick);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isKey);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isKeyboard);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isMouse);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isTablet);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isTouchpad);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isTouchscreen);
        return result;
    }
}