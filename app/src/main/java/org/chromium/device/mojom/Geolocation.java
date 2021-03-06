
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     device/geolocation/public/interfaces/geolocation.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface Geolocation extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Geolocation, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Geolocation, Geolocation.Proxy> MANAGER = Geolocation_Internal.MANAGER;


    void setHighAccuracy(
boolean highAccuracy);



    void queryNextPosition(

QueryNextPositionResponse callback);

    interface QueryNextPositionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Geoposition> { }


}
