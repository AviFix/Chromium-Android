
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/interfaces/network_service.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface NetworkContext extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetworkContext, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkContext, NetworkContext.Proxy> MANAGER = NetworkContext_Internal.MANAGER;


    void createUrlLoaderFactory(
org.chromium.mojo.bindings.InterfaceRequest<UrlLoaderFactory> urlLoaderFactory, int processId);



    void handleViewCacheRequest(
org.chromium.url.mojom.Url url, UrlLoaderClient client);



    void getCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<CookieManager> cookieManager);



    void getRestrictedCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<RestrictedCookieManager> restrictedCookieManager, int renderProcessId, int renderFrameId);



    void clearNetworkingHistorySince(
org.chromium.mojo.common.mojom.Time startTime, 
ClearNetworkingHistorySinceResponse callback);

    interface ClearNetworkingHistorySinceResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setNetworkConditions(
String profileId, NetworkConditions conditions);



    void addHstsForTesting(
String host, org.chromium.mojo.common.mojom.Time expiry, boolean includeSubdomains, 
AddHstsForTestingResponse callback);

    interface AddHstsForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
