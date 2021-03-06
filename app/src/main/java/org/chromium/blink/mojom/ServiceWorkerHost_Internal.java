
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/common/service_worker/service_worker.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class ServiceWorkerHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerHost, ServiceWorkerHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerHost, ServiceWorkerHost.Proxy>() {
    
        @Override
        public String getName() {
            return "blink::mojom::ServiceWorkerHost";
        }
    
        @Override
        public int getVersion() {
          return 0;
        }
    
        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, ServiceWorkerHost impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public ServiceWorkerHost[] buildArray(int size) {
          return new ServiceWorkerHost[size];
        }
    };


    private static final int SET_CACHED_METADATA_ORDINAL = 0;

    private static final int CLEAR_CACHED_METADATA_ORDINAL = 1;

    private static final int GET_CLIENTS_ORDINAL = 2;

    private static final int CLAIM_CLIENTS_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ServiceWorkerHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setCachedMetadata(
org.chromium.url.mojom.Url url, byte[] data) {

            ServiceWorkerHostSetCachedMetadataParams _message = new ServiceWorkerHostSetCachedMetadataParams();

            _message.url = url;

            _message.data = data;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_CACHED_METADATA_ORDINAL)));

        }


        @Override
        public void clearCachedMetadata(
org.chromium.url.mojom.Url url) {

            ServiceWorkerHostClearCachedMetadataParams _message = new ServiceWorkerHostClearCachedMetadataParams();

            _message.url = url;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CLEAR_CACHED_METADATA_ORDINAL)));

        }


        @Override
        public void getClients(
ServiceWorkerClientQueryOptions options, 
GetClientsResponse callback) {

            ServiceWorkerHostGetClientsParams _message = new ServiceWorkerHostGetClientsParams();

            _message.options = options;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_CLIENTS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ServiceWorkerHostGetClientsResponseParamsForwardToCallback(callback));

        }


        @Override
        public void claimClients(

ClaimClientsResponse callback) {

            ServiceWorkerHostClaimClientsParams _message = new ServiceWorkerHostClaimClientsParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CLAIM_CLIENTS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ServiceWorkerHostClaimClientsResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ServiceWorkerHost> {

        Stub(org.chromium.mojo.system.Core core, ServiceWorkerHost impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                ServiceWorkerHost_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case SET_CACHED_METADATA_ORDINAL: {
            
                        ServiceWorkerHostSetCachedMetadataParams data =
                                ServiceWorkerHostSetCachedMetadataParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().setCachedMetadata(data.url, data.data);
                        return true;
                    }
            
            
            
            
            
                    case CLEAR_CACHED_METADATA_ORDINAL: {
            
                        ServiceWorkerHostClearCachedMetadataParams data =
                                ServiceWorkerHostClearCachedMetadataParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().clearCachedMetadata(data.url);
                        return true;
                    }
            
            
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), ServiceWorkerHost_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
            
            
            
            
                    case GET_CLIENTS_ORDINAL: {
            
                        ServiceWorkerHostGetClientsParams data =
                                ServiceWorkerHostGetClientsParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().getClients(data.options, new ServiceWorkerHostGetClientsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
            
            
            
            
            
                    case CLAIM_CLIENTS_ORDINAL: {
            
                        ServiceWorkerHostClaimClientsParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().claimClients(new ServiceWorkerHostClaimClientsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ServiceWorkerHostSetCachedMetadataParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public byte[] data;
    
        private ServiceWorkerHostSetCachedMetadataParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostSetCachedMetadataParams() {
            this(0);
        }
    
        public static ServiceWorkerHostSetCachedMetadataParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostSetCachedMetadataParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostSetCachedMetadataParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostSetCachedMetadataParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostSetCachedMetadataParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.data = decoder0.readBytes(16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.data, 16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
            ServiceWorkerHostSetCachedMetadataParams other = (ServiceWorkerHostSetCachedMetadataParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.url, other.url))
                return false;
            if (!java.util.Arrays.equals(this.data, other.data))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.url);
            result = prime * result + java.util.Arrays.hashCode(this.data);
            return result;
        }
    }



    
    static final class ServiceWorkerHostClearCachedMetadataParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
    
        private ServiceWorkerHostClearCachedMetadataParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostClearCachedMetadataParams() {
            this(0);
        }
    
        public static ServiceWorkerHostClearCachedMetadataParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostClearCachedMetadataParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostClearCachedMetadataParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostClearCachedMetadataParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostClearCachedMetadataParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
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
            
            encoder0.encode(this.url, 8, false);
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
            ServiceWorkerHostClearCachedMetadataParams other = (ServiceWorkerHostClearCachedMetadataParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.url, other.url))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.url);
            return result;
        }
    }



    
    static final class ServiceWorkerHostGetClientsParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public ServiceWorkerClientQueryOptions options;
    
        private ServiceWorkerHostGetClientsParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostGetClientsParams() {
            this(0);
        }
    
        public static ServiceWorkerHostGetClientsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostGetClientsParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostGetClientsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostGetClientsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostGetClientsParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.options = ServiceWorkerClientQueryOptions.decode(decoder1);
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
            
            encoder0.encode(this.options, 8, false);
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
            ServiceWorkerHostGetClientsParams other = (ServiceWorkerHostGetClientsParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.options, other.options))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.options);
            return result;
        }
    }



    
    static final class ServiceWorkerHostGetClientsResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public ServiceWorkerClientInfo[] clients;
    
        private ServiceWorkerHostGetClientsResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostGetClientsResponseParams() {
            this(0);
        }
    
        public static ServiceWorkerHostGetClientsResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostGetClientsResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostGetClientsResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostGetClientsResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostGetClientsResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.clients = new ServiceWorkerClientInfo[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.clients[i1] = ServiceWorkerClientInfo.decode(decoder2);
                        }
                    }
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
            
            if (this.clients == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.clients.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.clients.length; ++i0) {
                    
                    encoder1.encode(this.clients[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
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
            ServiceWorkerHostGetClientsResponseParams other = (ServiceWorkerHostGetClientsResponseParams) object;
            if (!java.util.Arrays.deepEquals(this.clients, other.clients))
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
            result = prime * result + java.util.Arrays.deepHashCode(this.clients);
            return result;
        }
    }

    static class ServiceWorkerHostGetClientsResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ServiceWorkerHost.GetClientsResponse mCallback;

        ServiceWorkerHostGetClientsResponseParamsForwardToCallback(ServiceWorkerHost.GetClientsResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_CLIENTS_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ServiceWorkerHostGetClientsResponseParams response = ServiceWorkerHostGetClientsResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.clients);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ServiceWorkerHostGetClientsResponseParamsProxyToResponder implements ServiceWorkerHost.GetClientsResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostGetClientsResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(ServiceWorkerClientInfo[] clients) {
            ServiceWorkerHostGetClientsResponseParams _response = new ServiceWorkerHostGetClientsResponseParams();

            _response.clients = clients;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_CLIENTS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class ServiceWorkerHostClaimClientsParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    
        private ServiceWorkerHostClaimClientsParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostClaimClientsParams() {
            this(0);
        }
    
        public static ServiceWorkerHostClaimClientsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostClaimClientsParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostClaimClientsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostClaimClientsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostClaimClientsParams(mainDataHeader.elementsOrVersion);
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
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
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            return result;
        }
    }



    
    static final class ServiceWorkerHostClaimClientsResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;
        public String errorMsg;
    
        private ServiceWorkerHostClaimClientsResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ServiceWorkerHostClaimClientsResponseParams() {
            this(0);
        }
    
        public static ServiceWorkerHostClaimClientsResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerHostClaimClientsResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ServiceWorkerHostClaimClientsResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerHostClaimClientsResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ServiceWorkerHostClaimClientsResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.error = decoder0.readInt(8);
                        ServiceWorkerErrorType.validate(result.error);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.errorMsg = decoder0.readString(16, true);
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
            
            encoder0.encode(this.error, 8);
            
            encoder0.encode(this.errorMsg, 16, true);
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
            ServiceWorkerHostClaimClientsResponseParams other = (ServiceWorkerHostClaimClientsResponseParams) object;
            if (this.error!= other.error)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.errorMsg, other.errorMsg))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.error);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.errorMsg);
            return result;
        }
    }

    static class ServiceWorkerHostClaimClientsResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ServiceWorkerHost.ClaimClientsResponse mCallback;

        ServiceWorkerHostClaimClientsResponseParamsForwardToCallback(ServiceWorkerHost.ClaimClientsResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(CLAIM_CLIENTS_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ServiceWorkerHostClaimClientsResponseParams response = ServiceWorkerHostClaimClientsResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.error, response.errorMsg);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ServiceWorkerHostClaimClientsResponseParamsProxyToResponder implements ServiceWorkerHost.ClaimClientsResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostClaimClientsResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer error, String errorMsg) {
            ServiceWorkerHostClaimClientsResponseParams _response = new ServiceWorkerHostClaimClientsResponseParams();

            _response.error = error;

            _response.errorMsg = errorMsg;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CLAIM_CLIENTS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
