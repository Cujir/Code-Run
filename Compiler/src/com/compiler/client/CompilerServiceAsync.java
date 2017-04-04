package com.compiler.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CompilerServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
